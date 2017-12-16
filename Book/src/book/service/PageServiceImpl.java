package book.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import book.dao.PageDaoImpl;
import book.entity.Book;
import book.entity.Page;

@Service
@Transactional(readOnly=true)
public class PageServiceImpl {
	
	@Resource
	private PageDaoImpl pageDaoimpl;
	
	public Page queryForPage(int currentPage,int pageSize) {
        Page page = new Page();       
        int allRow = pageDaoimpl.getAllRowCount();
        int offset = page.countOffset(currentPage,pageSize);  
        List<Book> list = pageDaoimpl.queryForPage(offset, pageSize); 
        page.setPageNo(currentPage);
        page.setPageSize(pageSize);
        page.setTotalRecords(allRow);
        page.setList(list);    
        return page;
    }
    public int ServicegetCount(){
        return pageDaoimpl.getAllRowCount();
    }
}
