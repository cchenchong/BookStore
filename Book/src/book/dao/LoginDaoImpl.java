package book.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import book.entity.User;
@Repository
public class LoginDaoImpl {
	@Resource
	private SessionFactory sessionFactory;
	public List<User> findAll(){
		Query q=this.sessionFactory.getCurrentSession().createQuery("from User");
		return q.list();
	}
}
