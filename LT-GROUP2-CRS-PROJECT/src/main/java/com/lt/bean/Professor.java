/**
 * 
 */
package com.lt.bean;

/**
 * @author admin
 *
 */
public class Professor {

	private String name;
	private String department;
	private String designation;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public Professor(String name, String department, String designation) {
		super();
		this.name = name;
		this.department = department;
		this.designation = designation;
	}
	public Professor() {
		super();
	}
	
}
