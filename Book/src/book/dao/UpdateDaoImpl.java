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
public class UpdateDaoImpl {
	
	@Resource
	private SessionFactory sessionFactory;
	
	public void update(int id,int count) {
		BookCar car = (BookCar)sessionFactory.getCurrentSession().get(BookCar.class, id);
		car.setCount(count);
		Session s=this.sessionFactory.openSession();
		Transaction tr=s.beginTransaction();
		s.update(car);
		tr.commit();
		s.close();
	}
	public List<BookCar> findAll(){
		Query q=this.sessionFactory.getCurrentSession().createQuery("from BookCar");
		return q.list();
	}
}
