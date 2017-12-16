package book.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import book.dao.BookDeleteDaoImpl;
import book.entity.Book;

@Service
@Transactional(readOnly=true)
public class BookDeleteServiceImpl {
	@Resource
	private BookDeleteDaoImpl bookdeleteDaoimpl;
	public void delete(int id) {
		bookdeleteDaoimpl.delete(id);
	}
	public List<Book> findAll(){
		return bookdeleteDaoimpl.findAll();
	}
}
