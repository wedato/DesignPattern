package ct.visitorDemo;

public class Resident extends Client {
    private  final String insurranceClass;
    public Resident(String name, String address, String numbr, String insurranceClass) {
        super(name, address, numbr);
        this.insurranceClass = insurranceClass;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitResident(this);
    }
}
