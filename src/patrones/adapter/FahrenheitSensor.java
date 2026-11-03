package adapter;

public class FahrenheitSensor {

    private double temp;

    public double readFahrenheit() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public FahrenheitSensor(double temp) {
            this.temp = temp;
        }

    public FahrenheitSensor() {
        super();
    }

}
