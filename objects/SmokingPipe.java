package objects;


public class SmokingPipe extends PhysicalObject{
    public SmokeRings rings;

    public SmokingPipe(String name, Size size) {
        super(name, size);
    }

    public void smoke(){
        this.rings = new SmokeRings("Кольца дыма", Size.LITTLE);
    }
    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null) return false;
        if (!object.getClass().equals(this.getClass())) return false;
        SmokingPipe other = (SmokingPipe) object;
        return getName().equals(other.getName());
    }
    public class SmokeRings extends PhysicalObject{
        String name;
        private SmokeRings(String name, Size size){
            super(name, size);
            System.out.println("Трубка выпустила кольца дыма");
        }
    }
}
