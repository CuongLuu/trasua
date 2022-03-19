package trasua.Service.User;


import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import trasua.Dao.UserDao;
import trasua.Entity.taikhoan;
@Service
public class AccountServiceImpl  implements IAccountService{
	@Autowired
	 UserDao userDao = new UserDao();
	public int AddAccount(taikhoan user)  {
		user.setMatKhau(BCrypt.hashpw(user.getMatKhau(), BCrypt.gensalt(12)));
		return userDao.AddAccount(user);

	}

}
