
package creatures;

import java.util.ArrayList;
import java.util.Objects;

import exceptions.EmptyStringException;
import objects.PhysicalObject;
import objects.SmokingPipe;
import objects.Theatre;

public class Troll implements Thinkable, Rowable {
    private final String name;
    private int speed = 0;

    public Troll(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void think(String phrase){
        if(phrase == ""){
            throw new EmptyStringException("Мысль не может быть пустой");
        }
        else {
            System.out.println(this.getName() + " подумал: " + phrase);
        }
    }

    public void row(PhysicalObject.Boat boat) {
        System.out.println(this.name + " гребет в " + boat.getName());
        boat.sail();
    }

    public void look(PhysicalObject object) {
        System.out.println(this.name + " посмотрел на " + object.getName());
    }

    public void look(Troll troll) {
        System.out.println(this.name + " посмотрел на " + troll.name);
    }

    public void use(PhysicalObject object) {
        System.out.println(this.name + " использовал " + object.getName());
    }

    public void use(SmokingPipe pipe) {
        System.out.println(this.name + " покурил " + pipe.getName());
        pipe.smoke();
    }

    public void take(PhysicalObject obj) {
        System.out.println(this.name + " взял " + obj.getName());
    }

    public void put(PhysicalObject obj) {
        System.out.println(this.name + " положил " + obj.getName());
    }

    public void sit(PhysicalObject obj) {
        System.out.println(this.name + " сел на " + obj.getName());
    }
    public void getOut(PhysicalObject obj){
        System.out.println(this.getName() + " вылез из " + obj.getName());
    }

    public void move(int speed) {
        System.out.println(this.name + " пошел со скоростью " + speed);
    }

    public void move(int speed, Troll troll) {
        class SpeedConverter {
            int multiply(int speed, int factor) {
                return speed*factor;
            }
        }
        SpeedConverter converter = new SpeedConverter();
        this.speed = converter.multiply(speed, 2);

        System.out.println(this.name + " пошел к " + troll.name + " со скорростью " + speed);
    }

    public void fall() {
        System.out.println(this.name + " упал");
    }

    public void hear(Troll troll) {
        System.out.println(this.name + " услышал " + troll.getName());
    }

    public void laugh() {
        System.out.println(this.name + " смеется");
    }

    public void jump(PhysicalObject obj){
        System.out.println(this.getName() + " прыгнул через " + obj.getName());
    }
    public void jump(){
        System.out.println(this.getName() + " прыгнул");
    }
    public void swim(PhysicalObject obj){
        System.out.println(this.getName() + " поплыл к " + obj.getName());
    }
    public void swim(Theatre th){
        System.out.println(this.getName() + " поплыл к " + th.getName());
    }

    public int hashCode() {
        return Objects.hash(this.name);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        } else if (object == null) {
            return false;
        } else if (!object.getClass().equals(this.getClass())) {
            return false;
        } else {
            Troll other = (Troll)object;
            return this.name.equals(other.name);
        }
    }

    public String toString() {
        return this.name;
    }
}
