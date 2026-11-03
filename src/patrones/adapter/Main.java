package adapter;

public class Main {
    public static void main(String[] args) {
        FahrenheitSensor f = new FahrenheitSensor(200.56);
        SensorAdapter s = new SensorAdapter(f);
        System.out.println(String.format("%.1f", s.getTemperatureCelsius()));
    }
}
