package Exception;

public class NegativeOrZeroSalException extends Exception {
    private int empId;
    private int sal;
    private long time;

    public NegativeOrZeroSalException(int empId, int sal, long time, String message) {
        super(message);
        this.empId = empId;
        this.sal = sal;
        this.time = time;
    }

    @Override
    public String toString() {
        return "NegativeOrZeroSalException{" +
                "empId=" + empId +
                ", sal=" + sal +
                ", time=" + time +
                ", message = " + super.getMessage() +
                '}';
    }

    @Override
    public String getMessage() {
        return toString();
    }
}
