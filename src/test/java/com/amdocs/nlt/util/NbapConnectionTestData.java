package com.amdocs.nlt.util;

import java.text.SimpleDateFormat;
import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class NbapConnectionTestData extends BaseTestData {
	private String nearestPostalCode = "123123";
	private String landmark = "8273971289jkqwkd";
	private String xcoordinate = "0.908";
	private String ycoordinate = "0.897";
	private String height = "987";
	private String descriptionOFAddress = "asdhj238971293";
	private String aGboxIdentifier = "MH1111";
	private String appRefNumber = "ARI";
	private String createDate;
	private SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");

	public NbapConnectionTestData(String testId, String entityType, String entitySubtype, String action) {
		super(testId, entityType, entitySubtype, action);
		createDate = format.format(new Date());
		appRefNumber += System.nanoTime();
	}

	public NbapConnectionTestData() {

		createDate = format.format(new Date());
		appRefNumber += System.nanoTime();
	}

	public String getaGboxIdentifier() {
		return aGboxIdentifier;
	}

	public void setaGboxIdentifier(String aGboxIdentifier) {
		this.aGboxIdentifier = aGboxIdentifier;
	}

	public String getDescriptionOFAddress() {
		return descriptionOFAddress;
	}

	public void setDescriptionOFAddress(String descriptionOFAddress) {
		this.descriptionOFAddress = descriptionOFAddress;
	}

	public String getNearestPostalCode() {
		return nearestPostalCode;
	}

	public void setNearestPostalCode(String nearestPostalCode) {
		this.nearestPostalCode = nearestPostalCode;
	}

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	public String getXcoordinate() {
		return xcoordinate;
	}

	public void setXcoordinate(String xcoordinate) {
		this.xcoordinate = xcoordinate;
	}

	public String getYcoordinate() {
		return ycoordinate;
	}

	public void setYcoordinate(String ycoordinate) {
		this.ycoordinate = ycoordinate;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

}
