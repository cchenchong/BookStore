package book.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import book.dao.OrderDeleteDaoImpl;
import book.entity.Orders;

@Service
@Transactional(readOnly=true)
public class OrderDeleteServiceImpl {

	@Resource
	private OrderDeleteDaoImpl orderDeleteDaoimpl;
	public void delete(int id) {
		orderDeleteDaoimpl.delete(id);
	}
	public List<Orders> find(){
		return orderDeleteDaoimpl.find();
	}
}
