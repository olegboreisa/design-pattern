package office.model;

public class Accountant extends EmployeeOutfit implements Employee {

    @Override
    public void listMyOutfit() {
        super.listMyOutfit();
    }

    @Override
    public void greetings() {
        System.out.println("Hello, I am love numbers");
    }

}
