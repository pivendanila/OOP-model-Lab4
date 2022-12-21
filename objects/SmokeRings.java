package objects;

public class SmokeRings extends PhysicalObject{
    String name;
    protected SmokeRings(String name, Size size){
        super(name, size);
        System.out.println("Трубка выпустила кольца дыма");
    }
}
