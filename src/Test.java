public class Test {
    public static void main(String[] args) {
        Room room1 = new Room(35, 22, true);
        Room room2 = new Room(20, 11, true);
        Room room3 = new Room(30, 25, false);
        Room room4 = new Room(66, 8, false);
        boolean airConRoom1 = room1.cold();
        boolean airConRoom2 = room2.cold();
        boolean airConRoom3 = room3.cold();
        boolean airConRoom4 = room4.cold();

        System.out.println("Pokuj nr1. Rozmiar: " + room1.getMeters() + " Temperatura: " + room1.getTemperature() +
                " \nKlimatyzacja: ");
        room1.klima();
        System.out.println("Czy klimatyzacja zadziałała: \n" + airConRoom1);
        System.out.println("\nPokuj nr2. Rozmiar: " + room2.getMeters() + " Temperatura: " + room2.getTemperature() +
                " \nKlimatyzacja: ");
        room2.klima();
        System.out.println("Czy klimatyzacja zadziałała: \n" + airConRoom2);
        System.out.println("\nPokuj nr3. Rozmiar: " + room3.getMeters() + " Temperatura: " + room3.getTemperature()+
                " \nKlimatyzacja: ");
        room3.klima();
        System.out.println("Czy klimatyzacja zadziałała: \n" + airConRoom3);
        System.out.println("\nPokuj nr4. Rozmiar: " + room4.getMeters() + " Temperatura: " + room4.getTemperature() +
                "\nKlimatyzacja: " );
        room4.klima();
        System.out.println( "Czy klimatyzacja zadziałała: \n" + airConRoom4);



    }
}
