package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.sql.Time;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


@Component
public class AnimalsCage {

    @Qualifier("dog")
    @Autowired
    private Animal animal;

    @Autowired
    private Timer timer=new Timer();


      public Timer getTimer() {
        return timer;
    }
    public void whatAnimalSay() {

        System.out.println("Say:");
        System.out.println(animal.toString());
        System.out.println("At:");
        System.out.println(timer.getTime());
        System.out.println("________________________");
    }
}
