package book.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import book.entity.Admin;


@Repository
public class AdminLoginDaoImpl {
	
	@Resource
	private SessionFactory sessionFactory;
	
	public List<Admin> findAll(){
		Query q=this.sessionFactory.getCurrentSession().createQuery("from Admin");
		return q.list();
	}
}
