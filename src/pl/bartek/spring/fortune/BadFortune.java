package pl.bartek.spring.fortune;

public class BadFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "You picked the wrong house fool!";
    }
}
