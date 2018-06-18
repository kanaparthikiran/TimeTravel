/**
 * 
 */
package com.travel.angular.model;

import java.io.Serializable;

/**
 * @author Kiran Kanaparthi
 *
 */
public class Self implements Serializable {
	
	public Self(String ref) {
		super();
		this.ref = ref;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 253262971032538215L;

	public String getRef() {
		return ref;
	}

	public void setRef(String ref) {
		this.ref = ref;
	}

	private String ref;
}
