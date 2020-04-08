package pl.bartek.spring.coaches;

import pl.bartek.spring.fortune.FortuneService;

public class TrackCoach implements Coach {

    private FortuneService fortuneService;

    //constructor for dependency
    public TrackCoach(FortuneService theFortuneService){
        this.fortuneService = theFortuneService;

    }public TrackCoach(){
    }

    /**
     * method called when bean is initialized
     * */
    public void initBean() {
        System.out.println("Bean is initialized");
    }

    /**
     * method called when bean is destroyed
     * */
    public void destroyBean() {
        System.out.println("Bean is being destroyed");
    }

    @Override
    public String getFortuneService() {
        return fortuneService.getFortune();
    }
    @Override
    public String training() {
        return "40 miles of run";
    }

}
