/**
 * 
 */
package com.travel.angular.model.request;

import java.io.Serializable;
import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

/**
 * @author Kiran Kanaparthi
 *
 */
public class SpaceTravelRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5022464841720622765L;

	private Long id;
	
	public SpaceTravelRequest() {
		super();
	}

	public SpaceTravelRequest(Long id, LocalDate checkin, LocalDate checkout) {
		super();
		this.id = id;
		this.checkin = checkin;
		this.checkout = checkout;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDate getCheckin() {
		return checkin;
	}

	public void setCheckin(LocalDate checkin) {
		this.checkin = checkin;
	}

	public LocalDate getCheckout() {
		return checkout;
	}

	public void setCheckout(LocalDate checkout) {
		this.checkout = checkout;
	}

	@DateTimeFormat(iso= DateTimeFormat.ISO.DATE)
	private LocalDate checkin;

	@DateTimeFormat(iso= DateTimeFormat.ISO.DATE)
	private LocalDate checkout;
}
