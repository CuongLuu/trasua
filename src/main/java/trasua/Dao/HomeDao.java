package trasua.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import Entity.Mapper;
import Entity.sanpham;

@Repository
public class HomeDao {
	@Autowired
	public JdbcTemplate _jdbcTemplate;
	
	public List<sanpham> GetDataSlide(){
		List<sanpham> list = new ArrayList<sanpham>();
		String sql = "SELECT * FROM sanpham";
		list = _jdbcTemplate.query(sql, new Mapper());
		return list;
	} 
}
