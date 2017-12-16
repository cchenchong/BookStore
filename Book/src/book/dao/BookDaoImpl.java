package book.dao;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import book.entity.Book;

@Repository
public class BookDaoImpl {
	@Resource
	private SessionFactory sessionFactory;
	public Book find(int id) {
		Book book = sessionFactory.getCurrentSession().get(Book.class,id);
		return book;
	}
}
