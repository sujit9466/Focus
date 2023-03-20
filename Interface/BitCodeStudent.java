package Interface;


public class BitCodeStudent implements Rules{

    private int roll;
    private String name;

    public BitCodeStudent(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
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

    @Override
    public void study() {
        System.out.println("BitCoder " + name + " studies well!");
    }


    @Override
    public void innovate() {
        System.out.println("BitCoder " + name + " is innovative...");
    }
}
