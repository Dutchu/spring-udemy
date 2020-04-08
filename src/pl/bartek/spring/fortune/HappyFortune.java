package pl.bartek.spring.fortune;

public class HappyFortuneService implements FortuneService{
    @Override
    public String getFortune() {
        return "RNGjesus smiles to you";
    }
}
