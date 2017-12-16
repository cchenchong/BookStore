package book.dao;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import book.entity.BookCar;

@Repository
public class ShopCarDaoImpl {
	
	@Resource
	private SessionFactory sessionFactory;
	
	public void saveShopcar(int price,String img,int count,int user_id) {
		BookCar car = new BookCar();
		car.setPrice(price);
		car.setImg(img);
		car.setCount(count);
		car.setUser_id(user_id);
		Session s=this.sessionFactory.openSession();
		Transaction tr=s.beginTransaction();
		s.save(car);
		tr.commit();
		s.close();
	}
}
