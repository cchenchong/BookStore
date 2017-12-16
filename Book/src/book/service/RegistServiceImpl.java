package book.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import book.dao.RegistDaoImpl;
@Service
@Transactional(readOnly=false)
public class RegistServiceImpl {
	
	@Resource
	private RegistDaoImpl registDaoImpl;
	
	public void regist(int i,String name,String psw,String e,String t,String a){
		System.out.println(name + psw);
		this.registDaoImpl.saveUser(i,name,psw,e,t,a);
	}
}
