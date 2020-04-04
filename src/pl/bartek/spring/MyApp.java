package pl.bartek.spring;

import pl.bartek.spring.coaches.Coach;
import pl.bartek.spring.coaches.TrackCoach;

public class MyApp {
    public static void main(String[] args) {
        Coach baseballCoach = new TrackCoach();
        System.out.println(baseballCoach.training());
    }
}
