/**
 * 
 */
package com.travel.angular.model;

import java.io.Serializable;

/**
 * @author Kiran Kanaparthi
 *
 */
public class Links implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7827250446048772606L;

	public Self getSelf() {
		return self;
	}

	public void setSelf(Self self) {
		this.self = self;
	}

	private Self self;

	public Links(Self self) {
		super();
		this.self = self;
	}
	
}
