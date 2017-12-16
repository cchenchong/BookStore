package book.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import book.dao.BookUpdateDaoImpl;
import book.entity.Book;

@Service
@Transactional(readOnly=false)
public class BookUpdateServiceImpl {

	@Resource
	private BookUpdateDaoImpl bookupdateDapimpl;
	public void update(int id,String name,String author,String publisher,int price,String description) {
		bookupdateDapimpl.update(id, name,author,publisher,price,description);
	}
	public Book find (int id) {
		return bookupdateDapimpl.find(id);
	}
	
}
