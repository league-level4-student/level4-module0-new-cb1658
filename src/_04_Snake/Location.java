package _04_Snake;

public class Location{
	private int x;
	private int y; 
	
	
	public Location(int x, int y) {
		this.x = x;
		this.y = y; 
	}
	public int getX() {
		return this.x;
	}
	public int getY() {
		return this.y;
	}
	private boolean equals(int x, int y) {
		if(this.x == x && this.y == y) {
			return true;
		}
		else {
			return false;
		}
	}
}

