package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


@Component
public class AnimalsCage {

    @Autowired
    @Qualifier("dog")
    private Animal animal;

    private String lastTimeOutput;

    @Autowired
    private Timer timer;

    public Timer getTimer() {
        return timer;
    }
    public void whatAnimalSay() {

        if (lastTimeOutput == null) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            lastTimeOutput = LocalDateTime.now().format(formatter);
        }
        System.out.println("Say:");
        System.out.println(animal.toString());
        System.out.println("At:");
        System.out.println(lastTimeOutput);
        System.out.println("________________________");
    }
}
