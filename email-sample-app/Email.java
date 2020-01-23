// thius class depends on the date class, which is in the java.util package
import java.util.Date;

public class Email{
    // Instance variables (we call them 'properties' in web programming)
    public String toAddress;
    public String fromAddress;
    public String subject;
    public String message;
    public Date date;

    // constructor (we call them constructor functions in web programming)
    public Email(String toAddress, String fromAddress, String subject, String message){
        this.toAddress = toAddress;
        this.fromAddress = fromAddress;
        this.subject = subject;
        this.message = message;

    }
    // a method that can be invoked on each email object that is constructed
    public boolean send(){
        System.out.println("Sending Email...");
        System.out.println("To: " + this.toAddress);
        System.out.println("FROM: " + this.fromAddress);
        System.out.println("SUBJECT: " + this.subject);
        System.out.println("MESSAGE: " + this.message);

        // set the date instance variable to the current date
        this.date = new Date();
        System.out.println("SENT: " + this.date.toString());

        // in a real program we would have code to actually send the email
        // and we would return true or false depending on whether or not it succeeded 
        // but for now, we'll just return true...
        return true;
    }
}