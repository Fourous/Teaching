package com.gs.qq;

import java.io.Serializable;

public class QUser implements Serializable {
	
	private static final long serialVersionUID = 2180998441077092163L;
	
	private String qq;
	private String name;
	private String message;
	public String getQq() {
		return qq;
	}
	public void setQq(String qq) {
		this.qq = qq;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "QUser [qq=" + qq + ", name=" + name + ", message=" + message + "]";
	}
	
}
