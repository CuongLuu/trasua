package trasua.Entity;

public class giohang {
	private int quanty;
	private double total;
	
	public giohang() {
		
	}
	
	public giohang(int quanty, double total) {
		super();
		this.quanty = quanty;
		this.total = total;
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
	
}
