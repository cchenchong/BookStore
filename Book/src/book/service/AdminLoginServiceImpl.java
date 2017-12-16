package book.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import book.dao.AdminLoginDaoImpl;
import book.entity.Admin;

@Service
@Transactional(readOnly=true)
public class AdminLoginServiceImpl {

	@Resource
	private AdminLoginDaoImpl adminLoginDaoimpl;
	
	public List<Admin> listAll(){
		return this.adminLoginDaoimpl.findAll();
	}
}
