/**
 * 
 */
package com.travel.angular.resource;

//import java.time.LocalDate;
//
//import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.travel.angular.model.request.SpaceTravelRequest;
import com.travel.angular.model.response.SpaceTravelResponse;

/**
 * @author Kiran Kanaparthi
 *
 */
@RestController
@RequestMapping(SpaceTravelConstants.SPACE_SHIP_RESERVATION_1)
public class TimeTravelResource {

//	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
//	LocalDate checkin
	
	public static final String SPACE_SHIP_RESERVATION_1 = "/spaceship/reservation/v1";
	

	/**
	 * This method gets the list of available SpaceShips
	 * 
	 * @return
	 */
	@RequestMapping(path=SpaceTravelConstants.SPACE_SHIP_GET_AVAILBALE_SPOTS,method=RequestMethod.GET,
			produces= MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<SpaceTravelResponse> getAvailableSpaceShips(
			@RequestParam (value = "checkin")
			String checkin,
			@RequestParam (value = "checkout")
			String checkout) {
		System.out.println(" Started the getAvailable Spaces");
		
		return new ResponseEntity<>(new SpaceTravelResponse(null, null, null, null), HttpStatus.OK);
	}	
	
	/**
	 * This method gets the list of available SpaceShips
	 * 
	 * @return
	 */
	@RequestMapping(path=SpaceTravelConstants.SPACE_SHIP_CREATE_RESERVATION,method=RequestMethod.POST,
			produces= MediaType.APPLICATION_JSON_UTF8_VALUE, consumes=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<SpaceTravelResponse> createSpaceTravelRequest(@RequestBody SpaceTravelRequest spaceTravelRequest) {
		return new ResponseEntity<>(new SpaceTravelResponse(null, null, null, null),HttpStatus.CREATED);
	}
	
	/**
	 * This method gets the list of available SpaceShips
	 * 
	 * @return
	 */
	@RequestMapping(path=SpaceTravelConstants.SPACE_SHIP_UPDATE_RESERVATION,method=RequestMethod.PUT,
			produces= MediaType.APPLICATION_JSON_UTF8_VALUE,consumes=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<SpaceTravelResponse> updateSpaceTravelRequest(@RequestBody SpaceTravelRequest spaceTravelRequest) {
		return new ResponseEntity<>(new SpaceTravelResponse(null, null, null, null), HttpStatus.OK);
	}	
	
	/**
	 * This method gets the list of available SpaceShips
	 * 
	 * @return
	 */
	@RequestMapping(path=SpaceTravelConstants.SPACE_SHIP_CANCEL_RESERVATION,method=RequestMethod.DELETE)
	public ResponseEntity<Void> cancelSpaceTravelRequest(@PathVariable long reservationId) {
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}	
	
	
	
	
}
