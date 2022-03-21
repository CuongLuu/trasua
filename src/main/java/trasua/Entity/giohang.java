package trasua.Entity;

public class giohang {
	private int quanty;
	private double total;
	private sanpham product;
	
	
	
	public giohang() {
	}
	
	public giohang(int quanty, double total, sanpham product) {
		super();
		this.quanty = quanty;
		this.total = total;
		this.product = product;
	}
	
	public int getQuanty() {
		return quanty;
	}
	public void setQuanty(int quanty) {
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
