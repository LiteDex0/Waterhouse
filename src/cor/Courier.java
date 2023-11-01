package cor;

public class Courier extends Warehouse implements Worker{
    private int salary = 0;
    public void getSalary(){
        System.out.println("Зарплата курьера: " + salary );
    }

    @Override
    public void doWork() {
        salary = salary + 100000;
        setBalance(1000);
    }

    @Override
    public void bonus() {

    }
}
