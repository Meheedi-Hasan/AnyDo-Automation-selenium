package model;

import org.openqa.selenium.By;

public class Locators {

    public static String homePageUrl = "https://desktop.any.do/";
    
    //signIn with email
    public static By continueEmailBtn = By.xpath("//button[contains(@class,'AppLoginButton AppLoginButton--email')]");
    public static By emailField = By.xpath("//input[@placeholder='your@email.com']");
    public static String emailId = "mh.hassann19@gmail.com";
//    public static By fullName = By.xpath("//input[@placeholder='Full Name']");
//    public static String fullNameText = "Mehedi Hasan";
    public static By emailBtn = By.xpath("//button[contains(@type,'submit')]");
    public static By passField = By.xpath("//input[@type='password']");
    public static String pass = "7yAgSujtVT@zC!N";
    public static By submitBtn = By.xpath("//button[normalize-space()='Sign In']");
    //public static By submitBtn = By.xpath("//button[normalize-space()='Create Account']");
    
    //signIn with google
    //public static By googleBtn = By.xpath("//button[@class='AppLoginButton AppLoginButton--google']");
    
    //signIn with facebook
//    public static By fbLoginBtn = By.xpath("//button[@class='AppLoginButton AppLoginButton--facebook']");
//    public static By emailField = By.xpath("//input[@id='email']");
//    public static By passField = By.xpath("//input[@id='pass']");
//    public static By loginBtn = By.xpath("//button[@id='loginbutton']");
//    public static By continueBtn = By.xpath("//div[contains(class,'rq0escxv l9j0dhe7')]");
//    
//    public static String email = "mh.hassann19@gmail.com";
//    public static String pass = "zxcvbnm123!@#";
    
    //my daily Task
    public static By createBtn = By.xpath("//button[@aria-label='Create a task']");
    public static By wantTo = By.xpath("//div[@class='SmartTypeNewTaskModalTextFieldWrapper__content']//div//div[@class='public-DraftStyleDefault-block public-DraftStyleDefault-ltr']");
    public static String wantToText = "My Daily Task";
    public static By addTaskBtn = By.xpath("//button[@class='ButtonsBar__button']");
    public static String myDailyTaskText = "My Daily Task";
    public static By myDailyTask = By.xpath("//div[@class='TaskItem__title TaskItem__title--out']");
    
    //my friday task
    //public static By wantTo = By.xpath("//div[@class='SmartTypeNewTaskModalTextFieldWrapper__content']//div//div[@class='public-DraftStyleDefault-block public-DraftStyleDefault-ltr']");
    public static String FridayText = "My Friday Task";
    public static By fridayInsertNote = By.xpath("//textarea[@class='DynamicTextArea__visibleTextArea fs-hide']");
    public static String fridayInsertText = "Hangout with friends";
    public static By nextWeekBtn = By.xpath("//button[normalize-space()='next week']");
    public static By myFridayTask = By.xpath("//div[contains(text(),'My Friday Task')]");
    
    //sub task
    public static By subTaskBtn = By.xpath("//div[contains(text(),'My Friday Task')]");
    public static By subTaskItemBtn = By.xpath("//div[@class='NewSubTaskItemButton__content']");
    public static By wakeUpEarly = By.xpath("//input[@value='Wake up early']");
    public static String subTaskItemText = "Wake up early";
    public static By subTaskItemBtn2 = By.xpath("//div[@class='NewSubTaskItemButton__mainContent']");
    //public static By justClick = By.xpath("//h4[normalize-space()='Subtasks']");
    //public static By justClick2 = By.xpath("//div[@class='AppHeader__controls']");
    
    //List
    public static By listIcon = By.xpath("//div[@class='AppSidebarEditButtonsBox']//button[2]");
    public static By nameList = By.xpath("//div[@class='AppSidebarModalTextFieldEditContent__tfContainer']");
    public static By listBtn = By.xpath("//button[@data-qa='APPROVE']");
    public static String listText = "My Shopping List";
    
    //Shopping List
    public static By shoppingListBtn = By.xpath("//a[@class='AppSidebarGroupsItems__item__link AppSidebarGroupsItems__item__link--active']");
    public static By shoppingListTextField = By.xpath("//div[@class='public-DraftStyleDefault-block public-DraftStyleDefault-ltr']");
    public static By enterBtn = By.xpath("//button[@type='submit']");
    public static String shoppingText1= "T-shirt";
    public static String shoppingText2= "Pant";
    public static String shoppingText3= "Mouse";
    public static String shoppingText4= "KeyBoard";
    

}
