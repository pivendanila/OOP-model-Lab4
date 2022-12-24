package surroundings;

import java.util.Objects;

public class Environment{
    private TimeOfDay _Time;
    private Weather _Weather;

    public void setTime(TimeOfDay time){
        _Time = time;
        System.out.println("Время - " + _Time);
    }
    public void setWhether(Weather weather){
        _Weather = weather;
        System.out.println("Погода - " + _Weather);
    }

    public Weather getWhether() {
        return _Weather;
    }

    public TimeOfDay getTime() {
        return _Time;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this._Weather);
    }
    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null) return false;
        if (!object.getClass().equals(this.getClass())) return false;
        Environment other = (Environment) object;
        return _Time.equals(other._Time) && _Weather.equals(other._Weather);
    }

}


