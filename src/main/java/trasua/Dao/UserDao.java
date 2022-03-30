package trasua.Dao;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Repository;

import trasua.Entity.MapperTaiKhoan;
import trasua.Entity.taikhoan;
@Repository
public class UserDao extends BaseDao {
	public int AddAccount(taikhoan user) {
		try {
			String sql = "INSERT INTO taikhoan (id, email, matKhau, tenNguoiDung, diaChi, sdt, ngayTao, ngayCapNhat, status, hinhanh) VALUES ('"
					+ user.getId() + "','" + user.getEmail() + "','" + user.getMatKhau() + "',N'" + user.getTenNguoiDung() + "',N'" + user.getDiaChi() + "','"
					+ user.getSdt() + "','" + getDateNow().toString() + "','" + getDateNow().toString() + "','"
					+ user.getStatus() + "','" + user.getHinhanh() + "')";

			int insert = _jdbcTemplate.update(sql.toString());
			return insert;
	} catch(Exception e){
		return 0;
		
	}

		
	}
	public taikhoan GetAccount(taikhoan user) {
		try {
			String sql = "SELECT * FROM taikhoan WHERE status =0 and email ='" + user.getEmail() + "' ";

			taikhoan u = _jdbcTemplate.queryForObject(sql, new MapperTaiKhoan());
			return u;
			}catch(Exception e){
				return null;
				
			}
			
		
	};
	
	public String getDateNow() {
		LocalDateTime now = LocalDateTime.now();
		return dtf.format(now);
	}
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
<<<<<<< HEAD
	
<<<<<<< HEAD
	
	public taikhoan GetAccountAdmin(taikhoan user) {
		try {
		String sql = "SELECT * FROM taikhoan WHERE status =1 and email ='" + user.getEmail() + "' ";

		taikhoan u = _jdbcTemplate.queryForObject(sql, new MapperTaiKhoan());
		return u;
		}catch(Exception e){
			return null;
			
		}
		
	
};

=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> refs/remotes/origin/minh
=======
>>>>>>> 85f30fd83e0e2974f2ee87b751d0e01e9330bbf6
>>>>>>> 418d53e0ce486259fe99ae7c978b14eaaf959d33
=======
	DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
>>>>>>> 20fc8b644522b0aeb5ee11eb79478f4dde3086fd
<<<<<<< HEAD
=======
>>>>>>> c7b8b054995cd8f2dc60b42b86e731b4653b4577
>>>>>>> 85f30fd83e0e2974f2ee87b751d0e01e9330bbf6
}
