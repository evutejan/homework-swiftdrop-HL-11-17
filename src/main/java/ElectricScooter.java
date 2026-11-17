public class ElectricScooter extends Vehicle{
    private double rangeKm;

    public ElectricScooter(String registration, double rangeKm){
        super(registration, 25.0);
        this.rangeKm = rangeKm;
    }

    public boolean canReach(double distance){
        if ( distance <= rangeKm) return true;
        else return false;
    }

    @Override
    public double calculateCost(double distanceKm){
        return 0.15 * distanceKm;
    }

    @Override
    public String toString(){
        return "E-scooter " + super.toString() + " | range " + rangeKm + " km";
    }
}
