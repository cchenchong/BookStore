package book.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import book.dao.BookDaoImpl;
import book.entity.Book;

@Service
@Transactional(readOnly=true)
public class BookServiceImpl {
	@Resource
	private BookDaoImpl bookDaoimpl;
	public Book find(int id) {
		return bookDaoimpl.find(id);
	}
}
