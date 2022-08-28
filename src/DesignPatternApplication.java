import clothes.Clothes;
import clothes.Item;
import clothes.LowerBody;
import office.EmployeeFactory;
import office.model.Employee;

import java.util.List;
import java.util.Random;

public class DesignPatternApplication {

    private static final int FIRST_NUMBER = 0;
    private static final int LAST_NUMBER = 2;

    private static List<String> issues = List.of("Documents", "General", "Software");

    public static void main(String[] args) {
//        Factory Method Design Pattern (Creational)
        Random random = new Random();
        int issueNumber = random.ints(FIRST_NUMBER, LAST_NUMBER)
                .findFirst()
                .getAsInt();

        String issueToSolve = issues.get(issueNumber);
        System.out.println(issueToSolve);

        EmployeeFactory factory = new EmployeeFactory();

        Employee employee = factory.assignIssue(issueToSolve);

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
