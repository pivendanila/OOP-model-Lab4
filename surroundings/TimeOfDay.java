package surroundings;

public enum TimeOfDay{
    MORNING ("Утро"),
    DAY ("День"),
    EVENING ("Вечер"),
    NIGHT ("Ночь");
    private final String time;
    TimeOfDay(String t){
        time = t;
    }
    @Override
    public String toString(){
        return time;
    }
}
