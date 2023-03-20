package Interface2;
public class LocalBusiness {

    private int id;
    private String name;

    public LocalBusiness(int id, String name) {
        this.id = id;
        this.name = name;
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
        return "LocalBusiness{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public void quality() {
        System.out.println("Local business " + id  + " quality");
    }
}
