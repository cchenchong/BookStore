package book.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import book.dao.OrderDaoImpl;
import book.entity.BookCar;
import book.entity.Orders;

@Service
@Transactional(readOnly=true)
public class OrderServiceImpl {

	@Resource
	private OrderDaoImpl orderDaoimpl;
	
	public List<BookCar> findAll(int id) {
		return orderDaoimpl.findAll(id);
	}
	public void save(int id,String name,String address,String tel,String email,String state) {
		orderDaoimpl.save(id,name,address,tel,email,state);
	}
	public Orders find(int id){
		return orderDaoimpl.find(id);
	}
}
