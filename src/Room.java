public class Room {
    double meters;
    double temperature;
    boolean airConditioner;

    public Room(double meters, double temperature, boolean airConditioner) {
        this.meters = meters;
        this.temperature = temperature;
        this.airConditioner = airConditioner;
    }

    boolean cold(){
        if(airConditioner == true && temperature > 15) {
            temperature = temperature - 1;
            return true;
        }
        else
            return false;

    }
    void klima(){
        if(airConditioner == true){
            System.out.println("Tak ");
        }
        else
            System.out.println("Nie ");

    }

}
