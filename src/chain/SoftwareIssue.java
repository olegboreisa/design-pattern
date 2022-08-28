package chain;

import office.model.Employee;
import office.model.SoftwareEngineer;

public class SoftwareIssue implements Chain {

    private Chain nextInChain;

    @Override
    public void setNextChain(Chain nextChain) {
        this.nextInChain = nextChain;
    }

    @Override
    public Employee solveIssue(OfficeIssue request) {
        if (request.getIssue().equals("Software")) {
            return new SoftwareEngineer();
        }
        return nextInChain.solveIssue(request);
    }
}
