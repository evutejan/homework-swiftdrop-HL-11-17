import java.util.ArrayList;

public class Depot {
    private String name;
    private ArrayList<Vehicle> vehicles;

    public Depot(String name){
         this.name = name;
         this.vehicles = new ArrayList<>();
    }

    public void addVehicle(Vehicle v){
        vehicles.add(v);
    }

    public Vehicle removeVehicle(String registration){
        for (Vehicle v : vehicles){
            if (v.getRegistration().equals(registration)){
                vehicles.remove(v);
                return v;
            }
        }
        return null;
    }

    public double totalCost(double distanceKm){
        double total = 0;
        for(Vehicle v : vehicles){
            total+=v.calculateCost(distanceKm);
        }
        return total;
    }

    public void printFleet(){
        System.out.println("Depot " + name + " (" + vehicles.size() + " vehicles)");
        for(Vehicle v : vehicles){
            System.out.println("  " + v);
        }
    }
}

