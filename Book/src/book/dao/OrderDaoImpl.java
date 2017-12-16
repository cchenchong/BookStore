package book.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import book.entity.BookCar;
import book.entity.Orders;

@Repository
public class OrderDaoImpl {
	
	@Resource
	private SessionFactory sessionFactory;
	
	public List<BookCar> findAll(int id){
		Query q=this.sessionFactory.getCurrentSession().createQuery("from BookCar where user_id = ?");
		q.setParameter(0,id);
		return q.list();
	}
	public Orders find(int id){
		Orders orders = (Orders)sessionFactory.getCurrentSession().get(Orders.class, id);
		return orders;
	}
	public void save (int id,String name,String address,String tel,String email,String state) {
		Orders orders = new Orders();
		orders.setUser_id(id);
		orders.setName(name);
		orders.setAddress(address);
		orders.setTel(tel);
		orders.setEmail(email);
		orders.setState(state);
		Session s=this.sessionFactory.openSession();
		Transaction tr=s.beginTransaction();
		s.save(orders);
		tr.commit();
		s.close();
	}
}
