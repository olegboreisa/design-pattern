import clothes.Clothes;
import clothes.LowerBody;
import clothes.Item;
import office.EmployeeFactory;
import office.model.Employee;

import java.util.Random;

public class DesignPatternApplication {

    private static final int FIRST_NUMBER = 0;
    private static final int LAST_NUMBER = 4;

    public static void main(String[] args) {
//        Factory Method Design Pattern (Creational)
        Random random = new Random();
        int taskNumber = random.ints(FIRST_NUMBER, LAST_NUMBER)
                .findFirst()
                .getAsInt();

        EmployeeFactory factory = new EmployeeFactory();
        Employee employee = factory.assignTask(taskNumber);

        employee.greetings();

//        Composite Design Pattern (Structural)
//        Composite
        LowerBody pants = new LowerBody("Pants");

//        Leaf Inside Pants;
        Clothes socks = new Item("Socks", 7.09);
        Clothes belt = new Item("Belt", 12.99);

//        Leaf Inside Clothes;
        Clothes hat = new Item("Hat", 9.99);
        Clothes shirt = new Item("Shirt", 20.19);
        Clothes tie = new Item("Ties", 6.99);

        pants.addItem(belt);
        pants.addItem(socks);

        hat.showPrice();
        shirt.showPrice();
        tie.showPrice();

        System.out.println("===============================");
        pants.showPrice();
    }
}
