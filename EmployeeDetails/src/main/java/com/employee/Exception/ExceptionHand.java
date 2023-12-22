package com.employee.Exception;

import java.util.Date;

public class ExceptionHand 
{
	private Date  TimeStamp;
	private  String mesage;
	private String description;
	public Date getTimeStamp() {
		return TimeStamp;
	}
	public void setTimeStamp(Date timeStamp) {
		TimeStamp = timeStamp;
	}
	@Override
	public String toString() {
		return "ExceptionHandler [TimeStamp=" + TimeStamp + ", mesage=" + mesage + ", description=" + description + "]";
	}
	public ExceptionHand(Date timeStamp, String mesage, String description) {
		super();
		TimeStamp = timeStamp;
		this.mesage = mesage;
		this.description = description;
	}
	public String getMesage() {
		return mesage;
	}
	public void setMesage(String mesage) {
		this.mesage = mesage;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

}
