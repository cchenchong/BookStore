package book.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import book.dao.DetailDaoImpl;
import book.entity.Book;

@Service
@Transactional(readOnly=true)
public class DetailServiceImpl {
	
	@Resource
	private DetailDaoImpl detailDaoimpl;
	
	public Book findById(int id) {
		return detailDaoimpl.findById(id);
	}
}
