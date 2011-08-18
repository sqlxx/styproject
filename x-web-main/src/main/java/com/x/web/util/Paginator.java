package com.x.web.util;

import java.util.List;

/**
 *  @author sqlxx
 *  
 *  @param <T>
 *  used for both db paging & server paging.
 *  The server paging usually used in Action. e.g.:
 * 		paginator = new Paginator<User>(userMS.listAllUsers(), 30);
 *		allUsers = paginator.page(pageNo);
 *
 * The db paging usually used in Service. e.g.:
 * 
 *     paginator.setCurrentPageNum(pageNo);
 *     paginator = listAllByPage(paginator);
 *     allUsers = paginator.getCurrentPage();
 *     
 *     if you set the needTotal = true, you should also set the total count separately(for db paging):
 *     paginator.setTotalCount(10000);
 */
public class Paginator<T> {
	private int currentPageNum;
	private int totalCount;
	private int pageSize;
	private int totalPage;
	private boolean needTotal;
	
	private List<T> currentPage;
	private List<T> objectList;
	
	//used for db paging
	public Paginator(boolean needTotal, int pageSize) {
		this.needTotal = needTotal;
		this.pageSize = pageSize;
	}
	
	//used for server paging
	public Paginator(List<T> objectList, int pageSize) {
		this.objectList = objectList;
		this.pageSize = pageSize;
		this.totalCount = objectList.size();
		this.totalPage = this.totalCount/this.pageSize + ((this.totalCount%this.pageSize == 0)? 0:1);
		this.needTotal = true;
	}
	//Only used for server paging.
	public List<T> page(int pageNo) {
		this.currentPageNum = pageNo;
		int lastIdx = (pageNo*pageSize);
		currentPage = objectList.subList((pageNo-1)*pageSize, (lastIdx > this.totalCount)? this.totalCount:lastIdx);
		
		return currentPage;
	}
	
	public boolean isHasNextPage() {
		if(needTotal) {
			return this.currentPageNum < this.totalPage;
		} else {
			return currentPage.size() != 0;
		}
		
	}
	
	public boolean isHasPreviousPage() {
		return this.currentPageNum > 1;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	public List<T> getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(List<T> currentPage) {
		this.currentPage = currentPage;
	}

	public int getCurrentPageNum() {
		return currentPageNum;
	}

	public int getPageSize() {
		return pageSize;
	}
	
	public int getNextPageNum() {
		return currentPageNum + 1;
	}
	public int getPreviousPageNum() {
		return currentPageNum - 1;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public boolean isNeedTotal() {
		return needTotal;
	}
	
}
