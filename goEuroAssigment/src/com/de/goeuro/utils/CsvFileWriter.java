package com.de.goeuro.utils;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;

import com.de.goeuro.bean.LocationBean;

/**
 * @author ashraf
 * 
 */
public class CsvFileWriter {
	
	//Delimiter used in CSV file
	private static final String NEW_LINE_SEPARATOR = "\n";
	
	//CSV file header
	private static final Object [] FILE_HEADER = {"id","Name","Type","Latitude","Longitude"};

	public static void writeCsvFile(String fileName,List<LocationBean> locationBeans) {
		
		
		
		FileWriter fileWriter = null;
		
		CSVPrinter csvFilePrinter = null;
		
		//Create the CSVFormat object with "\n" as a record delimiter
        CSVFormat csvFileFormat = CSVFormat.DEFAULT.withRecordSeparator(NEW_LINE_SEPARATOR);
				
		try {
			
			//initialize FileWriter object
			System.out.println(fileName);
			fileWriter = new FileWriter(fileName);
			
			//initialize CSVPrinter object 
	        csvFilePrinter = new CSVPrinter(fileWriter, csvFileFormat);
	        
	        //Create CSV file header
	        csvFilePrinter.printRecord(FILE_HEADER);
			
			//Write a new student object list to the CSV file
			for (LocationBean locationBean : locationBeans) {
				List locationDataRecord = new ArrayList();
				locationDataRecord.add(String.valueOf(locationBean.getId()));
				locationDataRecord.add(locationBean.getName());
				locationDataRecord.add(locationBean.getType());
				locationDataRecord.add(locationBean.getGeoLocation().getLatitude());
				locationDataRecord.add(locationBean.getGeoLocation().getLongitude());
	            csvFilePrinter.printRecord(locationDataRecord);
			}

			System.out.println("CSV file was created successfully !!!");
			
		} catch (Exception e) {
			System.out.println("Error in CsvFileWriter !!!");
			e.printStackTrace();
		} finally {
			try {
				fileWriter.flush();
				fileWriter.close();
				csvFilePrinter.close();
			} catch (IOException e) {
				System.out.println("Error while flushing/closing fileWriter/csvPrinter !!!");
                e.printStackTrace();
			}
		}
	}
}