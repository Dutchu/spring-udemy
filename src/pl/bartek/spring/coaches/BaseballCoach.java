package pl.bartek.spring.coaches;

import pl.bartek.spring.fortune.FortuneService;

public class BaseballCoach implements Coach {

    //private field for dependency
    private FortuneService fortuneService;

    //constructor for dependency
    public BaseballCoach(FortuneService theFortuneService){
        this.fortuneService = theFortuneService;
    }

    public BaseballCoach() {

    }

    @Override
    public String getFortune() {
        return fortuneService.getFortune();
    }
    @Override
    public String training() {
        return "10 x home runs";
    }
}
