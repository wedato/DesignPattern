package ct.visitorDemo;

// element
public abstract class Client {

    private final String name;
    private final String address;
    private final String numbr;

    public Client(String name, String address, String numbr) {
        this.name = name;
        this.address = address;
        this.numbr = numbr;
    }

    public abstract void accept(Visitor visitor);

}
