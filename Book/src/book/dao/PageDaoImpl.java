package book.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import book.entity.Book;

@Repository
public class PageDaoImpl {
	
	@Resource
	private SessionFactory sessionFactory;
	
	 public List<Book> queryForPage(int offset, int length) {
	       Query query= (Query) sessionFactory.getCurrentSession().createQuery("from Book");    
	        query.setFirstResult(offset);
	        query.setMaxResults(length);            
	        return query.list(); 
	       }

	     public int getAllRowCount(){
	         int count=((Long) sessionFactory.getCurrentSession()
	                .createQuery( "select count(*) from Book").iterate().next()).intValue();
	         return count;  
	     }
	}
