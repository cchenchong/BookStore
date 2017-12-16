package book.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import book.dao.SearchDaoImpl;
import book.entity.Book;
import book.entity.Page;

@Service
@Transactional(readOnly=true)
public class SearchServiceImpl {

	@Resource
	private SearchDaoImpl searchDaoimpl;
	
	public List<Book> findByname(String name) {
		return searchDaoimpl.findByname(name);
	}
	public Page queryForPage(int currentPage,int pageSize,String name) {
        Page page = new Page();       
        int allRow = searchDaoimpl.getAllRowCount( name);
        int offset = page.countOffset(currentPage,pageSize);  
        List<Book> list = searchDaoimpl.queryForPage(offset, pageSize,name); 
        page.setPageNo(currentPage);
        page.setPageSize(pageSize);
        page.setTotalRecords(allRow);
        page.setList(list);    
        return page;
    }
    public int ServicegetCount(String name){
        return searchDaoimpl.getAllRowCount(name);
    }
}
