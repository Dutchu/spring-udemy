package pl.bartek.spring.fortune;

public class BadFortune implements FortuneService {
    @Override
    public String getFortune() {
        return "You picked the wrong house fool!";
    }
}
