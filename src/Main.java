public class Main {
    public static void main(String[] args) {
        int fuelPerThousand = 96;
        int fuelVolume = 60;
        if (fuelPerThousand > 0 && fuelVolume > 0) {
            int expectedDistance = fuelVolume * 1000 / fuelPerThousand;
            System.out.println(expectedDistance);
        } else {
            System.out.println("You have made error in source parameters");
        }
    }
}
