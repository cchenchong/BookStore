package book.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import book.dao.BookCarDaoImpl;
import book.entity.BookCar;
import book.entity.User;

@Service
@Transactional(readOnly=true)
public class BookCarServiceImpl {

	@Resource
	private BookCarDaoImpl bookcarDaoimpl;
	
	public List<BookCar> findAll(int id) {
		return bookcarDaoimpl.findAll(id);
	}
	public User findUser(int id) {
		return bookcarDaoimpl.findUser(id);
	}
}
