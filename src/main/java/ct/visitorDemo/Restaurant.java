package ct.visitorDemo;

public class Restaurant extends Client {

    public final boolean availableAbroad;
    public Restaurant(String name, String address, String numbr, boolean availableAbroad) {
        super(name, address, numbr);
        this.availableAbroad = availableAbroad;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitRestaurent(this);
    }
}
