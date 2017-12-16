package book.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import book.entity.Book;

@Repository
public class FindBookDaoImpl {
	@Resource
	private SessionFactory sessionFactory;
	public List<Book> findAll(){
		Query q=this.sessionFactory.getCurrentSession().createQuery("from Book");
		return q.list();
	}
}
