package com.oracle.common;

import java.util.List;
/**
 * ��ҳ��Ϣ�ࣺ�����˹��ڷ�ҳ���������ݣ�
 * @author Administrator
 *
 */
public class PageInfo {
	
	//�����Action����
	String action;
	
	//����
	List list;
	
	//�ܼ�¼��
	int recordCount;
	
	//��ҳ��
	int pageCount;
	
	//��ǰҳ��
	int currentPage=1;
	
	//ÿҳ��¼��
	int pageSize=5;
	
	

	public PageInfo() {
		super();
	}

	public PageInfo(String action, int currentPage) {
		super();
		this.action = action;
		this.currentPage = currentPage;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public List getList() {
		return list;
	}

	public void setList(List list) {
		this.list = list;
	}

	public int getRecordCount() {
		return recordCount;
	}

	public void setRecordCount(int recordCount) {
		this.recordCount = recordCount;
	}

	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

}
