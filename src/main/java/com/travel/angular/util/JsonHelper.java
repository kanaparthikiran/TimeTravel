/**
 * 
 */
package com.travel.angular.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * @author Kiran Kanaparthi
 *
 */
public class JsonHelper {
	
	/**
	 * Private constructor to prevent instantiation of the
	 * default public constructor
	 */
	private JsonHelper() {}
	
	private static final Logger logger = LogManager.getRootLogger();
	
	private static final Gson gson = new GsonBuilder().create();

	/**
	 * 
	 * @return
	 */
	public static final Object fromJson(String input,Object requestObjectType) {
		Object spaceTravelResponse = 
				gson.fromJson(input, requestObjectType.getClass());
		logger.info("spaceTravelResponse "+spaceTravelResponse);
		return spaceTravelResponse;
		
	}
	
	/**
	 * 
	 * @return
	 */
	public static final String toJson(Object input) {
		String jsonResponse = gson.toJson(input);
		logger.info("jsonResponse "+jsonResponse);
		return jsonResponse;
	}

}
