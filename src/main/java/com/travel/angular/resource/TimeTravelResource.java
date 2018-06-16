/**
 * 
 */
package com.travel.angular.resource;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.travel.angular.model.response.SpaceTravelResponse;

/**
 * @author Kiran Kanaparthi
 *
 */
@RestController
@RequestMapping(SpaceTravelConstants.SPACE_SHIP_RESERVATION_1)
public class TimeTravelResource {

	/**
	 * This method gets the list of available SpaceShips
	 * 
	 * @return
	 */
	@RequestMapping(path="",method=RequestMethod.GET,
			produces= MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<SpaceTravelResponse> getAvailableSpaceShips(
			@RequestParam (value="checkin")
			@DateTimeFormat(iso=DateTimeFormat.ISO.DATE)
			LocalDate checkin,
			@RequestParam (value="checkout")
			@DateTimeFormat(iso=DateTimeFormat.ISO.DATE)
			LocalDate checkout) {
		System.out.println(" Started the getAvailable Spaces");
		return new ResponseEntity<>(new SpaceTravelResponse(null, null, null, null), HttpStatus.OK);
	}	
	
	/**
	 * This method gets the list of available SpaceShips
	 * 
	 * @return
	 */
	@RequestMapping(path="/availableSpaces",method=RequestMethod.POST,
			produces= MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<SpaceTravelResponse> createSpaceTravelRequest() {
		return new ResponseEntity<>(new SpaceTravelResponse(null, null, null, null),HttpStatus.OK);
	}
	
	/**
	 * This method gets the list of available SpaceShips
	 * 
	 * @return
	 */
	@RequestMapping(path="/availableSpaces",method=RequestMethod.PUT,
			produces= MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<SpaceTravelResponse> updateSpaceTravelRequest() {
		return new ResponseEntity<>(new SpaceTravelResponse(null, null, null, null), HttpStatus.OK);
	}	
	
	/**
	 * This method gets the list of available SpaceShips
	 * 
	 * @return
	 */
	@RequestMapping(path="/availableSpaces",method=RequestMethod.DELETE,
			produces= MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<SpaceTravelResponse> deleteSpaceTravelRequest() {
		return new ResponseEntity<>(new SpaceTravelResponse(null, null, null, null),HttpStatus.OK);
	}	
	
	
	
	
}
