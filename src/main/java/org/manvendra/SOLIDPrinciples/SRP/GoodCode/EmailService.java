package main.java.org.manvendra.SOLIDPrinciples.SRP.GoodCode;

/*
*  single responsibility to send email noti to customer
* */
public class EmailService {
    public void sendEmailNotification(){
        System.out.println("Sending email notification for invoice having id '"
                 + "' to customer ");
    }
}
