package office;

import chain.Chain;
import chain.DocumentIssue;
import chain.GeneralIssue;
import chain.SoftwareIssue;

public class EmployeeFactoryUtils {

//  Chain of Responsibility Design Patter (Behavioral)
    public static Chain setEmployeeChain(String issue) {
        Chain chainOne = new SoftwareIssue();
        Chain chainTwo = new DocumentIssue();
        Chain chainThree = new GeneralIssue();

        chainOne.setNextChain(chainTwo);
        chainTwo.setNextChain(chainThree);
        return chainOne;
    }
}
