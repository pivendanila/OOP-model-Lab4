package objects;

public class Hat extends PhysicalObject {
    private String condition;
    private String color;

    public Hat(String name, Size size, String color, String condition) {
        super(name, size);
        this.color = color;
        this.condition = condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCondition() {
        return this.condition;
    }

    public String getColor() {
        return this.color;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        } else if (object == null) {
            return false;
        } else if (!object.getClass().equals(this.getClass())) {
            return false;
        } else {
            Hat other = (Hat)object;
            return this.color.equals(other.color) && this.condition.equals(other.condition) && this.getSize().equals(other.getSize());
        }
    }
}
