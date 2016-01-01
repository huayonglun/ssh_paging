package com.oracle.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.oracle.common.PageInfo;
import com.oracle.po.Book;
import com.oracle.service.BookService;


@Controller
@Scope("prototype")
public class BookAction extends ActionSupport implements ModelDriven<Book> {

	
	PageInfo pageInfo=new PageInfo();
	
	public PageInfo getPageInfo() {
		return pageInfo;
	}


	public void setPageInfo(PageInfo pageInfo) {
		this.pageInfo = pageInfo;
	}
	
	//定义一个模型
	Book book=new Book();
	
	@Override
	public Book getModel() {
		
		return book;
	}
	
	//注入service
	@Autowired
	BookService bookService;
	
	
	public String save(){
		bookService.save(book);
		
		return "list";
	}
	
	
	public String getAll(){
		pageInfo.setAction("book_getAll");
		//设置每页记录数
		pageInfo.setPageSize(4);
		bookService.getAll(pageInfo);
		return SUCCESS;
	}
	
	

}
