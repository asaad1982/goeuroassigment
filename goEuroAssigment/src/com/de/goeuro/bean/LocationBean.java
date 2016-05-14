package com.de.goeuro.bean;

import java.util.HashMap;

import org.codehaus.jackson.annotate.JsonProperty;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)
public class LocationBean
{

		private String name;
		private String type;
		private String key;
		@JsonProperty("geo_position")
		private GeoLocation geoLocation;
		private int locationId;
		private boolean inEurope;
		private String countryCode;
		private String coreCountry;
		private String distance;
		private int countryId;
		private HashMap<String,String> names;
		private HashMap<String, String>alternativeNames;
		public GeoLocation getGeoLocation() {
			return geoLocation;
		}

		public void setGeoLocation(GeoLocation geoLocation) {
			this.geoLocation = geoLocation;
		}

		public String getKey() {
			return key;
		}

		public void setKey(String key) {
			this.key = key;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getCountry() {
			return country;
		}

		public void setCountry(String country) {
			this.country = country;
		}

		private String country;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

	
		public String getFullName() {
			return fullName;
		}

		public void setFullName(String fullName) {
			this.fullName = fullName;
		}

		public String getIata_airport_code() {
			return iata_airport_code;
		}

		public void setIata_airport_code(String iata_airport_code) {
			this.iata_airport_code = iata_airport_code;
		}
		@JsonProperty("_id")
		private int id;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		private String fullName;

		private String iata_airport_code;
		public int getLocationId() {
			return locationId;
		}

		public void setLocationId(int locationId) {
			this.locationId = locationId;
		}

		public boolean isInEurope() {
			return inEurope;
		}

		public void setInEurope(boolean inEurope) {
			this.inEurope = inEurope;
		}

		public String getCountryCode() {
			return countryCode;
		}

		public void setCountryCode(String countryCode) {
			this.countryCode = countryCode;
		}

		public String getCoreCountry() {
			return coreCountry;
		}

		public void setCoreCountry(String coreCountry) {
			this.coreCountry = coreCountry;
		}

		public String getDistance() {
			return distance;
		}

		public void setDistance(String distance) {
			this.distance = distance;
		}

		public int getCountryId() {
			return countryId;
		}

		public void setCountryId(int countryId) {
			this.countryId = countryId;
		}

		public HashMap<String, String> getNames() {
			return names;
		}

		public void setNames(HashMap<String, String> names) {
			this.names = names;
		}

		public HashMap<String, String> getAlternativeNames() {
			return alternativeNames;
		}

		public void setAlternativeNames(HashMap<String, String> alternativeNames) {
			this.alternativeNames = alternativeNames;
		}

		@Override
		public String toString() {
			return "LocationBean [name=" + name + ", type=" + type + ", key="
					+ key + ", geoLocation=" + geoLocation + ", locationId="
					+ locationId + ", inEurope=" + inEurope + ", countryCode="
					+ countryCode + ", coreCountry=" + coreCountry
					+ ", distance=" + distance + ", countryId=" + countryId
					+ ", names=" + names + ", alternativeNames="
					+ alternativeNames + ", country=" + country + ", _id="
					+ id + ", fullName=" + fullName + ", iata_airport_code="
					+ iata_airport_code + "]";
		}



		


}
