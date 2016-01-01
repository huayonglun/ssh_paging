package com.oracle.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oracle.common.PageInfo;
import com.oracle.dao.BookDao;
import com.oracle.po.Book;

@Service("bookService")
public class BookServiceImpl implements BookService {

	
	@Autowired
	BookDao<Book> bookDao;
	
	@Override
	public void save(Book book) {
		bookDao.save(book);

	}

	@Override
	public void update(Book book) {
		bookDao.update(book);

	}

	@Override
	public List<Book> getAll() {
		
		return bookDao.getAll(Book.class);
	}

	@Override
	public void delete(Integer id) {
		bookDao.delete(Book.class,id);

	}

	@Override
	public void getAll(PageInfo info) {
		bookDao.getAll(Book.class,info);
		
	}

}
