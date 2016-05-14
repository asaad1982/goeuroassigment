  package com.de.goeuro.entry;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.de.goeuro.exceptions.ServiceException;
import com.de.goeuro.service.GoEuroAPIImpl;



  public class GoEuroTest
  {
	  private static final Logger logger = LoggerFactory.getLogger(GoEuroTest.class);

  		public static void main(String[] args)
  		{
  			logger.info("Args"+args[0]);
//  			 RestTemplate restTemplate = new RestTemplate();
//  			 String url = "http://api.goeuro.com/api/v2/position/suggest/en/"+args[0];
//
//  			 List<HttpMessageConverter<?>> messageConverters = new ArrayList<HttpMessageConverter<?>>();
//  			 MappingJacksonHttpMessageConverter map = new MappingJacksonHttpMessageConverter();
//  			 messageConverters.add(map);
//  			 restTemplate.setMessageConverters(messageConverters);
//  			ResponseEntity<List<LocationBean>> rateResponse =
//  			        restTemplate.exchange(url,
//  			                    HttpMethod.GET, null, new ParameterizedTypeReference<List<LocationBean>>() {
//  			            });
//  			List<LocationBean> locationBeans = rateResponse.getBody();
//  			String fileName = System.getProperty("user.home")+"/"+args[0]+".csv";
//
//  			CsvFileWriter.writeCsvFile(fileName, locationBeans);
  			
  			 ApplicationContext context = 
  		            new ClassPathXmlApplicationContext("resources/config.xml");

  			GoEuroAPIImpl euroTest = context.getBean(GoEuroAPIImpl.class);
  		    try {
				euroTest.cosumeAPI(args[0]);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				logger.error(e.getMessage());
			}
  			
  		}
  		
  }
