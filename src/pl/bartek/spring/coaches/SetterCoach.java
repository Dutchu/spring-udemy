package pl.bartek.spring.coaches;

import pl.bartek.spring.fortune.FortuneService;

public class SetterCoach implements Coach {

    private FortuneService fortuneService;
    private String email;
    private String team;

    public void setEmail(String theEmail) {
        this.email = theEmail;
    }

    public void setTeam(String theTeam) {
        this.team = theTeam;
    }

    public void setFortuneService(FortuneService theFortune) {
        this.fortuneService = theFortune;
    }

    @Override
    public String training() {
        return "Now we'll set you up";
    }

    @Override
    public String getFortuneService() {
        return fortuneService.getFortune();
    }

    public String getEmail() {
        return email;
    }

    public String getTeam() {
        return team;
    }
}
