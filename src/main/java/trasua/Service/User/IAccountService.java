package trasua.Service.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import trasua.Entity.taikhoan;

@Service
public interface IAccountService {
	@Autowired
	public int AddAccount (taikhoan user);
	
}
