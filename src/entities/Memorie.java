package entities;

public class Memorie {
	int hasTwin;
	String memory;
	
	public Memorie() {}
	public Memorie(int hasTwin, String memory) {
		this.hasTwin = hasTwin;
		this.memory = memory;
	}
	public int getHasTwin() {
		return hasTwin;
	}
	public void setHasTwin(int hasTwin) {
		this.hasTwin = hasTwin;
	}
	public String getMemory() {
		return memory;
	}
	public void setMemory(String memory) {
		this.memory = memory;
	}
	
	
}
