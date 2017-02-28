//package com.jiangxianze.utils;
//
//
//import java.io.Serializable;
//
//public class Page implements Serializable {
//
//	private Integer pageIndex = 1 ; // 需要显示的页码
//	private Integer totalPages = 0; // 总页数
//	private Integer pageSize = 10; // 每页记录数
//	private Integer totalRecords = 0; // 总记录数
//	private boolean isHavePrePage = false; // 是否有上一页
//	private boolean isHaveNextPage = false; // 是否有下一页
//	private Object pageDatas = new Object(); //返回数据
//
//	public Integer getPageIndex() {
//		return pageIndex;
//	}
//
//	public void setPageIndex(Integer pageIndex) {
//		if (pageIndex != null && pageIndex > 0) {
//			this.pageIndex = pageIndex;
//		} else {
//			this.pageIndex = 1;
//		}
//	}
//
//	public Integer getTotalPages() {
//		if (null == totalPages || 0 == totalPages) {
//			this.totalPages = (totalRecords + pageSize - 1) / pageSize;
//		}
//		return totalPages;
//	}
//
//	public void setTotalPages(Integer totalPages) {
//		this.totalPages = totalPages;
//	}
//
//	public Integer getPageSize() {
//		return pageSize;
//	}
//
//	public void setPageSize(Integer pageSize) {
//		if (pageSize != null && pageSize > 0) {
//			this.pageSize = pageSize;
//		} else {
//			this.pageSize = 25;
//		}
//	}
//
//	public Integer getTotalRecords() {
//		return totalRecords;
//	}
//
//	public void setTotalRecords(Integer totalRecords) {
//		if (totalRecords != null) {
//			this.totalRecords = totalRecords;
//		} else {
//			this.totalRecords = 0;
//		}
//	}
//
//	public boolean isHavePrePage() {
//		return pageIndex == 1;
//	}
//
//	public void setHavePrePage(boolean isHavePrePage) {
//		this.isHavePrePage = isHavePrePage;
//	}
//
//	public boolean isHaveNextPage() {
//		return pageIndex >= totalPages;
//	}
//
//	public void setHaveNextPage(boolean isHaveNextPage) {
//		this.isHaveNextPage = isHaveNextPage;
//	}
//
//	public Object getPageDatas() {
//		return pageDatas;
//	}
//
//	public void setPageDatas(Object pageDatas) {
//		this.pageDatas = pageDatas;
//	}
//
//	@Override
//	public String toString() {
//		return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
//	}
//
//}
