package trasua.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class Mapperhoadon implements RowMapper<hoadon> {

	@Override
	public hoadon mapRow(ResultSet rs, int rowNum) throws SQLException {
		hoadon hoadon = new hoadon();
		hoadon.setMaHoaDon(rs.getInt("maHoaDon"));
		hoadon.setTenNguoiMua(rs.getString("tenNguoiMua"));
		//hoadon.setId(rs.getInt("id"));
		hoadon.setEmail(rs.getString("Email"));
		hoadon.setQuanty(rs.getInt("quanty"));
		hoadon.setTotal(rs.getFloat("total"));
		hoadon.setSdt(rs.getString("sdt"));
		hoadon.setDiaChi(rs.getString("diaChi"));
		return hoadon;
	}
}