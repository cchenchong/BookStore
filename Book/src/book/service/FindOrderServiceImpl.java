package book.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import book.dao.FindOrderDaoImpl;
import book.entity.Orders;

@Service
@Transactional(readOnly=true)
public class FindOrderServiceImpl {

	@Resource
	private FindOrderDaoImpl findorderDaoimpl;
	public List<Orders> findAll(){
		return findorderDaoimpl.find();
	}
}
