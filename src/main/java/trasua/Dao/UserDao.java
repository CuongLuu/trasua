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

	public taikhoan GetAccountAdmin(taikhoan user) {
		try {
		String sql = "SELECT * FROM taikhoan WHERE status =1 and email ='" + user.getEmail() + "' ";

		taikhoan u = _jdbcTemplate.queryForObject(sql, new MapperTaiKhoan());
		return u;
		}catch(Exception e){
			return null;
			
		}
		
	
};}

