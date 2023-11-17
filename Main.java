public class Main {
    public static void main(String[] args) {
        salesManager Jose = new salesManager("Jose", "Mourinho", 20, 56, 500, 4, 60000, 2, 8000);
        SalesRep Ricardo = new SalesRep("Ricardo","Queresma", 23, 42, 200, 4, 40000, 6, 2000);
        System.out.println(Jose.timeToRetirement());
        System.out.println(Jose.calculateBonus());
        //System.out.println(Jose.vacationTimeLeft());
        System.out.println(Jose.calculateCommission());
        System.out.println(Ricardo.calculateCommission());
    }
}