package trasua.Entity;

public class hoadon {
	private int maHoaDon;
	private String email;
	private String tenNguoiMua;
	private String sdt;
	private String diaChi;
	private String ghiChu;
	private String ngayMua;
	private int quanty;
	private float total;
	//private int id;
	
	public String getNgayMua() {
		return ngayMua;
	}

	public void setNgayMua(String ngayMua) {
		this.ngayMua = ngayMua;
	}
	
	public hoadon() {
		super();
	}

	/*
	 * public int getId() { return id; }
	 * 
	 * public void setId(int id) { this.id = id; }
	 */

	/*
	 * public hoadon() { }
	 * 
	 * public hoadon(int maHoaDon, String email, String tenNguoiMua, String sdt,
	 * String diaChi, String ghiChu, String ngayMua , int quanty, float total) {
	 * super(); this.maHoaDon = maHoaDon; this.email = email; this.tenNguoiMua =
	 * tenNguoiMua; this.sdt = sdt; this.diaChi = diaChi; this.ghiChu = ghiChu;
	 * this.ngayMua = ngayMua; this.quanty = quanty; this.total = total; //this.id =
	 * id; }
	 */
	
	public int getMaHoaDon() {
		return maHoaDon;
	}
	public void setMaHoaDon(int maHoaDon) {
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
	public int getQuanty() {
		return quanty;
	}
	public void setQuanty(int quanty) {
		this.quanty = quanty;
	}
	
	public float getTotal() {
		return total;
	}
	public void setTotal(float total) {
		this.total = total;
	}
}
