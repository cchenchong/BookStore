package book.dao;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import book.entity.Book;

@Repository
public class DetailDaoImpl {

	@Resource
	private SessionFactory sessionFactory;
	
	public Book findById(int id) {
		Book book = (Book)sessionFactory.getCurrentSession().get(Book.class, id);
		return book;
	}
}
