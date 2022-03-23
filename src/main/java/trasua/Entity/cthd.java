package trasua.Entity;

public class cthd {
	private long maCT;
	private int maSanPham;
	private long maHoaDon;
	private long quanty;
	private double total;
	
	public cthd() {
		
	}
	public cthd(long maCT, int maSanPham, long maHoaDon, long quanty, double total) {
		super();
		this.maCT = maCT;
		this.maSanPham = maSanPham;
		this.maHoaDon = maHoaDon;
		this.quanty = quanty;
		this.total = total;
	}
	public long getMaCT() {
		return maCT;
	}
	public void setMaCT(long maCT) {
		this.maCT = maCT;
	}
	public int getMaSanPham() {
		return maSanPham;
	}
	public void setMaSanPham(int maSanPham) {
		this.maSanPham = maSanPham;
	}
	public long getMaHoaDon() {
		return maHoaDon;
	}
	public void setMaHoaDon(long maHoaDon) {
		this.maHoaDon = maHoaDon;
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
