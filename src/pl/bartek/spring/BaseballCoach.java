package pl.bartek.spring;

public class BaseballCoach implements Coach{
    @Override
    public String training() {
        return "10 x home runs";
    }
}
