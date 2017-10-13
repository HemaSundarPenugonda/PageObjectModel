package com.amdocs.nlt.page;

import com.amdocs.nlt.util.PropertiesReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class NavigateToModulesByURL {
    private WebDriver driver;

    public NavigateToModulesByURL(WebDriver driver) {
        this.driver = driver;
    }

    private static void navigateToExtn(WebDriver driver, String extnUrl) throws InterruptedException {
        Thread.sleep(2000);
        driver.manage().timeouts().pageLoadTimeout(PropertiesReader.getInstance().waitForSecondsHigh(), TimeUnit.SECONDS);

        final String appUrl = PropertiesReader.getInstance().getAppUrl();
        final String substring = appUrl.substring(0, appUrl.indexOf("/", 8));
        driver.get(substring + extnUrl);

        WebDriverWait wait = new WebDriverWait(driver, PropertiesReader.getInstance().waitForSecondsHigh());
        wait.until(ExpectedConditions.urlContains(extnUrl));
        driver.manage().timeouts().pageLoadTimeout(PropertiesReader.getInstance().waitForSecondsHigh(), TimeUnit.SECONDS);
    }

    public void navigateToSchedule1() throws InterruptedException {
        navigateToExtn(driver, "/ordermanagement/residentialconnection");
    }

    public void navigateToSchedule2() throws InterruptedException {
        navigateToExtn(driver, "/ordermanagement/nonresidentialconnection");
    }

    public void navigateToSchedule3() throws InterruptedException {
        navigateToExtn(driver, "/ordermanagement/nbapconnection");
    }

    public void navigateToSchedule4() throws InterruptedException {
        navigateToExtn(driver, "/ordermanagement/cotococonnection");
    }

    public void navigateToSchedule5() throws InterruptedException {
        navigateToExtn(driver, "/ordermanagement/cotobuildingmdfconnection");
    }

    public void navigateToSchedule6() throws InterruptedException {
        navigateToExtn(driver, "/ordermanagement/buildingmdftofttbnodeconnection");
    }

    public void navigateToSchedule7() throws InterruptedException {
        navigateToExtn(driver, "/ordermanagement/fttbnodetodpconnection");
    }

    public void navigateToSchedule8() throws InterruptedException {
        navigateToExtn(driver, "/ordermanagement/buildingmdftoresidentialconnection");
    }

    public void navigateToSchedule9() throws InterruptedException {
        navigateToExtn(driver, "/ordermanagement/buildingmdftononresidentialconnection");
    }

    public void navigateToSchedule10() throws InterruptedException {
        navigateToExtn(driver, "/ordermanagement/cotonbapdpconnection");
    }

    public void navigateToSchedule11() throws InterruptedException {
        navigateToExtn(driver, "/ordermanagement/nbapdptonbaptpconnection");
    }

    public void navigateToSchedule12() throws InterruptedException {
        navigateToExtn(driver, "/ordermanagement/colocationservice");
    }

    public void navigateToSchedule12A() throws InterruptedException {
        navigateToExtn(driver, "/ordermanagement/rltorlinterconnection");
    }

    public void navigateToSchedule12B() throws InterruptedException {
        navigateToExtn(driver, "/ordermanagement/colocationcoolingservices");
    }

    public void navigateToSchedule12C() throws InterruptedException {
        navigateToExtn(driver, "/ordermanagement/colocationcoolingservices");
    }

    public void navigateToSchedule13() throws InterruptedException {
        navigateToExtn(driver, "/ordermanagement/patchingservice");
    }

    public void navigateToFTO() throws InterruptedException {
        navigateToExtn(driver, "/ordermanagement/fibretakeoverservice");
    }

    public void navigateToEFTO() throws InterruptedException {
        navigateToExtn(driver, "/ordermanagement/fibretakeoverenhancedservice");
    }

    public void navigateToManageTPAddress() throws InterruptedException {
        navigateToExtn(driver, "/ordermanagement/managetpbyaddress");
    }

    public void navigateToManageCoOrdinate() throws InterruptedException {
        navigateToExtn(driver, "/ordermanagement/managetpbycoordinate");
    }

    public void navigateToManageTPRRR() throws InterruptedException {
        navigateToExtn(driver, "/ordermanagement/managetpbyrrr");
    }

    public void navigateToDarkFibre() throws InterruptedException {
        navigateToExtn(driver, "/ordermanagement/fibrewithoutservice");
    }


    /*public void navigateToSchedule1_view_completed() throws InterruptedException {
        navigateToSchedule1();
        NavigationUtils.navigateToExtn(driver, "/sch1T");
    }

    public void navigateToSchedule2_view_completed() throws InterruptedException {
        navigateToSchedule2();
        NavigationUtils.navigateToExtn(driver, "/sch2T");
    }

    public void navigateToSchedule3_view_completed() throws InterruptedException {
        navigateToSchedule3();
        NavigationUtils.navigateToExtn(driver, "/sch3T");
    }

    public void navigateToSchedule4_view_completed() throws InterruptedException {
        navigateToSchedule4();
        NavigationUtils.navigateToExtn(driver, "/sch4T");
    }

    public void navigateToSchedule5_view_completed() throws InterruptedException {
        navigateToSchedule5();
        NavigationUtils.navigateToExtn(driver, "/sch5T");
    }

    public void navigateToSchedule6_view_completed() throws InterruptedException {
        navigateToSchedule6();
        NavigationUtils.navigateToExtn(driver, "/sch6T");
    }

    public void navigateToSchedule7_view_completed() throws InterruptedException {
        navigateToSchedule7();
        NavigationUtils.navigateToExtn(driver, "/sch7T");
    }

    public void navigateToSchedule8_view_completed() throws InterruptedException {
        navigateToSchedule8();
        NavigationUtils.navigateToExtn(driver, "/sch8T");
    }

    public void navigateToSchedule9_view_completed() throws InterruptedException {
        navigateToSchedule9();
        NavigationUtils.navigateToExtn(driver, "/sch9T");
    }

    public void navigateToSchedule10_view_completed() throws InterruptedException {
        navigateToSchedule10();
        NavigationUtils.navigateToExtn(driver, "/sch10T");
    }

    public void navigateToSchedule11_view_completed() throws InterruptedException {
        navigateToSchedule11();
        NavigationUtils.navigateToExtn(driver, "/sch11T");
    }

    public void navigateToSchedule12_view_completed() throws InterruptedException {
        navigateToSchedule12();
        NavigationUtils.navigateToExtn(driver, "/sch12T");
    }

    public void navigateToSchedule12A_view_completed() throws InterruptedException {
        navigateToSchedule12A();
        NavigationUtils.navigateToExtn(driver, "/sch12AT");
    }

    public void navigateToSchedule12B_view_completed() throws InterruptedException {
        navigateToSchedule12B();
        NavigationUtils.navigateToExtn(driver, "/sch12BT");
    }

    public void navigateToSchedule12C_view_completed() throws InterruptedException {
        navigateToSchedule12C();
        NavigationUtils.navigateToExtn(driver, "/sch12CT");
    }

    public void navigateToSchedule13_view_completed() throws InterruptedException {
        navigateToSchedule13();
        NavigationUtils.navigateToExtn(driver, "/sch13T");
    }

    public void navigateToFTO_view_completed() throws InterruptedException {
        navigateToFTO();
        NavigationUtils.navigateToExtn(driver, "/sch1T");
    }

    public void navigateToEFTO_view_completed() throws InterruptedException {
        navigateToEFTO();
        NavigationUtils.navigateToExtn(driver, "/sch1T");
    }

    public void navigateToManageTPAddress_view_completed() throws InterruptedException {
        navigateToManageTPAddress();
        NavigationUtils.navigateToExtn(driver, "/sch1T");
    }

    public void navigateToManageCoOrdinate_view_completed() throws InterruptedException {
        navigateToManageCoOrdinate();
        NavigationUtils.navigateToExtn(driver, "/sch3T");
    }

    public void navigateToManageTPRRR_view_completed() throws InterruptedException {
        navigateToManageTPRRR();
        NavigationUtils.navigateToExtn(driver, "/sch1T");
    }

    public void navigateToDarkFibre_view_completed() throws InterruptedException {
        navigateToDarkFibre();
        NavigationUtils.navigateToExtn(driver, "/sch1T");
    }


    public void navigateToSchedule1_view_pending() throws InterruptedException {
        navigateToSchedule1();
        NavigationUtils.navigateToExtn(driver, "/sch1");
    }

    public void navigateToSchedule2_view_pending() throws InterruptedException {
        navigateToSchedule2();
        NavigationUtils.navigateToExtn(driver, "/sch2");
    }

    public void navigateToSchedule3_view_pending() throws InterruptedException {
        navigateToSchedule3();
        NavigationUtils.navigateToExtn(driver, "/sch3");
    }

    public void navigateToSchedule4_view_pending() throws InterruptedException {
        navigateToSchedule4();
        NavigationUtils.navigateToExtn(driver, "/sch4");
    }

    public void navigateToSchedule5_view_pending() throws InterruptedException {
        navigateToSchedule5();
        NavigationUtils.navigateToExtn(driver, "/sch5");
    }

    public void navigateToSchedule6_view_pending() throws InterruptedException {
        navigateToSchedule6();
        NavigationUtils.navigateToExtn(driver, "/sch6");
    }

    public void navigateToSchedule7_view_pending() throws InterruptedException {
        navigateToSchedule7();
        NavigationUtils.navigateToExtn(driver, "/sch7");
    }

    public void navigateToSchedule8_view_pending() throws InterruptedException {
        navigateToSchedule8();
        NavigationUtils.navigateToExtn(driver, "/sch8");
    }

    public void navigateToSchedule9_view_pending() throws InterruptedException {
        navigateToSchedule9();
        NavigationUtils.navigateToExtn(driver, "/sch9");
    }

    public void navigateToSchedule10_view_pending() throws InterruptedException {
        navigateToSchedule10();
        NavigationUtils.navigateToExtn(driver, "/sch10");
    }

    public void navigateToSchedule11_view_pending() throws InterruptedException {
        navigateToSchedule11();
        NavigationUtils.navigateToExtn(driver, "/sch11");
    }

    public void navigateToSchedule12_view_pending() throws InterruptedException {
        navigateToSchedule12();
        NavigationUtils.navigateToExtn(driver, "/sch12");
    }

    public void navigateToSchedule12A_view_pending() throws InterruptedException {
        navigateToSchedule12A();
        NavigationUtils.navigateToExtn(driver, "/sch12A");
    }

    public void navigateToSchedule12B_view_pending() throws InterruptedException {
        navigateToSchedule12B();
        NavigationUtils.navigateToExtn(driver, "/sch12B");
    }

    public void navigateToSchedule12C_view_pending() throws InterruptedException {
        navigateToSchedule12C();
        NavigationUtils.navigateToExtn(driver, "/sch12C");
    }

    public void navigateToSchedule13_view_pending() throws InterruptedException {
        navigateToSchedule13();
        NavigationUtils.navigateToExtn(driver, "/sch13");
    }

    public void navigateToFTO_view_pending() throws InterruptedException {
        navigateToFTO();
        NavigationUtils.navigateToExtn(driver, "/sch1");
    }

    public void navigateToEFTO_view_pending() throws InterruptedException {
        navigateToEFTO();
        NavigationUtils.navigateToExtn(driver, "/sch1");
    }

    public void navigateToManageTPAddress_view_pending() throws InterruptedException {
        navigateToManageTPAddress();
        NavigationUtils.navigateToExtn(driver, "/sch1");
    }

    public void navigateToManageCoOrdinate_view_pending() throws InterruptedException {
        navigateToManageCoOrdinate();
        NavigationUtils.navigateToExtn(driver, "/sch3");
    }

    public void navigateToManageTPRRR_view_pending() throws InterruptedException {
        navigateToManageTPRRR();
        NavigationUtils.navigateToExtn(driver, "/sch1");
    }

    public void navigateToDarkFibre_view_pending() throws InterruptedException {
        navigateToDarkFibre();
        NavigationUtils.navigateToExtn(driver, "/sch1");
    }*/
}
