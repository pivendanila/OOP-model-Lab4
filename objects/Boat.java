package objects;

public class Boat extends PhysicalObject {
    public Boat(String name, Size size){
        super(name, size);
    }
    public void sail(){
        System.out.println(this.getName() + " плывет");
    }
}
