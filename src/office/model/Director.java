package office.model;

import newspaper.CompanyNewspaper;
import newspaper.Observer;

public class Director implements Employee, Observer {

    private String name;
    private CompanyNewspaper companyNewspaper;

    @Override
    public void greetings() {
        System.out.println("Hello, I am a director.\nUnfortunately I do not know how to solve the issue. " +
                "I will subscribe/read to CompanyNewsPaper.");
        this.name = "Tadas";
    }

    @Override
    public void update() {
        System.out.println("Article '" + companyNewspaper.getTitle() + "' is posted and " + name + " is notified!");
    }

    @Override
    public void followNewspaper(CompanyNewspaper newspaper) {
        companyNewspaper = newspaper;
    }

}
