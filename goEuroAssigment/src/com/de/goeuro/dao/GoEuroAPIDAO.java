package com.de.goeuro.dao;

import java.util.List;

import com.de.goeuro.bean.LocationBean;

public interface GoEuroAPIDAO {
public List<LocationBean> getLocationByName(String cityName)throws Exception;
}
