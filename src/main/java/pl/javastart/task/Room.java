package pl.javastart.task;

public class Room {
    private double quaterMeters;
    private double temperature;
    private boolean airConditioner;

    public Room(double quaterMeters, double temperature, boolean airConditioner) {
        this.quaterMeters = quaterMeters;
        this.temperature = temperature;
        this.airConditioner = airConditioner;
    }

    public void getInfo() {
        System.out.println("Pokój o " + quaterMeters + " metrach kwadratowych, ma aktualną temperaturę: " + temperature
                + ". Czy w pomieszczeniu jest klimatyzacja?: " + airConditioner);
    }

    public boolean minusTemperature() {
        if (airConditioner && temperature >= 18) {
            temperature--;
        } else if (temperature >= 17.1 && temperature <= 17.9) {
            setTemperature(17);
        } else if (airConditioner && temperature <= 17) {
            return false;
        }
        return false;
    }

    public double getQuaterMeters() {
        return quaterMeters;
    }

    public void setQuaterMeters(double quaterMeters) {
        this.quaterMeters = quaterMeters;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public boolean isAirConditioner() {
        return airConditioner;
    }

    public void setAirConditioner(boolean airConditioner) {
        this.airConditioner = airConditioner;
    }
}