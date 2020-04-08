package pl.bartek.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.bartek.spring.coaches.Coach;
import pl.bartek.spring.coaches.SetterCoach;

public class InjectionApp {
    public static void main(String[] args) {

        //load spring configuration file
        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        //retrieve bean from spring container
        Coach coach = applicationContext.getBean("coach", Coach.class);

        SetterCoach setterCoach = applicationContext.getBean("setterCoach", SetterCoach.class);

        //call methods on the bean
        System.out.println(coach.training() + "\n" + coach.getFortuneService());
        System.out.println(setterCoach.training() + "\n" + setterCoach.getFortuneService());
        System.out.println(setterCoach.getEmail() + "\n" + setterCoach.getTeam());


        //close the context
        applicationContext.close();

    }

}
