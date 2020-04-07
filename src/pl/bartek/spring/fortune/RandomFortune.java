package pl.bartek.spring.fortune;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class RandomFortune implements FortuneService{
    @Override
    public String getFortune() {
        Map<Integer, String> fortuneMap = new HashMap<>();
        fortuneMap.put(0, "1 - Damn Boy, This map is THICC");
        fortuneMap.put(1, "2 - Fortune doesn't favourites League players");
        fortuneMap.put(2, "3 - Oh boy, it's retarded");
        Random random = new Random();
        return fortuneMap.get(random.nextInt(3));
    }
}
