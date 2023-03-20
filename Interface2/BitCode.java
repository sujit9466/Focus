package Interface2;
public class BitCode implements ISO {
    private int id;
    private String name;

    public BitCode(int id, String name) {
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
        return "BitCode{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public void quality() {
        System.out.println("BitCode " + id + ": Quality");
    }

    @Override
    public void hrPolicies() {
        System.out.println("BitCode " + id + ": HR Policies");
    }
}








