public class Car{
    String carDesc;
    double fuel;
    double maxRange;
    int drivenKm;
    boolean isDriving;
    double fuelCap;
    double fuelConsum;
    public Car(String carDesc, double fuelCap, double fuelConsum){
        this.fuelCap = fuelCap;
        this.maxRange = (fuel/fuelConsum) * 100;
        this.carDesc = carDesc;
        this.fuelConsum = fuelConsum;
    }  
    public void drive(){
        while(fuel > 0) {
            fuel = fuel - fuelConsum/100;  
            drivenKm = drivenKm + 1; 
            maxRange = (fuel/fuelConsum) * 100;
        }
    }
    public String toString(){
        String str = "Car: " + carDesc + "\n Fuel Cap: " + fuelCap + "\n Fuel Consum: " + fuelConsum + "\n Current Fuel: " + fuel + "\n Max.Range: " + maxRange + "\n Driven KM: " + drivenKm;
        return str;
    }
}