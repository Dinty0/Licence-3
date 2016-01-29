package TP1.ex1;

public class Position {
	private double latitude;
	private double longitude;
	
	public Position(double latitude, double longitude) {
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public double getLatitude() {
		return latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public String toString() {
		return  this.latitude + ", " + this.longitude;
	}
	
	
	
	
}
