public class Truck extends Vehicle {
    private int axles;

    public Truck(String registration, int axles){
        super(registration, 3000.0 * axles);
        this.axles = axles;
    }

    public int getAxles(){
        return axles;
    }

    @Override public double calculateCost(double distanceKm){
        double cost = (1.20 * distanceKm) + (25.0 * axles);
        return cost;
    }

    @Override
    public boolean assignDriver(Driver driver){
        if (driver.getLicence().equals("C")){
            return super.assignDriver(driver);
        } else {
            System.out.println(driver.getName() + " has no C licence and cant drive " + registration);
        } return false;
    }

    @Override
    public String toString(){
        return "Truck " + super.toString() + " | axles " + axles;
    }
}
