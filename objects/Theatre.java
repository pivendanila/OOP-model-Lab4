package objects;

public class Theatre{
    private String name;
    private Size size;

    public Theatre(String name, Size size) {
        this.setName(name);
        this.setSize(size);
    }
    public void setSize(Size size) {
        this.size = size;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Size getSize() {
        return size;
    }
    public String getName() {
        return name;
    }
    PhysicalObject armchair = new PhysicalObject("Кресло", Size.MIDDLE) {
        public void seatUp(){
            System.out.println("Сиденье поднято");
        }
        public void seatDown(){
            System.out.println("Сиденье опущено");
        }
        public void armrestUp(){
            System.out.println("Подклокотники подняты");
        }
        public void armrestDown(){
            System.out.println("Подлокотники опущены");
        }
        public String getTheatreName(){
            return this.getName();
        }
    };
}
