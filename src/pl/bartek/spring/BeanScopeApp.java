package pl.bartek.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.bartek.spring.coaches.Coach;

public class BeanScopeApp {
    public static void main(String[] args) {

        //load the spring configuration file
        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        //retrieve bean from spring container
        Coach coach = applicationContext.getBean("coach", Coach.class);
        Coach betaCoach = applicationContext.getBean("coach", Coach.class);

        boolean ifTheSame = (coach == betaCoach);

        System.out.println("Are coaches the same object: " + ifTheSame);

        System.out.println("Memory location of coach: " + coach);

        System.out.println("Memory location of betaCoach: " + betaCoach);

        applicationContext.close();
    }
}
