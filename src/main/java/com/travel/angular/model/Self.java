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
	
	public String getRef() {
		return ref;
	}

	public void setRef(String ref) {
		this.ref = ref;
	}

	private String ref;
}
