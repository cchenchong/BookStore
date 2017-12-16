package book.dao;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import book.entity.Book;

@Repository
public class BookUpdateDaoImpl {
	@Resource
	private SessionFactory sessionFactory;
	public void update(int id,String name,String author,String publisher,int price,String description) {
		Book book = sessionFactory.getCurrentSession().get(Book.class,id);
		book.setBookname(name);
		book.setAuthor(author);
		book.setPublisher(publisher);
		book.setPrice(price);
		book.setDescription(description);
		Session s=this.sessionFactory.openSession();
		Transaction tr=s.beginTransaction();
		s.update(book);
		tr.commit();
		s.close();
	}
	public Book find(int id) {
		Book book = sessionFactory.getCurrentSession().get(Book.class,id);
		return book;
	}
}
