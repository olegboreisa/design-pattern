package chain;

import office.model.Accountant;
import office.model.Employee;

public class DocumentIssue implements Chain {

    private Chain nextInChain;

    @Override
    public void setNextChain(Chain nextChain) {
        this.nextInChain = nextChain;
    }

    @Override
    public Employee solveIssue(OfficeIssue request) {
        if (request.getIssue().equals("Documents")) {
            return new Accountant();
        }
        return nextInChain.solveIssue(request);
    }
}
