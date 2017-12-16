package book.dao;

import javax.annotation.Resource;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import book.entity.User;

@Repository
public class RegistDaoImpl {

	@Resource
	private SessionFactory sessionFactory;
	public void saveUser(int i ,String name,String psw,String e,String t,String a){
//		
		User ul=new User();
		ul.setId(i);
		ul.setName(name);
		ul.setPassword(psw);
		ul.setEmail(e);
		ul.setTel(t);
		ul.setAddress(a);
		Session s=this.sessionFactory.openSession();
		Transaction tr=s.beginTransaction();
		s.save(ul);
		tr.commit();
		s.close();
	}
}
