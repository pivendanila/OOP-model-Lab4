package surroundings;

public enum Weather {
    CALM ("Штиль"),
    WINDY ("Ветренно"),
    RAINY ("Дождливо"),
    SNOWY ("Снежно");
    private final String whether;
    Weather(String w){
        whether = w;
    }
    @Override
    public String toString(){
        return whether;
    }
}