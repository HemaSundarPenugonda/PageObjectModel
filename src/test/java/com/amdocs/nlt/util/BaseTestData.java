package com.amdocs.nlt.util;

import java.util.Date;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public abstract class BaseTestData {
	@NonNull
	private String testId;
	@NonNull
	private String entityType;
	@NonNull
	private String entitySubtype;
	@NonNull
	private String action;
	private String queryParam;
	private String additionalInfo;
	private Date submitBeforeTime;
	private Date submitAfterTime;

	public BaseTestData(String testId, String entityType, String entitySubtype, String action) {
		this.testId = testId;
		this.entityType = entityType;
		this.entitySubtype = entitySubtype;
		this.action = action;
	}
}
