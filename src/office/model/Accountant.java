package office.model;

public class Accountant implements Employee {

    @Override
    public void greetings() {
        System.out.println("Hello, I am an accountant");
    }

}
