package com.x.web.dao.hibernate;

import junit.framework.TestCase;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.PlatformTransactionManager;

public class BaseTestCase extends TestCase {
	protected static Logger log = LoggerFactory.getLogger(BaseTestCase.class);

	protected ApplicationContext ac = null;
	protected PlatformTransactionManager  tm = null;
	
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		
		ac = new ClassPathXmlApplicationContext("ApplicationContext_test.xml");
		tm = (PlatformTransactionManager ) ac.getBean("transactionManager");

//		System.out.println(ac.getBeanDefinitionCount());
//		for (String i:ac.getBeanDefinitionNames()) {
//			System.out.println(i);
//		}
	}
}
