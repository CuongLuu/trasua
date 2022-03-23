package trasua.Dao;

import org.springframework.stereotype.Repository;

import trasua.Entity.cthd;
import trasua.Entity.hoadon;

@Repository
public class hoadonDao extends BaseDao {
	public int addhoadon(hoadon bill) {
		StringBuffer sql = new StringBuffer();
		sql.append("INSERT INTO hoadon ");
		sql.append("( ");
		sql.append(" `maHoaDon`, `email`, `tenNguoiMua`, `sdt`, `diaChi`, `ghiChu`, `soLuong`, `tongTien`, `id`");
		sql.append(") ");
		sql.append("VALUES ");
		sql.append("( ");
		sql.append("	'" + bill.getMaHoaDon() + "', ");
		sql.append("	'" + bill.getEmail() + "', ");
		sql.append("	'" + bill.getTenNguoiMua() + "', ");
		sql.append("'	'" + bill.getSdt() + "', ");
		sql.append("	'" + bill.getDiaChi() + "', ");
		sql.append("	'" + bill.getGhiChu() + "', ");
		sql.append("	'" + bill.getQuanty() + "', ");
		sql.append("'	'" + bill.getTotal() + "', ");
		sql.append("'	'" + bill.getId() + "', ");
		sql.append(");");
		int insert = _jdbcTemplate.update(sql.toString());
		return insert;
	};

	public long GetIDLastBills() {
		StringBuffer sql = new StringBuffer();
		sql.append("SELECT MAX(id) FROM hoadon;");
		long id = _jdbcTemplate.queryForObject(sql.toString(), new Object[] {}, Long.class);
		return id;
	};

	public int addcthd(cthd cthd) {
		StringBuffer sql = new StringBuffer();
		sql.append("INSERT INTO cthd ");
		sql.append("( ");
		sql.append("	maCT,");
		sql.append("	maSanPham,");
		sql.append("	maHoaDon,");
		sql.append("	soLuong,");
		sql.append("	giaBan,");
		sql.append(") ");
		sql.append("VALUES ");
		sql.append("( ");
		sql.append("	'" + cthd.getMaCT() + "', ");
		sql.append("	'" + cthd.getMaSanPham() + "', ");
		sql.append("'	'" + cthd.getMaHoaDon() + "', ");
		sql.append("'	'" + cthd.getQuanty() + "', ");
		sql.append("'	'" + cthd.getTotal() + "', ");
		int insert = _jdbcTemplate.update(sql.toString());
		return insert;
	}
}
