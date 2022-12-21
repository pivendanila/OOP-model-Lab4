package objects;

public enum Size {
    LITTLE ("Маленький"),
    MIDDLE ("Средний"),
    BIG ("Большой");
    private final String size;
    Size(String s){size = s;}
    @Override
    public String toString(){
        return size;
    }
}
