package surroundings;

import java.util.Objects;

public class Environment{
    private TimeOfDay _Time;
    private Whether _Whether;

    public void setTime(TimeOfDay time){
        _Time = time;
        System.out.println("Время - " + _Time);
    }
    public void setWhether(Whether whether){
        _Whether = whether;
        System.out.println("Погода - " + _Whether);
    }

    public Whether getWhether() {
        return _Whether;
    }

    public TimeOfDay getTime() {
        return _Time;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this._Whether);
    }
    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null) return false;
        if (!object.getClass().equals(this.getClass())) return false;
        Environment other = (Environment) object;
        return _Time.equals(other._Time) && _Whether.equals(other._Whether);
    }

}


