package book.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import book.entity.Orders;

@Repository
public class FindOrderDaoImpl {
	
	@Resource
	private SessionFactory sessionFactory;
	
	public List<Orders> find(){
		Query q=this.sessionFactory.getCurrentSession().createQuery("from Orders");
		return q.list();
	}
}
