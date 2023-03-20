package Interface;
public class OtherStudent {

    private int roll;
    private String name;

    public OtherStudent(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    @Override
    public String toString() {
        return "OtherStudent{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                '}';
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void study() {
        System.out.println("OtherStudent " + name + " studies!");
    }

    public void innovate() {
        System.out.println("OtherStudent " + name + " is innovative");
    }
}
