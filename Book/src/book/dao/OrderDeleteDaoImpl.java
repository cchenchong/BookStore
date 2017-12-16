package book.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import book.entity.Orders;

@Repository
public class OrderDeleteDaoImpl {
	@Resource
	private SessionFactory sessionFactory;
	
	public void delete(int id) {
		Orders orders = (Orders)sessionFactory.getCurrentSession().get(Orders.class, id);
		Session s=this.sessionFactory.openSession();
		Transaction tr=s.beginTransaction();
		s.delete(orders);
		tr.commit();
		s.close();
	}
	public List<Orders> find(){
		Query q=this.sessionFactory.getCurrentSession().createQuery("from Orders");
		return q.list();
	}
}
