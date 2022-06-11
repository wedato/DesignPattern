package ct.visitorDemo;

//element A
public class Bank extends Client {


    private final int branchesInsured;
    public Bank(String name, String address, String numbr, int branchesInsured) {
        super(name, address, numbr);
        this.branchesInsured = branchesInsured;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitBank(this);
    }
}
