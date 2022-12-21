package creatures;

public enum Speed {
    SLOWLY ("Медленно"),
    AVERAGE ("Средне"),
    FAST ("Быстро");
    private final String speed;
    Speed(String s){
        speed = s;
    }
    @Override
    public String toString(){
        return speed;
    }
}
