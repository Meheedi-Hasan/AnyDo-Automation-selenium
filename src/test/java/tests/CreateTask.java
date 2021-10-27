package tests;

import base.BaseTests;
import model.CommonMethods;
import model.Locators;
import model.Timout;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.HomePage;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

public class CreateTask {
    BaseTests baseTests = new BaseTests();
    WebDriver driver = baseTests.setUp();
    Timout timeout = new Timout();
    CommonMethods commonMethods = new CommonMethods(driver);
    HomePage homePage = new HomePage(driver);


    @BeforeClass
    public void setUp () throws InterruptedException {
        driver.manage().window().maximize();
        driver.get(homePage.homePageUrl());
        
        //signin with facebook
//        commonMethods.clickOnButton(Locators.fbLoginBtn);
//        timeout.timeout();
//        commonMethods.setText(Locators.emailField, Locators.email);
//        timeout.timeout();
//        commonMethods.setText(Locators.passField, Locators.pass);
//        timeout.timeout();
//        commonMethods.clickOnButton(Locators.loginBtn);
//        timeout.timeout();
//        commonMethods.clickOnButton(Locators.continueBtn);
//        timeout.timeout();
//        Thread.sleep(2000);
        
        //signin with google
//        commonMethods.clickOnButton(Locators.googleBtn);
//        timeout.timeout();
//        commonMethods.setText(Locators.emailField, Locators.emailId);
//        timeout.timeout();
//        commonMethods.clickOnButton(Locators.emailBtn);
//        timeout.timeout();
//        Thread.sleep(2000);
//        //commonMethods.setText(Locators.fullName, Locators.fullNameText);
//        //timeout.timeout();
//        commonMethods.setText(Locators.passField, Locators.pass);
//        timeout.timeout();
//        commonMethods.clickOnButton(Locators.submitBtn);
//        timeout.timeout();
        
        
        //continue with email
       commonMethods.clickOnButton(Locators.continueEmailBtn);
      timeout.timeout();
      commonMethods.setText(Locators.emailField, Locators.emailId);
      timeout.timeout();
      commonMethods.clickOnButton(Locators.emailBtn);
      timeout.timeout();
      Thread.sleep(2000);
//      commonMethods.setText(Locators.fullName, Locators.fullNameText);
//      timeout.timeout();
//      Thread.sleep(2000);
      commonMethods.setText(Locators.passField, Locators.pass);
      timeout.timeout();
      commonMethods.clickOnButton(Locators.submitBtn);
      timeout.timeout();
      Thread.sleep(5000);
    }
    
//    @Test(priority = 1)
//    public void signIn () throws InterruptedException {
//    	commonMethods.clickOnButton(Locators.continueEmailBtn);
//        timeout.timeout();
//        commonMethods.setText(Locators.emailField, Locators.emailId);
//        timeout.timeout();
//        commonMethods.clickOnButton(Locators.emailBtn);
//        timeout.timeout();
//        Thread.sleep(2000);
//        commonMethods.setText(Locators.fullName, Locators.fullNameText);
//        timeout.timeout();
//        Thread.sleep(2000);
//        commonMethods.setText(Locators.passField, Locators.pass);
//        timeout.timeout();
//        commonMethods.clickOnButton(Locators.submitBtn);
//        timeout.timeout();
//    }
    
    @Test(priority = 1)
    public void myDailyTask() throws InterruptedException{
    	commonMethods.clickOnButton(Locators.createBtn);
    	timeout.timeout();
    	commonMethods.setText(Locators.wantTo, Locators.wantToText);
    	timeout.timeout();
    	commonMethods.clickOnButton(Locators.addTaskBtn);
    	String createTask = commonMethods.getText(Locators.myDailyTask);
        assertEquals(createTask, Locators.myDailyTaskText);
        System.out.println("Successfully Task created and displayed on home page");
    }
    
    @Test(priority = 2)
    public void myFridayTask() throws InterruptedException{
    	commonMethods.clickOnButton(Locators.createBtn);
    	timeout.timeout();
    	commonMethods.setText(Locators.wantTo, Locators.FridayText);
    	timeout.timeout();
    	commonMethods.setText(Locators.fridayInsertNote, Locators.fridayInsertText);
    	timeout.timeout();
    	Thread.sleep(2000);
    	commonMethods.clickOnButton(Locators.nextWeekBtn);
    	timeout.timeout();
    	Thread.sleep(2000);
    	commonMethods.clickOnButton(Locators.addTaskBtn);
    	timeout.timeout();
        String myFridayTask = commonMethods.getText(Locators.myFridayTask);
        assertEquals(myFridayTask, Locators.FridayText);
        System.out.println("Successfully Task created and displayed on home page");
    }
    
