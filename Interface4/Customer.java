package Interface4;
public class Customer implements Loggable {

    private int id;
    private String name;

    public Customer(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public void info() {
        System.out.println("Cust Info: " + id + " " + name);
    }

    @Override
    public void log(String filePath) {
        System.out.println("Log to -> " + filePath + " of cust " + id);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
