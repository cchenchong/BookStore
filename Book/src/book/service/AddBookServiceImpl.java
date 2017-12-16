package book.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import book.dao.AddBookDaoImpl;

@Service
@Transactional(readOnly=true)
public class AddBookServiceImpl {
	@Resource
	private AddBookDaoImpl addBookDaoimpl;
	public void save(String name,String img,String author,String publisher,int price,String description) {
		addBookDaoimpl.save(name,img,author,publisher,price,description);
	}
}
