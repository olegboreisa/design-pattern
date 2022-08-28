import office.EmployeeFactory;
import office.model.Employee;

import java.util.Random;

public class DesignPatterApplication {

    public static void main(String[] args) {
        Random random = new Random();
        int questionType = random.ints(0, 4).findFirst().getAsInt();
        System.out.println(questionType);
        EmployeeFactory factory = new EmployeeFactory();
        Employee employee = factory.getEmployee(questionType);
        System.out.println(employee.greetings());
    }
}
