package trasua.Entity;

public class hoadon {
	private long maHoaDon;
	private String email;
	private String tenNguoiMua;
	private String sdt;
	private String diaChi;
	private String ghiChu;
	private long quanty;
	private double total;
	private int id;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public hoadon() {
	}
	
	public hoadon(long maHoaDon, String email, String tenNguoiMua, String sdt, String diaChi, String ghiChu,
			long quanty, double total, int id) {
		super();
		this.maHoaDon = maHoaDon;
		this.email = email;
		this.tenNguoiMua = tenNguoiMua;
		this.sdt = sdt;
		this.diaChi = diaChi;
		this.ghiChu = ghiChu;
		this.quanty = quanty;
		this.total = total;
		this.id = id;
	}
	
	public long getMaHoaDon() {
		return maHoaDon;
	}
	public void setMaHoaDon(long maHoaDon) {
		this.maHoaDon = maHoaDon;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTenNguoiMua() {
		return tenNguoiMua;
	}
	public void setTenNguoiMua(String tenNguoiMua) {
		this.tenNguoiMua = tenNguoiMua;
	}
	public String getSdt() {
		return sdt;
	}
	public void setSdt(String sdt) {
		this.sdt = sdt;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public String getGhiChu() {
		return ghiChu;
	}
	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}
	public long getQuanty() {
		return quanty;
	}
	public void setQuanty(long quanty) {
		this.quanty = quanty;
	}
	
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
}
