package ct.visitorDemo;

public interface Visitor {

    void visitBank(Bank bank);
    void visitCompany(Company company);
    void visitResident(Resident resident);
    void  visitRestaurent(Restaurant restaurant);
}
