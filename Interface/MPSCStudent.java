package Interface;

public class MPSCStudent implements Rules {

    private int id;
    private String name;
    private int attempts;

    @Override
    public void study() {
        System.out.println("MPSC " + name + " studies");
    }

    @Override
    public void innovate() {
        System.out.println("MPSC " + name + " innovates..");
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

    public int getAttempts() {
        return attempts;
    }

    public void setAttempts(int attempts) {
        this.attempts = attempts;
    }

    @Override
    public String toString() {
        return "MPSCStudent{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", attempts=" + attempts +
                '}';
    }

    public MPSCStudent(int id, String name, int attempts) {
        this.id = id;
        this.name = name;
        this.attempts = attempts;
    }
}
