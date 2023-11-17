public class SalesRep extends employee{
    double salesMade;

    public SalesRep(String firstName, String lastName, int registration, int age, int daysWorked, int vacationDaysTaken, double salary, int yearsWorked, double salesMade){
        super(firstName, lastName, registration, age, daysWorked, vacationDaysTaken,salary, yearsWorked);
        this.salesMade = salesMade;
    }

    public double calculateCommission(){
        double comission = 0.1  * salesMade;
        return  comission;
    }
}
