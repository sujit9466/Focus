package Interface2;
public class Tata implements ISO{

    private int id;
    private String name;
    private String licNo;

    public Tata(int id, String name, String licNo) {
        this.id = id;
        this.name = name;
        this.licNo = licNo;
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

    public String getLicNo() {
        return licNo;
    }

    public void setLicNo(String licNo) {
        this.licNo = licNo;
    }

    @Override
    public String toString() {
        return "Tata{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", licNo='" + licNo + '\'' +
                '}';
    }

    @Override
    public void quality() {
        System.out.println("Tata : " + id + " Quality");
    }

    @Override
    public void hrPolicies() {
        System.out.println("Tata : " + id + " HR Policies");
    }
}
