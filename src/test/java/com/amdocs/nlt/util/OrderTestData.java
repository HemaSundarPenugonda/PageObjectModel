package com.amdocs.nlt.util;

import java.text.SimpleDateFormat;
import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class OrderTestData extends BaseTestData {
	private String firstName = "Surya";
	private String lastName = "kant";
	private String contactNum = "13432132";
	private String altContactNum = "2136549874";
	private String emailAdd = "abc@gmail.com";
	private String postalCode_homeReached = "212332";
	private String postalCode_reconnect = "422222";
	private String appRefNumber = "ARI";
	private String companyName = "Amdocs";
	private String createDate;
	private SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");

	public OrderTestData(String testId, String entityType, String entitySubtype, String action) {
		super(testId, entityType, entitySubtype, action);
		createDate = format.format(new Date());
		appRefNumber += System.nanoTime();
	}

	public OrderTestData() {

		createDate = format.format(new Date());
		appRefNumber += System.nanoTime();
	}

	public void setAppRefNumber(String appRefNumber) {
		/* Do not let setter override appRefNumber. */
	}

	public String getPostalCode_reconnect_nonresi() {
		return postalCode_reconnect_nonresi;
	}

	public void setPostalCode_reconnect_nonresi(String postalCode_reconnect_nonresi) {
		this.postalCode_reconnect_nonresi = postalCode_reconnect_nonresi;
	}

	private String postalCode_reconnect_nonresi = "222222";
	private String postalCode_firstPassFree = "121342";
	private String postalCode_Homepassed = "111111";

	public String getPostalCode_Homepassed() {
		return postalCode_Homepassed;
	}

	public void setPostalCode_Homepassed(String postalCode_Homepassed) {
		this.postalCode_Homepassed = postalCode_Homepassed;
	}

	private String unitNum = "019-3322";

	public String getPostalCode_reconnect() {
		return postalCode_reconnect;
	}

	public void setPostalCode_reconnect(String postalCode_reconnect) {
		this.postalCode_reconnect = postalCode_reconnect;
	}

	public String getPostalCode_firstPassFree() {
		return postalCode_firstPassFree;
	}

	public void setPostalCode_firstPassFree(String postalCode_firstPassFree) {
		this.postalCode_firstPassFree = postalCode_firstPassFree;
	}

	public String getPostalCode_homeReached() {
		return postalCode_homeReached;
	}

	public void setPostalCode_homeReached(String postalCode_homeReached) {
		this.postalCode_homeReached = postalCode_homeReached;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getContactNum() {
		return contactNum;
	}

	public void setContactNum(String contactNum) {
		this.contactNum = contactNum;
	}

	public String getAltContactNum() {
		return altContactNum;
	}

	public void setAltContactNum(String altContactNum) {
		this.altContactNum = altContactNum;
	}

	public String getEmailAdd() {
		return emailAdd;
	}

	public void setEmailAdd(String emailAdd) {
		this.emailAdd = emailAdd;
	}

	public String getUnitNum() {
		return unitNum;
	}

	public void setUnitNum(String unitNum) {
		this.unitNum = unitNum;
	}

}