    @Test(priority = 3)
    public void subTask() throws InterruptedException{
    	Thread.sleep(2000);
    	commonMethods.clickOnButton(Locators.subTaskBtn);
    	timeout.timeout();
    	commonMethods.setTextWithClick(Locators.subTaskItemBtn, Locators.subTaskItemText);
    	timeout.timeout();
    	commonMethods.clickOnButton(Locators.justClick);
    	timeout.timeout();
    	Thread.sleep(2000);
        //String subTask = commonMethods.getText(Locators.wakeUpEarly);
       // assertEquals(subTask, Locators.subTaskItemText);
        System.out.println("Successfully sub task created");
    }
    @Test(priority = 4)
    public void list() throws InterruptedException{
    	driver.navigate().back();
    	commonMethods.clickOnButton(Locators.listIcon);
    	timeout.timeout();
    	Thread.sleep(2000);
    	commonMethods.setTextWithClick(Locators.nameList, Locators.listText);
    	timeout.timeout();
    	commonMethods.clickOnButton(Locators.listBtn);
    	timeout.timeout();
//        String list = commonMethods.getText(Locators);
//        assertEquals(list, Locators);
        System.out.println("Successfully New list appended on list category");
    }
    
    
    
       
//    //sneakers
//    @Test(priority = 1)
//    public void sneakersTest () {
//        timeout.timeout();
//        commonMethods.clickOnButton(Locators.sneakers);
//        timeout.timeout();
//
//        assertEquals(homePage.getCurrentUrl(), Locators.sneakersUrl);
//        System.out.println("Successfully visit sneakers");
//    }

//    //koreanBeauty
//    @Test (priority = 2)
//    public void koreanBeauty () {
//        commonMethods.back();
//        timeout.timeout();
//        commonMethods.clickOnButton(Locators.koreanBeauty);
//        timeout.timeout();
//
//        assertEquals(homePage.getCurrentUrl(), Locators.koreanBeautyUrl);
//        System.out.println("Successfully visit koreanBeauty");
//    }
//
//    //wristWatches
//    @Test (priority = 3)
//    public void wristWatches () {
//        commonMethods.back();
//        timeout.timeout();
//        commonMethods.clickOnButton(Locators.wristWatches);
//        timeout.timeout();
//
//        assertEquals(homePage.getCurrentUrl(), Locators.wristWatchesUrl);
//        System.out.println("Successfully visit wristWatches");
//    }
//    //fishing
//    @Test (priority = 4)
//    public void fishing () {
//        commonMethods.back();
//        timeout.timeout();
//        commonMethods.clickOnButton(Locators.fishing);
//        timeout.timeout();
//
//        assertEquals(homePage.getCurrentUrl(), Locators.fishingUrl);
//        System.out.println("Successfully visit fishing");
//    }
//    //collectibles
//    @Test (priority = 5)
//    public void collectibles () {
//        commonMethods.back();
//        timeout.timeout();
//        commonMethods.clickOnButton(Locators.collectibles);
//        timeout.timeout();
//
//        assertEquals(homePage.getCurrentUrl(), Locators.collectiblesUrl);
//        System.out.println("Successfully visit collectibles");
//    }
//    //smartPhones
//    @Test (priority = 6)
//    public void healthAndBeautyTest () {
//        commonMethods.back();
//        timeout.timeout();
//        commonMethods.clickOnButton(Locators.smartPhones);
//        timeout.timeout();
//
//        assertEquals(homePage.getCurrentUrl(), Locators.smartPhonesUrl);
//        System.out.println("Successfully visit smartPhones");
//    }
//
//    //popularSell
//    @Test (priority = 7)
//    public void homeAndGardenTest () {
//        commonMethods.back();
//        timeout.timeout();
//        commonMethods.clickOnButton(Locators.popularSell);
//        timeout.timeout();
//
//        assertEquals(homePage.getCurrentUrl(), Locators.popularSellUrl);
//        System.out.println("Successfully visit popularSell" );
//    }

    @AfterClass
    public void tearDown() {
        timeout.timeout();
        //driver.quit();
    }
}

