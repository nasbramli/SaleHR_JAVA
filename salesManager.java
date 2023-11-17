import java.util.HashMap;
import java.util.*;

public class salesManager extends SalesRep {
    double totalSales;
    double calcComm;
    //HashMap<Integer, SalesRep> salesTeam = new HashMap<Integer, SalesRep>();
    HashMap<Integer, SalesRep> salesTeam = new HashMap<>();
    public salesManager(String firstName, String lastName, int registration, int age, int daysWorked, int vacationDaysTaken, double salary, int yearsWorked, double salesMade){
        super(firstName, lastName, registration, age, daysWorked, vacationDaysTaken,salary, yearsWorked, salesMade);


        salesTeam.put(1, new SalesRep("Lionel", "Messi", 2, 37, 700, 8, 7000, 8, 2000));
        salesTeam.put(2, new SalesRep("Eden", "Hazard", 2, 37, 700, 6, 7000, 8, 200));
    }


    public double calculateCommission(){
        //transversing map
        double tSales = 0;


        for (Map.Entry<Integer, SalesRep> entry : salesTeam.entrySet()){
            SalesRep sales = entry.getValue();
            tSales += sales.salesMade;
        }

        return tSales*0.03;
    }
}
