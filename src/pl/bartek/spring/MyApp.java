package pl.bartek.spring;

public class MyApp {
    public static void main(String[] args) {
        Coach baseballcoach = new TrackCoach();
        System.out.println(baseballcoach.training());
    }
}
