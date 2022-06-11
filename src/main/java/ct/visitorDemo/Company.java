package ct.visitorDemo;

public class Company extends Client {

    private final int nbrOfEmployees;
    public Company(String name, String address, String numbr, int nbrOfEmployees) {
        super(name, address, numbr);
        this.nbrOfEmployees = nbrOfEmployees;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitCompany(this);
    }
}
