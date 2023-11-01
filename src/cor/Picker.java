package cor;

import org.w3c.dom.ls.LSOutput;

public class Picker extends Warehouse implements Worker{
    private int salary = 0;
    public void getSalary(){
        System.out.println("Зарплата сборщика: " + salary);
    }

    @Override
    public void doWork() {
        salary = salary + 80000;
        setCountOrder(1);
    }

    @Override
    public void bonus() {

    }
}
