package book.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import book.dao.UpdateDaoImpl;
import book.entity.BookCar;

@Service
@Transactional(readOnly=false)
public class UpdateServiceImpl {

	@Resource
	private UpdateDaoImpl updateDaoimpl;
	
	public void update(int id,int count) {
		updateDaoimpl.update(id, count);
	}
	public List<BookCar> findAll() {
		return updateDaoimpl.findAll();
	}
}
