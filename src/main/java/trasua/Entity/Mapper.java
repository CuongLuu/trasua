package trasua.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class Mapper implements RowMapper<sanpham> {
	public sanpham mapRow(ResultSet rs, int rowNum) throws SQLException {
		sanpham sp = new sanpham();
		sp.setMaSanPham(rs.getInt("maSanPham"));
		sp.setMaLoaiSanPham(rs.getInt("maLoaiSanPham"));
		sp.setTenSanPham(rs.getString("tenSanPham"));
		sp.setHinhAnh(rs.getString("hinhAnh"));
		sp.setGiaBan(rs.getFloat("giaBan"));
		sp.setNgayTao(rs.getDate("ngayTao"));
		sp.setNgayCapNhat(rs.getDate("ngayCapNhat"));
		return sp;
	}
}
