public class employee {
    String firstName;
    String lastName;
    int registration;
    int age;
    int daysWorked;
    int vacationDaysTaken;
    double salary;
    int yearsWorked;

    public employee(String firstName, String lastName, int registration, int age, int daysWorked, int vacationDaysTaken, double salary, int yearsWorked){
        this.firstName = firstName;
        this.lastName = lastName;
        this.registration = registration;
        this.age = age;
        this.daysWorked = daysWorked;
        this.vacationDaysTaken = vacationDaysTaken;
        this.salary = salary;
        this.yearsWorked = yearsWorked;

    }

    public int timeToRetirement(){
        int retirement = Math.min(60-age, 40- yearsWorked);
        return retirement;
    }

    public int vacationTimeLeft(){
        int vacTimeLeft = (daysWorked/360)*(30 - vacationDaysTaken);
        return vacTimeLeft;
    }

    public double calculateBonus(){
        double bonus = 2.2*salary;
        return bonus;
    }
}
