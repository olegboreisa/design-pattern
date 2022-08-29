package chain;

import office.model.Director;
import office.model.Employee;

//Handler
public class GeneralIssue implements Chain {

    private Chain nextInChain;

    @Override
    public void setNextChain(Chain nextChain) {
        this.nextInChain = nextChain;
    }

    @Override
    public Employee solveIssue(OfficeIssue request) {
        if (request.getIssue().equals("General")) {
            return new Director();
        }
        return nextInChain.solveIssue(request);
    }
}
