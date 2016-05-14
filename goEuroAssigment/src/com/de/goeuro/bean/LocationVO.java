package com.de.goeuro.bean;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)
public class LocationVO {
	List<LocationBean> locationBeans;

	public List<LocationBean> getLocationBeans() {
		return locationBeans;
	}

	public void setLocationBeans(List<LocationBean> locationBeans) {
		this.locationBeans = locationBeans;
	}

}
