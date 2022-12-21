package creatures;

import objects.Boat;
import objects.PhysicalObject;

public class Crowd extends Troll{

    public Crowd(String name) {
        super(name);
    }
    @Override
    public void row(Boat boat) {
        System.out.println(this.getName() + " гребут в " + boat.getName());
        boat.sail();
    }
    @Override
    public void look(PhysicalObject object) {
        System.out.println(this.getName() + " посмотрели на " + object.getName());
    }
    @Override
    public void look(Troll troll) {
        System.out.println(this.getName() + " посмотрели на " + troll.getName());
    }
    @Override
    public void take(PhysicalObject obj) {
        System.out.println(this.getName() + " взяли " + obj.getName());
    }
    @Override
    public void put(PhysicalObject obj) {
        System.out.println(this.getName() + " положили " + obj.getName());
    }
    @Override
    public void sit(PhysicalObject obj) {
        System.out.println(this.getName() + " сели на " + obj.getName());
    }
    @Override
    public void move(Speed speed) {
        System.out.println(this.getName() + " пошли " + speed.toString());
    }
    @Override
    public void move(Speed speed, Troll troll) {
        System.out.println(this.getName() + " пошли к " + troll.getName() + " " + speed.toString());
    }
    @Override
    public void fall() {
        System.out.println(this.getName() + " упали");
    }
    @Override
    public void hear(Troll troll) {
        System.out.println(this.getName() + " услышали " + troll.getName());
    }

    public void applaud(){
        System.out.println(this.getName() + " аплодирует");
    }

    public void pounce(Troll troll) {
        System.out.println(this.getName() + " набросилась на " + troll.getName());
    }
}
