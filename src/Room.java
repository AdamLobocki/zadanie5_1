public class Room {
  private   double meters;
  private   double temperature;
  private   boolean airConditioner;

    public double getMeters() {
        return meters;
    }

    public double getTemperature() {
        return temperature;
    }

    public Room(double meters, double temperature, boolean airConditioner) {
        this.meters = meters;
        this.temperature = temperature;
        this.airConditioner = airConditioner;
    }

    boolean cold(){
        if(airConditioner && temperature > 15) {
            temperature = temperature - 1;
            return true;
        }
        else
            return false;

    }
    void klima(){
        if(airConditioner){
            System.out.println("Tak ");
        }
        else
            System.out.println("Nie ");

    }

}
