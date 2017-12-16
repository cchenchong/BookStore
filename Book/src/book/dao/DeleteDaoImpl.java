package book.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import book.entity.BookCar;

@Repository
public class DeleteDaoImpl {

	@Resource
	private SessionFactory sessionFactory;
	
	public void delete(int id) {
		BookCar car = (BookCar)sessionFactory.getCurrentSession().get(BookCar.class, id);
		Session s=this.sessionFactory.openSession();
		Transaction tr=s.beginTransaction();
		s.delete(car);
		tr.commit();
		s.close();
	}
	public List<BookCar> findAll(){
		Query q=this.sessionFactory.getCurrentSession().createQuery("from BookCar");
		return q.list();
	}
}
