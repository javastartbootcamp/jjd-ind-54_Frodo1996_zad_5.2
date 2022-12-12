package pl.javastart.task;

public class Room {
    private double quaterMeters;
    private double temperature;
    private boolean airConditioner;
    private final double minTemperature = 17.0;

    public Room(double quaterMeters, double temperature, boolean airConditioner) {
        this.quaterMeters = quaterMeters;
        this.temperature = temperature;
        this.airConditioner = airConditioner;
    }

    public boolean minusTemperature() {
        if (airConditioner && temperature >= getMinTemperature() + 1) {
            temperature--;
        } else if (airConditioner && temperature > getMinTemperature()) {
            setTemperature(17);
        } else if (airConditioner && temperature <= minTemperature) {
            return false;
        }
        return false;
    }

    public void getInfo() {
        System.out.println("Pokój o " + quaterMeters + " metrach kwadratowych, ma aktualną temperaturę: " + getTemperature()
                + "\nPrzyjąta temperatura minimalna dla tego pokoju to " + minTemperature
                + ". Czy w pomieszczeniu jest klimatyzacja?: " + airConditioner);
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

    public double getMinTemperature() {
        return minTemperature;
    }
}