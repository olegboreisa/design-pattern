package office;

import chain.Chain;
import chain.OfficeIssue;
import office.model.Employee;

import static office.EmployeeFactoryUtils.setEmployeeChain;

public class EmployeeFactory {

    public Employee assignIssue(String issue) {
        OfficeIssue officeIssue = new OfficeIssue(issue);
        Chain chain = setEmployeeChain(issue);
        return chain.solveIssue(officeIssue);
    }
}
