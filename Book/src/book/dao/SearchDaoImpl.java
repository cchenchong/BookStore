package book.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import book.entity.Book;

@Repository
public class SearchDaoImpl {

	@Resource
	private SessionFactory sessionFactory;
	public List<Book> findByname(String name) {
		Query q = sessionFactory.getCurrentSession().createQuery("from Book where bookname = ?");
		q.setParameter(0, name);
		return q.list();
	}
	public List<Book> queryForPage(int offset, int length,String name) {
	       Query query= (Query) sessionFactory.getCurrentSession().createQuery("from Book where bookname like '%" + name + "%'"); 
	        query.setFirstResult(offset);
	        query.setMaxResults(length);            
	        return query.list(); 
	       }

	     public int getAllRowCount(String bookname){
	         int count=((Long) sessionFactory.getCurrentSession()
	                .createQuery( "select count(*) from Book where bookname like '%" + bookname + "%'").iterate().next()).intValue();
	         return count;  
	     }
}
