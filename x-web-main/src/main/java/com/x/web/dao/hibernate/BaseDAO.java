package com.x.web.dao.hibernate;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.hibernate.Criteria;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.x.web.util.Paginator;
/**
 * 
 * @author sqlxx
 *
 * @param <T>
 * @param <ID>
 */
public abstract class BaseDAO<T, ID extends Serializable> extends
		HibernateDaoSupport {

	private Class<T> persistentClass;

	@SuppressWarnings("unchecked")
	public BaseDAO() {
		this.persistentClass = (Class<T>) ((ParameterizedType) getClass()
				.getGenericSuperclass()).getActualTypeArguments()[0];

	}

	@Resource(name = "sessionFactory")
	public void setSuperSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	public T saveOrUpdate(final T object) {
		getHibernateTemplate().saveOrUpdate(object);
		return object;
	}

	public List<T> listAll() {
		return getHibernateTemplate().loadAll(persistentClass);
	}
	
	public T findById(final ID id) {
		return getHibernateTemplate().get(persistentClass, id);
	}

	public T findById(final ID id, final LockMode lockMode) {
		return getHibernateTemplate().get(persistentClass, id, lockMode);
	}

	public void delete(T object) {
		getHibernateTemplate().delete(object);
	}

	public void deleteAll(Collection<T> objects) {
		getHibernateTemplate().deleteAll(objects);
	}

	@SuppressWarnings("unchecked")
	public List<T> findByCriteria(Criterion... criterion) {
		Criteria criteria = createCriteria(criterion);
		return criteria.list();
	}

	@SuppressWarnings("unchecked")
	public T findOneByCriteria(Criterion... criterion) {
		Criteria criteria = createCriteria(criterion);
		return (T) criteria.uniqueResult();
	}
	
	@SuppressWarnings("unchecked")
	public T findOneByQuery(String hql, Object... values) {
		Query query = createQuery(hql, values);
		return (T) query.uniqueResult();
	}
	
	@SuppressWarnings("unchecked")
	public T findOneByQuery(String hql, Map<String, ?> values) {
		Query query = createQuery(hql, values);
		return (T) query.uniqueResult();
	}
	
	@SuppressWarnings("unchecked")
	public List<T> findByQuery(String hql, Object... values) {
		Query query = createQuery(hql, values);
		return  query.list();
	}
	
	@SuppressWarnings("unchecked")
	public List<T> findByQuery(String hql, Map<String, ?> values) {
		Query query = createQuery(hql, values);
		
		return query.list();
	}
	
	public Criteria createCriteria(Criterion... criterion) {
		Criteria criteria = getSession().createCriteria(persistentClass);
		
		for (Criterion c : criterion) {
			criteria.add(c);
		}
		
		return criteria;
	}

	public Query createQuery(String hql, Object... values) {
		Query query = getSession().createQuery(hql);

		for (int i = 0; i < values.length; i++) {
			query.setParameter(i, values[i]);
		}

		return query;
	}

	public Query createQuery(String hql, Map<String, ?> values) {
		Query query = getSession().createQuery(hql);
		query.setProperties(values);
		
		return query;
	}

	@SuppressWarnings("unchecked")
	public Paginator<T> findPage(Paginator<T> paginator, String hql, Map<String, ?> values) {
		Query query = getSession().createQuery(hql);
		query = setPagingPara(query, paginator);
		paginator.setCurrentPage(query.list());
		
		return paginator;
	}
	
	@SuppressWarnings("unchecked")
	public Paginator<T> findPage(Paginator<T> paginator, String hql, Object... values) {
		Query query = getSession().createQuery(hql);
		query = setPagingPara(query, paginator);
		paginator.setCurrentPage(query.list());
		
		return paginator;
	}
	
	@SuppressWarnings("unchecked")
	public Paginator<T> findPage(Paginator<T> paginator, Criterion... criterion) {
		Criteria criteria = createCriteria(criterion);
		criteria = setPagingPara(criteria, paginator);
		paginator.setCurrentPage(criteria.list());
		
		return paginator;
	}
	
	@SuppressWarnings("unchecked")
	public Paginator<T> listAllByPage(Paginator<T> paginator) {
		Criteria criteria = getSession().createCriteria(persistentClass);
		criteria = setPagingPara(criteria, paginator);
		paginator.setCurrentPage(criteria.list());
		
		return paginator;
	}
	protected Criteria setPagingPara(Criteria criteria, Paginator<T> paginator) {
		criteria.setMaxResults(paginator.getPageSize());
		criteria.setFirstResult((paginator.getCurrentPageNum() - 1)
				* paginator.getPageSize());
		return criteria;
	}
	
	protected Query setPagingPara(Query query, Paginator<T> paginator) {
		query.setMaxResults(paginator.getPageSize());
		query.setFirstResult((paginator.getCurrentPageNum() - 1)
				* paginator.getPageSize());
		return query;
	}
}
