package cor;
public class Main {
    public static void main(String[] args) {
        Warehouse waterhouse = new Warehouse();
        Picker picker = new Picker();
        Courier courier = new Courier();

        picker.doWork();
        waterhouse.getCountOrder();
    }
}