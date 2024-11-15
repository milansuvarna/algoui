package automation.PageObject;

public class PageObj {

    public static final String emailField = "//input[@id='email']";
    public static final String passwordField = "//input[@id='password']";
    public static final String login_link = "//a[@class='landingButton secondary']";
    public static final String loginButton = "//button[normalize-space()='sign in']";
    public static final String headerBanner = "//p[contains(text(),'We have data from 18/09/2023 to 22/04/2024. For mo')]";


    //Algorithm

    public static final String fundamentals_tile = "//a[@href='/algorithms/fundamental']//button[@class='algorithm-cards__predominantButton'][normalize-space()='Submit']";
    public static final String first_name= "//input[@id='first-name']";
    public static final String last_name= "//input[@id='last-name']";
    public static final String zip_code= "//input[@id='postal-code']";
    public static final String continue_checkout= " //input[@id='continue']";
        
}
