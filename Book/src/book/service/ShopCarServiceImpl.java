package book.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import book.dao.ShopCarDaoImpl;

@Service
@Transactional(readOnly=false)
public class ShopCarServiceImpl {

	@Resource
	private ShopCarDaoImpl carDaoImpl;
	
	public void saveCar(int price,String img,int count,int user_id) {
		carDaoImpl.saveShopcar(price, img,count,user_id);
	}
}
