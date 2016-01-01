package com.oracle.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.oracle.common.PageInfo;
import com.oracle.po.Book;


@Transactional
public interface BookService {

	public void save(Book book);
	
	public void update(Book book);
	
	public List<Book> getAll();
	
	public void delete(Integer id);
	
	public void getAll(PageInfo info);
}
