package pl.bartek.spring.coaches;

import pl.bartek.spring.fortune.FortuneService;

public class TrackCoach implements Coach {

    private FortuneService fortuneService;

    //constructor for dependency
    public TrackCoach(FortuneService theFortuneService){
        this.fortuneService = theFortuneService;

    }public TrackCoach(){
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
