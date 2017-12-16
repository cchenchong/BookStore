package book.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import book.entity.BookCar;
import book.entity.User;

@Repository
public class BookCarDaoImpl {
	
	@Resource
	private SessionFactory sessionFactory;
	
	public List<BookCar> findAll(int id){
		Query q=this.sessionFactory.getCurrentSession().createQuery("from BookCar where user_id = ?");
		q.setParameter(0,id);
		return q.list();
	}
	public User findUser(int id) {
		User user = (User)sessionFactory.getCurrentSession().get(User.class, id);
		return user;
	}
}
