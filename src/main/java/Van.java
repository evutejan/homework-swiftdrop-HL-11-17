public class Van extends Vehicle{
    private boolean refrigerated;

    public Van(String registration, boolean refrigerated){
        super(registration, 800.0);
        this.refrigerated = refrigerated;
    }

    public Van(String registration){
        this(registration, false);
    }

    public boolean isRefrigerated(){
        return refrigerated;
    }

    @Override
    public double calculateCost(double distanceKm){
        double cost = 0.60 * distanceKm;
        if(refrigerated){
            cost = cost + 15.0;
        }
        return cost;
    }

    @Override
    public String toString(){
        if(refrigerated){
            return "Van " + super.toString() + " | refrigerated";
        } else {
            return "Van " + super.toString();
        }
    }
}
