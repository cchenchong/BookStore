package book.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import book.dao.LoginDaoImpl;
import book.entity.User;

@Service
@Transactional(readOnly=true)
public class LoginServiceImpl {
	@Resource
	private LoginDaoImpl loginDaoImpl;
	
	public List<User> listAll(){
		return this.loginDaoImpl.findAll();
	}
}
