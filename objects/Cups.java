package objects;

public class Cups extends PhysicalObject{
    private String content;

    public Cups(String name, Size size, String content) {
        super(name, size);
        this.content = content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    public String getContent() {
        return content;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null) return false;
        if (!object.getClass().equals(this.getClass())) return false;
        Cups other = (Cups) object;
        return getName().equals(other.getName()) && getSize().equals(other.getSize()) && getContent().equals(other.getContent());
    }
}
