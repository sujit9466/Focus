package Interface3;
public class Employee implements Comparable {
    private int id;
    private String name;
    private int sal;

    public Employee(int id, String name, int sal) {
        this.id = id;
        this.name = name;
        this.sal = sal;
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

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sal=" + sal +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Employee employee = (Employee) o;
        if(this.id < employee.id) {
            return -1;
        }
        if(this.id > employee.id) {
            return 1;
        }
        return 0;
    }
}

class EmpComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Employee e1 = (Employee) o1;
        Employee e2 = (Employee) o2;

        if(e1.getId() > e2.getId()) {
            return 1;
        }

        if(e1.getId() < e2.getId()) {
            return -1;
        }

        return 0;
    }
}
