package book.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import book.dao.UserDeleteDaoImpl;
import book.entity.User;

@Service
@Transactional(readOnly=true)
public class UserDeleteServiceImpl {

	@Resource
	private UserDeleteDaoImpl userdeleteDaoimpl;
	public void delete(int id) {
		userdeleteDaoimpl.delete(id);
	}
	public List<User> findAll() {
		return userdeleteDaoimpl.findAll();
	}
}
