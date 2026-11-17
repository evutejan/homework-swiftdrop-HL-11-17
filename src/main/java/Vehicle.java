public abstract class Vehicle {
    protected String registration;
    protected double maxLoadKg;
    private double currentLoadKg;
    private Driver driver;
    private Logbook logbook;

    public Vehicle(String registration, double maxLoadKg){
        this.registration = registration;
        this.maxLoadKg = maxLoadKg;
        this.currentLoadKg = 0.0;
        this.driver = null;
        this.logbook = new Logbook();
    }

    public boolean loadParcel(double weightKg){
        if(currentLoadKg + weightKg > maxLoadKg){
            return false;
        } else {
            currentLoadKg += weightKg;
            return true;
        }
    }

    public String getRegistration() {
        return registration;
    }

    public double getMaxLoadKg() {
        return maxLoadKg;
    }

    public double getCurrentLoadKg() {
        return currentLoadKg;
    }

    public Driver getDriver() {
        return driver;
    }

    public boolean loadParcel(double weightKg, int count){
        return loadParcel(weightKg * count);
    }

    public void unload() {
        currentLoadKg = 0.0;
    }

    public abstract double calculateCost(double distanceKm);

    public double calculateCost(double distanceKm, int stops){
        return calculateCost(distanceKm) + (2.00 * stops);
    }

    public boolean assignDriver(Driver driver){
        this.driver = driver;
        return true;
    }

    public void recordTrip(double distanceKm){
        double cost = calculateCost(distanceKm);
        int tripNum = logbook.getEntryCount() + 1;
        logbook.addEntry("Trip " + tripNum + ": " + distanceKm + " km, cost " + cost);
    }

    public int getTripCount(){
        return logbook.getEntryCount();
    }

    public void printLogbook(){
        logbook.printAll();
    }

    @Override
    public String toString() {
        return registration + " | load " + currentLoadKg + "/" + maxLoadKg + " kg";
    }
}
