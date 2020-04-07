package pl.bartek.spring.coaches;

import pl.bartek.spring.fortune.FortuneService;

public class SetterCoach implements Coach {

    private FortuneService fortune;

    public void setFortune(FortuneService theFortune) {
        this.fortune = theFortune;
    }

    @Override
    public String training() {
        return "Now you've fucked up!";
    }

    @Override
    public String getFortune() {
        return fortune.getFortune();
    }
}
