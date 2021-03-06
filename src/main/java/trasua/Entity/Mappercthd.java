package trasua.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class Mappercthd implements RowMapper<cthd> {

	@Override
	public cthd mapRow(ResultSet rs, int rowNum) throws SQLException {
		cthd cthd = new cthd();

		cthd.setMaCT(rs.getInt("maCT"));
		cthd.setMaHoaDon(rs.getInt("maHoaDon"));
		cthd.setMaSanPham(rs.getInt("maSanPham"));
		cthd.setQuanty(rs.getInt("quanty"));
		cthd.setTotal(rs.getFloat("total"));
		return cthd;
	}
}
