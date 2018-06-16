/**
 * 
 */
package com.travel.angular.resource;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Kiran Kanaparthi
 *
 */

@RestController
@RequestMapping("/test")
public class TestResource {

	@RequestMapping(path="/values",method=RequestMethod.GET,
	produces= MediaType.APPLICATION_JSON_UTF8_VALUE)
	public List<String> getTestResponse() {
		return Arrays.asList(new String[] {"one","two","three"});
	}
}
