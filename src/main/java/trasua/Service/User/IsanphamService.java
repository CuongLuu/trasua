package trasua.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import trasua.Entity.sanpham;



@Service
public interface IsanphamService {
	@Autowired 
	public List<sanpham> GetProductByID(long id);

}
