package chain;

import office.model.Employee;

public interface Chain {

    void setNextChain(Chain nextChain);

    Employee solveIssue(OfficeIssue request);
}
