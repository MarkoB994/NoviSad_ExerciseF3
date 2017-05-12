
public class Pozicija {
	private int x = 0;
	private int y = 0;
	private String smer = "N";
	
	public Pozicija(int x, int y, String smer){
		this.x = x;
		this.y = y;
		this.smer = smer;
	}
	
	public String trenutnaPozicija(){
		return "(" + x + ", " + y + ", " + smer + ")"; 
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}
	
}
