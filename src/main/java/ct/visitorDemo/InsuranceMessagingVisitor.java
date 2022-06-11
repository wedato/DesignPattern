package ct.visitorDemo;

// ConcreteVisitor
public class InsuranceMessagingVisitor {

    public void visitBank(Bank bank){
        System.out.println("sending mail insurance bank");
    }
    public void visitCompany(Company company){
        System.out.println("Sending employees and equipment insurance mail");
    }
    public void visitCompany(Resident resident){
        System.out.println("Sending mail about medical insurrance");
    }
    public void visitRestaurant(Restaurant restaurant){
        System.out.println("Sending mail about fire and food insurance");
    }
}
