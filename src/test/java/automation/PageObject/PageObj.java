package automation.PageObject;

public class PageObj {

    public static final String emailField = "//input[@id='email']";
    public static final String passwordField = "//input[@id='password']";
    public static final String login_link = "//a[@class='landingButton secondary']";
    public static final String loginButton = "//button[normalize-space()='sign in']";
    public static final String headerBanner = "//p[contains(text(),'We have data from 18/09/2023 to 22/04/2024. For mo')]";


    //Algorithm

    public static final String fundamentals_tile = "//a[@href='/algorithms/fundamental']//button[@class='algorithm-cards__predominantButton'][normalize-space()='Submit']";
    public static final String stocks_tab= "//span[normalize-space()='Stocks']";
    public static final String first_stock= "//span[normalize-space()='IBEX35']";
    public static final String first_add= "//button[@id='ES0125220311']//*[name()='svg']";
    public static final String second_add= "//button[@id='ES0132105018']//*[name()='svg']";
    public static final String toggle= "//input[@aria-label='controlled']";
    public static final String submit_tab= "//span[normalize-space()='Submit']";
    public static final String table= "//table[1]";


    //Save Simulation

   public static final String save_simulation= "//span[normalize-space()='Save simulation']";
   public static final String simulation_name ="//input[@id='name']";
   public static final String save_simulation_btn ="//button[normalize-space()='Save']";
   public static final String saved_algo_menu ="button[class='nav__link nav__logo tabColor'] i[class='nav__icon'] svg";
   public static final String saved_algo_test = "//span[normalize-space()='Test']";
   }
    
        

