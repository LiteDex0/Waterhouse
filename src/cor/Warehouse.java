package cor;

public class Warehouse {
    private int countOrder = 0;
    private int balance = 0;

    public void setCountOrder(int countOrder){
        this.countOrder += 1;
    }
    public void getCountOrder() {
        System.out.println("Число заказов: " + countOrder);
    }
    public boolean setBalance(int balance){
        this.balance=balance;
        return false;
    }
    public void getBalance(){
        System.out.println("Товара на складе: " + balance);
    }
}
