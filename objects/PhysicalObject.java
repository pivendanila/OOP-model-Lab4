package objects;

import java.util.Objects;

public abstract class PhysicalObject {
    private String name;
    private Size size;

    public PhysicalObject(String name, Size size) {
        this.name = name;
        this.size = size;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Size getSize() {
        return this.size;
    }
    @Override
    public int hashCode() {
        return Objects.hash(this.name);
    }
    @Override
    public String toString() {
        return this.name;
    }
    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        } else if (object == null) {
            return false;
        } else if (!object.getClass().equals(this.getClass())) {
            return false;
        } else {
            PhysicalObject other = (PhysicalObject)object;
            return this.name.equals(other.getName()) && this.size.equals(other.getSize());
        }
    }
}