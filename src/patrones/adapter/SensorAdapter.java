package adapter;

public class SensorAdapter implements TemperatureProvider {
    private FahrenheitSensor f = new FahrenheitSensor();

    public SensorAdapter(FahrenheitSensor f) {
        this.f = f;
    }

    @Override
    public double getTemperatureCelsius() {
        double t = (f.readFahrenheit() - 32) * 5 / 9;
        return t;
    }

}
