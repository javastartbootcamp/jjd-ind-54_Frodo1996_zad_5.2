package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Room room1 = new Room(18, 19.5, true);
        System.out.println("Pokój nr 1:");
        room1.getInfo();
        room1.minusTemperature();
        room1.getInfo();
        room1.minusTemperature();
        room1.getInfo();
        room1.minusTemperature();
        room1.getInfo();
        room1.minusTemperature();

        Room room2 = new Room(24, 20, false);
        System.out.println("\nPokój nr 2:");
        room2.getInfo();
        room2.minusTemperature();
        room2.getInfo();
    }
}
