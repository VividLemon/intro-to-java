public class App{
    public static void main(String[] args){
        Email someEmail = new Email("mom@mom.com", "me@me.com", "Hi Mom", "I need mone!");
        if (someEmail.send()){
            System.out.println("Looks like the email got sent!");
        }
    }
}