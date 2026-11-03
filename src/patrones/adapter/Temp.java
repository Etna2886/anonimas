package adapter;

public class Temp implements TemperatureProvider {

    private double temperatura;

    public Temp(double temperatura) {
        this.temperatura = temperatura;
    }

    @Override
    public double getTemperatureCelsius() {
        return temperatura;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

}
