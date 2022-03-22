package trasua.Entity;

public class giohang {
	private long quanty;
	private double total;
	private sanpham product;
	
	
	
	public giohang() {
	}
	
	public giohang(long quanty, double total, sanpham product) {
		super();
		this.quanty = quanty;
		this.total = total;
		this.product = product;
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
	public sanpham getProduct() {
		return product;
	}
	public void setProduct(sanpham product) {
		this.product = product;
	}
	
	
	
}
