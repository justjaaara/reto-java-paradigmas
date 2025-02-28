public class Client{
    private final String name;
    private final String identification;
    private final String email;

    public Client(String name, String identification, String email){
        this.name = name;
        this.identification = identification;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Client " + name ;
    }
}