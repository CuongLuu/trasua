package trasua.Entity;

public class cthd {
	private int maCT;
	private int maSanPham;
	private int maHoaDon;
	private int quanty;
	private float total;
	
	/*
	 * public cthd() {
	 * 
	 * } public cthd(int maCT, int maSanPham, int maHoaDon, int quanty, float total)
	 * { super(); this.maCT = maCT; this.maSanPham = maSanPham; this.maHoaDon =
	 * maHoaDon; this.quanty = quanty; this.total = total; }
	 */
	
	public cthd() {
		super();
	}
	
	public int getMaCT() {
		return maCT;
	}
	public void setMaCT(int maCT) {
		this.maCT = maCT;
	}
	public int getMaSanPham() {
		return maSanPham;
	}
	public void setMaSanPham(int maSanPham) {
		this.maSanPham = maSanPham;
	}
	public int getMaHoaDon() {
		return maHoaDon;
	}
	public void setMaHoaDon(int maHoaDon) {
		this.maHoaDon = maHoaDon;
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
