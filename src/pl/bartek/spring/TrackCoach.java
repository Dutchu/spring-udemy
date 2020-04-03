package pl.bartek.spring;

public class TrackCoach implements Coach {
    @Override
    public String training() {
        return "40 miles of run";
    }
}
