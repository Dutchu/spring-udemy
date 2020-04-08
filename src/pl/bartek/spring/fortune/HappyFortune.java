package pl.bartek.spring.fortune;

public class HappyFortune implements FortuneService{
    @Override
    public String getFortune() {
        return "RNGjesus smiles to you";
    }
}
