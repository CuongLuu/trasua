package trasua.Service.User;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import trasua.Dao.giohangDao;
import trasua.Entity.giohang;

@Service
public class giohangServiceImpl implements IgiohangService {
	@Autowired
	private giohangDao GiohangDao = new giohangDao();

	@Override
	public HashMap<Long, giohang> addCart(long id, HashMap<Long, giohang> gh) {
		return GiohangDao.addCart(id, gh);
	}

	@Override
<<<<<<< HEAD
	public HashMap<Long, giohang> editCart(long id, int quanty, HashMap<Long, giohang> gh) {
		return GiohangDao.editCart(id, quanty, gh);
=======
	public HashMap<Long, giohang> editCart(long id,int quanty, HashMap<Long, giohang> gh) {
		return GiohangDao.editCart(id, (int)quanty, gh);
>>>>>>> 706223d86c9a677235109c835997a485ee586f19
	}

	@Override
	public HashMap<Long, giohang> deleteCart(long id, HashMap<Long, giohang> gh) {
		return GiohangDao.deleteCart(id, gh);
	}

	@Override
	public int TotalQuanty(HashMap<Long, giohang> gh) {
		return GiohangDao.TotalQuanty(gh);
	}

	@Override
	public double TotalPrice(HashMap<Long, giohang> gh) {
		return GiohangDao.TotalPrice(gh);
	}
}
