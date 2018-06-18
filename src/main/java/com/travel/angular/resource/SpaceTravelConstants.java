/**
 * 
 */
package com.travel.angular.resource;

/**
 * @author Kiran Kanaparthi
 *
 */
public class SpaceTravelConstants {

	 private SpaceTravelConstants() {
		    throw new IllegalStateException("SpaceTravelConstants is a Utility class");
	 }
	  
	public static final String SPACE_SHIP_RESERVATION_1 = "/spaceship/reservation/v1";
	
	public static final String SPACE_SHIP_CREATE_RESERVATION = "/bookSpaceTravel";
	public static final String SPACE_SHIP_UPDATE_RESERVATION = "/updateSpaceTravel";
	public static final String SPACE_SHIP_CANCEL_RESERVATION = "/cancelSpaceTravel/{reservationId}";
	public static final String SPACE_SHIP_GET_AVAILBALE_SPOTS = "/availableShips";

}
