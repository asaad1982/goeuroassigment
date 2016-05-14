package com.de.goeuro.dao;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJacksonHttpMessageConverter;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import com.de.goeuro.bean.LocationBean;
import com.de.goeuro.exceptions.ServiceException;
import com.de.goeuro.exceptions.SystemException;
@Component
public class GoEuroAPIDAOImpl implements GoEuroAPIDAO {
	
	 private static final Logger logger = LoggerFactory.getLogger(GoEuroAPIDAOImpl.class);

	
	public List<LocationBean> getLocationByName(String cityName) throws Exception{
		String url = "http://api.goeuro.com/api/v2/position/suggest/en/"
				+ cityName;
		List<LocationBean> locationBeans=null;
		
		try{
		List<HttpMessageConverter<?>> messageConverters = new ArrayList<HttpMessageConverter<?>>();
		MappingJacksonHttpMessageConverter map = new MappingJacksonHttpMessageConverter();
		messageConverters.add(map);
		RestTemplate restTemplate = new RestTemplate();

		restTemplate.setMessageConverters(messageConverters);
		ResponseEntity<List<LocationBean>> rateResponse = restTemplate
				.exchange(url, HttpMethod.GET, null,
						new ParameterizedTypeReference<List<LocationBean>>() {
						});
		
		 locationBeans = rateResponse.getBody();
		
		} catch (HttpClientErrorException e) {
		      new ServiceException(e.getStatusCode().value(), e.getMessage());
		      logger.error(e.getMessage());
		} catch(Exception e) {
		      logger.error(e.getMessage());
		      new SystemException(e.getMessage());
		}
		return locationBeans;
	}

}
