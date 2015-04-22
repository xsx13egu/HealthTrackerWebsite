package avivahealthtracker;
//import java.util.Date;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Calendar;
import java.util.ArrayList;
//import javax.servlet.ServletException;

public class User {

    private String firstName;
    private String surname;
    private String emailAddress;
    private int height;
    private float weight;
    private int dobDays;
    private int dobMonths;
    private int dobYears;
    private gender gender;
    private String city;
    private String password;
    private int age;
    private ArrayList groups;

    public User() {
        firstName = null;
        surname = null;
        emailAddress = null;
        height = 0;
        weight = 0;
        dobDays = 0;
        dobMonths = 0;
        dobYears = 0;
        gender = null;
        city = null;
        password = null;
        age = 0;
        groups = new ArrayList();
    }

    public User(String emailAddress, String password) {
        this.emailAddress = emailAddress;
        this.password = password;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the surname
     */
    public String getSurname() {
        return surname;
    }

    /**
     * @param surname the surname to set
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     * @return the emailAddress
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * @param emailAddress the emailAddress to set
     */
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    /**
     * @return the height
     */
    public int getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * @return the weight
     */
    public float getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(float weight) {
        this.weight = weight;
    }

    /**
     * @return the gender
     */
    public gender getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(gender gender) {
        this.gender = gender;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the dobDays
     */
    public int getDobDays() {
        return dobDays;
    }

    /**
     * @param dobDays the dobDays to set
     */
    public void setDobDays(int dobDays) {
        this.dobDays = dobDays;
    }

    /**
     * @return the dobMonths
     */
    public int getDobMonths() {
        return dobMonths;
    }

    /**
     * @param dobMonths the dobMonths to set
     */
    public void setDobMonths(int dobMonths) {
        this.dobMonths = dobMonths;
    }

    /**
     * @return the dobYears
     */
    public int getDobYears() {
        return dobYears;
    }

    /**
     * @param dobYears the dobYears to set
     */
    public void setDobYears(int dobYears) {
        this.dobYears = dobYears;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    public enum gender {

        male,
        female
    }

    public int calculateAge(int dobDays, int dobMonths, int dobYears) {
        Calendar current = Calendar.getInstance();
        int currYear = current.get(Calendar.YEAR);
        //Warning, calendar may be broken
        int currMonth = current.get(Calendar.MONTH) + 1;
        int currDay = current.get(Calendar.DATE);
        int ageTest = currYear - dobYears;
        if (ageTest > 0) {
            if (currMonth > dobMonths) {
                age = ageTest;
            } else if (currMonth < dobMonths) {
                age = ageTest - 1;
            } else if (currMonth == dobMonths) {
                if (currDay >= dobDays) {
                    age = ageTest;
                } else {
                    age = ageTest - 1;
                }
            }
        } else {
            System.out.println("ILLEGAL AGE");
            age = -1;
        }
        System.out.println("Current date: " + currYear + " " + currMonth + " " + currDay);
        System.out.println("Birthdate: " + dobYears + " " + dobMonths + " " + dobDays);
        System.out.println("Age: " + age);
        return age;
    }

    @Override
    public String toString() {
        return "User data: " + firstName + " " + surname + " " + emailAddress + " " + height + " " + weight + " " + age + " " + gender + " " + city + " " + password;
    }
    
//    public User getInfo(String email)throws ServletException{
//        try{
//        DBAccess db2 = new DBAccess();
//        Connection con = db2.getConnection();
//        PreparedStatement statement = con.prepareStatement("SELECT * FROM userDatabase where email=?");
//        statement.setString(1, email);
//        ResultSet rs = statement.executeQuery();
//        
//        email = "";
//        String password = "";
//        
//        while (rs.next()){
//            email = rs.getString("email");
//
//            password = rs.getString("password");
//        }
//        
//        User returnVal = new User(email, password);
//        
//        return returnVal;
//        
//        }catch (Exception e) {
//            throw new ServletException("Persist Problem", e);}}
//        
//    
//    
//    public boolean isValid() throws ServletException{
//        //This allows a successful log in or not
//        try{
//        DBAccess db2 = new DBAccess();
//        Connection con = db2.getConnection();
//        PreparedStatement ps2 = con.prepareStatement("SELECT email FROM userDatabase where email=? and password=?");
//        
//        
//        ps2.setString(1, emailAddress);
//        ps2.setString(2, password);
//        
//        ResultSet rs = ps2.executeQuery();
//        
//        if (rs.next()){
//            return true;
//        }
//        return false;
//        }
//         catch (Exception e) {
//            throw new ServletException("Persist Problem", e);}}
//  
//    public void persist() throws ServletException {
//        try {
//            
//            DBAccess db = new DBAccess();
//            Connection con = db.getConnection();
//            PreparedStatement ps = con.prepareStatement("INSERT INTO userDatabase VALUES (?,?)");
//
//            ps.setString(1, emailAddress);
//            ps.setString(2, password);
//            ps.executeUpdate();}
//            
//            catch (Exception e) {
//            throw new ServletException("Persist Problem", e);}}
}
