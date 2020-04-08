package pl.bartek.spring.coaches;


import pl.bartek.spring.fortune.FortuneService;

public class TestCoach implements Coach {

    /**private field for dependency*/
    private FortuneService fortuneService;

    /**constructor for dependency*/
    public TestCoach(FortuneService theFortuneService) {
        fortuneService = theFortuneService;

    }

    public TestCoach(){

    }



    @Override
    public String training() {
        return "Move your arse";
    }

    @Override
    public String getFortuneService() {
        return fortuneService.getFortune();
    }
}
