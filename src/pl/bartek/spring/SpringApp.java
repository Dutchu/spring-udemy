package pl.bartek.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.bartek.spring.coaches.Coach;

public class SpringApp {
    public static void main(String[] args) {

        //load spring configuration file
        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        //retrieve bean from spring container
        Coach coach = applicationContext.getBean("coach", Coach.class);

        //call methods on the bean
        System.out.println(coach.training() + "\n" + coach.getFortune());

        //close the context
        applicationContext.close();

    }

}
