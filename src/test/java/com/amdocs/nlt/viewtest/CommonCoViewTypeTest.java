package com.amdocs.nlt.viewtest;

import org.testng.Assert;

import com.amdocs.nlt.viewpages.CommonCoViewTypePage;

public class CommonCoViewTypeTest extends CommonViewTest {
	public void checkTechnicalDetailsComponent() throws Exception {
		CommonCoViewTypePage commonCoViewTypePage = new CommonCoViewTypePage(driver);
		Assert.assertEquals(commonCoViewTypePage.getRedundancyWirelineLabel(),
				"Redundancy Service with Wireline Diversity",
				"Redundancy Service with Wireline Diversity label should be present but it is not");
		Assert.assertEquals(commonCoViewTypePage.getRedundancyDuctLabel(), "Redundancy Service with Duct Diversity",
				"Redundancy Service with Duct Diversity label should be present but it is not");
		Assert.assertEquals(commonCoViewTypePage.getRedundancyPathLabel(), "Redundancy Service with Path Diversity",
				"Redundancy Service with Path Diversity label should be present but it is not");
		Assert.assertEquals(commonCoViewTypePage.getUnavailableLabel(), "In case redundancy service is unavailable",
				"In case redundancy service is unavailable label should be present but it is not");
		Assert.assertTrue(commonCoViewTypePage.isRedundancyWirelineRequiredRadioButtonDisable(),
				"Redundancy Wire line Required Radio Button should be disable but it is not");
		Assert.assertTrue(commonCoViewTypePage.isRedundancyWirelineNotRequiredRadioButtonDisable(),
				"Redundancy Wire line Not Required Radio Button should be disable but it is not");
		Assert.assertTrue(commonCoViewTypePage.isRedundancyDuctNotRequiredRadioButtonDisable(),
				"Redundancy Duct Not Required Radio Button should be disable but it is not");
		Assert.assertTrue(commonCoViewTypePage.isRedundancyDuctRequiredRadioButtonDisable(),
				"Redundancy Duct Required Radio Button Disable should be disable but it is not");
		Assert.assertTrue(commonCoViewTypePage.isRedundancyPathRequiredRadioButtonDisable(),
				"Redundancy Path Required Radio Button should be disable but it is not");
		Assert.assertTrue(commonCoViewTypePage.isRedundancyPathNotRequiredRadioButtonDisable(),
				"Redundancy Path Not Required Radio Button  should be disable but it is not");
		Assert.assertTrue(commonCoViewTypePage.isUnavailableRequiredRadioButtonDisable(),
				"Unavailable Required Radio Button should be disable but it is not");
		Assert.assertTrue(commonCoViewTypePage.isUnavailableNotRequiredRadioButtonDisable(),
				"Unavailable Not Required Radio Button should be disable but it is not");
	}
}
