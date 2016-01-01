package test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.oracle.po.Book;
import com.oracle.service.BookService;

public class Test {
	
	public static void main(String[] args) {
		//创建工厂
		
		BeanFactory factory=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		BookService service=(BookService) factory.getBean("bookService");
		
		
		Book book=new Book("从你的世界经过","李大霄");
		
		book.setBookid(45);
		
		service.save(book);
	}

}
