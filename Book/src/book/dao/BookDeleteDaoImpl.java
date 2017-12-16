package book.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import book.entity.Book;
@Repository
public class BookDeleteDaoImpl {
	@Resource
	private SessionFactory sessionFactory;
	public void delete(int id) {
		Book book = sessionFactory.getCurrentSession().get(Book.class, id);
		Session s=this.sessionFactory.openSession();
		Transaction tr=s.beginTransaction();
		s.delete(book);
		tr.commit();
		s.close();
	}
	public List<Book> findAll(){
		Query q=this.sessionFactory.getCurrentSession().createQuery("from Book");
		return q.list();
	}
}
