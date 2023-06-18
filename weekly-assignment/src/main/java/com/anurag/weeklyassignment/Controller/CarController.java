package com.anurag.weeklyassignment.Controller;




import EmailSend.MailHandler;
import com.anurag.weeklyassignment.Objects.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ComponentScan(basePackages = {"EmailSend"})

public class CarController {

    @Autowired // Annotation
    @Qualifier("green")
    Car c;

    @GetMapping("color")
    public String getCarColor() {

        String color = c.getColor();
        System.out.println(color);
        System.out.println("Starting to send out Mail");

        MailHandler mailHandler = new MailHandler();
        mailHandler.sendMail(color);
        return color;
    }

}
