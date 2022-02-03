
public class Jarro {
	
	private int maxLiters;

	private int Liters;
	
	
	public Jarro(int maxLiters) {
	
		this.maxLiters = maxLiters;
		this.Liters = 0;
	}
	//getters and settrs
	public int getLiters() {
		return Liters;
	}

	public void setLiters(int Liters) {
		this.Liters = Liters;
	}
	public int getMaxLiters() {
		return maxLiters;
	}
	public boolean isFull() {
		if(this.Liters == this.maxLiters) return true;
		return false;
	}
	public boolean isEmpty() {
		if(this.Liters == 0) return true;
		return false;
	}
	
	

}
