package Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Entity.sanpham;
import trasua.Dao.HomeDao;

@Service
public class HomeServiceImpl implements IHomeService {
	@Autowired
	private HomeDao SanPhamDao;

	public List<sanpham> GetDataSlide() {

		return SanPhamDao.GetDataSlide();
	}
}
