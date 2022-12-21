package surroundings;

public enum Whether{
    CALM ("Штиль"),
    WINDY ("Ветренно"),
    RAINY ("Дождливо"),
    SNOWY ("Снежно");
    private final String whether;
    Whether(String w){
        whether = w;
    }
    @Override
    public String toString(){
        return whether;
    }
}