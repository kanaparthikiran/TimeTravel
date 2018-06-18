/**
 * 
 */
package com.travel.angular.model.response;

import java.io.Serializable;
import com.travel.angular.model.Links;


/**
 * @author Kiran Kanaparthi
 *
 */
public class SpaceTravelResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8548709663981544288L;
	
	private Long id;
	private Integer shipNumber;
	private Integer price;
	private Links  links;
	
	public SpaceTravelResponse(Integer shipNumber, Integer price) {
		super();
		this.shipNumber = shipNumber;
		this.price = price;
	}

	/**
	 * 
	 * @param id
	 * @param shipNumber
	 * @param price
	 * @param links
	 */
	public SpaceTravelResponse(Long id, Integer shipNumber, 
			Integer price, Links links) {
		super();
		this.id = id;
		this.shipNumber = shipNumber;
		this.price = price;
		this.links = links;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getShipNumber() {
		return shipNumber;
	}

	public void setShipNumber(Integer shipNumber) {
		this.shipNumber = shipNumber;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Links getLinks() {
		return links;
	}

	public void setLinks(Links links) {
		this.links = links;
	}
	
	
}