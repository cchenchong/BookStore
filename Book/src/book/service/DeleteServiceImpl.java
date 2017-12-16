package book.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import book.dao.DeleteDaoImpl;
import book.entity.BookCar;

@Service
@Transactional(readOnly=true)
public class DeleteServiceImpl {

	@Resource
	private DeleteDaoImpl deleteDaoimpl;
	
	public void delete(int id) {
		deleteDaoimpl.delete(id);
	}
	public List<BookCar> findAll() {
		return deleteDaoimpl.findAll();
	}
}
