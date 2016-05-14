package com.de.goeuro.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.de.goeuro.bean.LocationBean;
import com.de.goeuro.dao.GoEuroAPIDAO;
import com.de.goeuro.dao.GoEuroAPIDAOImpl;
import com.de.goeuro.exceptions.ServiceException;
import com.de.goeuro.utils.CsvFileWriter;

@Service
public class GoEuroAPIImpl {
	private static final Logger logger = LoggerFactory.getLogger(GoEuroAPIImpl.class);

	@Autowired
	private GoEuroAPIDAO goEuroAPIDAO;
public void cosumeAPI(String cityName) throws Exception{
	List<LocationBean> locationBeans=null;
	try {
		locationBeans = goEuroAPIDAO.getLocationByName(cityName);
		String fileName = System.getProperty("user.home")+"/"+cityName+".csv";
		CsvFileWriter.writeCsvFile(fileName, locationBeans);
	} catch (Exception e) {
		logger.error(e.getMessage(),e);
		throw e;
	}
	
}
}
