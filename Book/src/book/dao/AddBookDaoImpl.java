package book.dao;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import book.entity.Book;

@Repository
public class AddBookDaoImpl {
	
	@Resource
	private SessionFactory sessionFactory;
	
	public void save (String name,String img,String author,String publisher,int price,String description) {
		Book book = new Book();
		book.setBookname(name);
		book.setAuthor(author);
		book.setImg(img);
		book.setPrice(price);
		book.setPublisher(publisher);
		book.setDescription(description);
		Session s=this.sessionFactory.openSession();
		Transaction tr=s.beginTransaction();
		s.save(book);
		tr.commit();
		s.close();
	}
}
