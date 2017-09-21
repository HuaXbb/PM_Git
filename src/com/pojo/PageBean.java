package com.pojo;

import java.util.List;

public class PageBean<T>{
	private int pageNum;//当前页码
	private int totalPage;//总页数
	private int perPage;//没页记录数
	private int totalRecord;//总记录数
	private List<T> data;//数据
	public int getPageNum() {
		return pageNum;
	}
	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	public int getPerPage() {
		return perPage;
	}
	public void setPerPage(int perPage) {
		this.perPage = perPage;
	}
	public int getTotalRecord() {
		return totalRecord;
	}
	public void setTotalRecord(int totalRecord) {
		this.totalRecord = totalRecord;
	}
	public List<T> getData() {
		return data;
	}
	public void setData(List<T> data) {
		this.data = data;
	}

	public PageBean() {
		// TODO Auto-generated constructor stub
	}
	public PageBean(int pageNum, int totalPage, int perPage, int totalRecord,
			List<T> data) {
		this.pageNum = pageNum;
		this.totalPage = totalPage;
		this.perPage = perPage;
		this.totalRecord = totalRecord;
		this.data = data;
	}
	@Override
	public String toString() {
		return "PageBean [pageNum=" + pageNum + ", totalPage=" + totalPage
				+ ", perPage=" + perPage + ", totalRecord=" + totalRecord
				+ ", data=" + data + "]";
	}
	
	
	
}	
