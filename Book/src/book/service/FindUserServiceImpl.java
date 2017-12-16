package book.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import book.dao.FindUserDaoImpl;
import book.entity.User;

@Service
@Transactional(readOnly=true)
public class FindUserServiceImpl {

	@Resource
	private FindUserDaoImpl finuserDaoimpl;
	
	public List<User> listAll(){
		return this.finuserDaoimpl.findAll();
	}
}
