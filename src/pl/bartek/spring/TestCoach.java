package pl.bartek.spring;

public class TestCoach implements Coach{
    @Override
    public String training() {
        return "Move your arse";
    }
}
