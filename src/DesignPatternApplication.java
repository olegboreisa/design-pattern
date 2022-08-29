import clothes.Clothes;
import clothes.Item;
import clothes.LowerBody;
import credits.AccountFacade;
import momento.ArticleState;
import momento.ArticleHistory;
import office.EmployeeFactory;
import office.model.Director;
import office.model.Employee;
import newspaper.CompanyNewspaper;

import java.util.List;
import java.util.Random;

public class DesignPatternApplication {

    private static final int FIRST_NUMBER = 0;
    private static final int LAST_NUMBER = 2;
    private static final String IT_ARTICLE = "How to deal with software engineers?";
    private static final String GENERAL_ARTICLE = "How to stay awake during a workday?";
    private static final String JOKES_ARTICLE = "Knock knock jokes at work!";

    private static final ArticleState articleState = new ArticleState();
    private static final ArticleHistory journalHistory = new ArticleHistory();

    private static final Random random = new Random();
    private static final List<String> issues = List.of("Documents", "General", "Software");
    private static final EmployeeFactory factory = new EmployeeFactory();

    private static final CompanyNewspaper newspaper = new CompanyNewspaper();
    private static final AccountFacade accountFacade = new AccountFacade(1234, 101.00);

    private static final boolean showAdditional = false;

    public static void main(String[] args) {
        String lastPostedArticle = publishArticles();
        String issueToSolve = generateRandomIssue();
        Employee employee = pingEmployee(issueToSolve);

//      Observer (Subscriber) Design Patter (Behavioral)
        System.out.println("Current followers count for newspaper: " + newspaper.getFollowers().size());
        if (employee instanceof Director) {

            if (accountFacade.subscribe()) {

                newspaper.subscribe((Director) employee);
                ((Director) employee).followNewspaper(newspaper);
                System.out.println("Followers count was updated to: " + newspaper.getFollowers().size());

                newspaper.upload(lastPostedArticle);
            }
        }

        if (showAdditional) {
            additionalPatternDemo();
        }
    }

//  Memento Design Pattern (Behavioural)
    private static String publishArticles() {
        articleState.setArticle(IT_ARTICLE);
        journalHistory.push(articleState.writeAnArticle());

        articleState.setArticle(GENERAL_ARTICLE);
        journalHistory.push(articleState.writeAnArticle());

        articleState.setArticle(JOKES_ARTICLE);
        journalHistory.push(articleState.writeAnArticle());

        articleState.undo(journalHistory.pop());
//        article.remove(journalHistory.pop());

        System.out.println("Last article to read: '" + articleState.getContent() + "'");
        return articleState.getContent();
    }

    private static String generateRandomIssue() {
        int issueNumber = random.ints(FIRST_NUMBER, LAST_NUMBER)
                .findFirst()
                .getAsInt();

        String issueToSolve = issues.get(issueNumber);
        System.out.println("System generated random issue with in context of: '" + issueToSolve + "'");
        return issueToSolve;
    }

//  Factory Method Design Pattern (Creational)
    private static Employee pingEmployee(String issueToSolve) {
        Employee employee = factory.assignIssue(issueToSolve);
        employee.greetings();
        return employee;
    }

//  Composite Design Pattern (Structural)
    private static void additionalPatternDemo() {
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
