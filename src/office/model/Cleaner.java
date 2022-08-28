package office.model;

public class Cleaner implements Employee {

    @Override
    public String greetings() {
        return "Hello, you workplace is a mess";
    }
}
