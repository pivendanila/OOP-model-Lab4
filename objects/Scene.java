package objects;

import exceptions.WrongAngleException;

public class Scene extends PhysicalObject{
    private final int default_angle = 180;

    public Scene(String name, Size size) {
        super(name, size);
    }

    public void rotate(){
        System.out.println(this.getName() + " поворачивается");
    }

    public void rotate(int angle) throws WrongAngleException {
        if (angle >= -360 && angle <= 360){
            System.out.println(this.getName() + " поворачивается на " + angle + " градусов");
        }
        else{
            throw new WrongAngleException("Сцена не может повернуться на " + angle + " градусов");
        }
    }

}
