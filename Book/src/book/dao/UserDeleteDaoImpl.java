package book.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import book.entity.User;

@Repository
public class UserDeleteDaoImpl {
	
	@Resource
	private SessionFactory sessionFactory;
	
	public void delete(int id) {
		User user = (User)sessionFactory.getCurrentSession().get(User.class, id);
		Session s=this.sessionFactory.openSession();
		Transaction tr=s.beginTransaction();
		s.delete(user);
		tr.commit();
		s.close();
	}
	public List<User> findAll(){
		Query q=this.sessionFactory.getCurrentSession().createQuery("from User");
		return q.list();
	}
}
