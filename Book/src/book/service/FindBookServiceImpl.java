package book.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import book.dao.FindBookDaoImpl;
import book.entity.Book;

@Service
@Transactional(readOnly=true)
public class FindBookServiceImpl {
	@Resource
	private FindBookDaoImpl findbookDaoimpl;
	
	public List<Book> listAll(){
		return this.findbookDaoimpl.findAll();
	}
}
