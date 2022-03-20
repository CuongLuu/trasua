package trasua.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import trasua.Dao.HomeDao;
import trasua.Entity.loaisanpham;
import trasua.Entity.sanpham;

@Service
public class HomeServiceImpl implements IHomeService {
	@Autowired 
	HomeDao SanPhamDao;
	@Autowired
	HomeDao loaisanpham;

	public List<sanpham> GetDataSlide() {

		return SanPhamDao.GetDataSlide();
	}
	
	public List<loaisanpham> GetDataloaiSP() {

		return loaisanpham.GetDataloaiSP();
	}
}