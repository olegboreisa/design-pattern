package office;

import office.model.Accountant;
import office.model.Cleaner;
import office.model.Genenator;
import office.model.Employee;
import office.model.SoftwareEngineer;

public class EmployeeFactory {

    public Employee assignTask(int type) {
        if (type == 0) {
            return new Accountant();
        } else if (type == 1) {
            return new SoftwareEngineer();
        } else if (type == 2) {
            return new Cleaner();
        }
        return new Genenator();
    }
}
