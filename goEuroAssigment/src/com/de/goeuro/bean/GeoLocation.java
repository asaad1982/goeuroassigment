package com.de.goeuro.bean;

public class GeoLocation {
private double latitude;
public double getLatitude() {
	return latitude;
}
public void setLatitude(double latitude) {
	this.latitude = latitude;
}
public double getLongitude() {
	return longitude;
}
public void setLongitude(double longitude) {
	this.longitude = longitude;
}
private double longitude;
@Override
public String toString() {
	return "GeoLocation [latitude=" + latitude + ", longitude=" + longitude
			+ "]";
}

}
