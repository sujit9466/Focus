package ObjectClass;
public class IntHolder {
    private int val;

    public IntHolder(int val) {
        this.val = val;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return "IntHolder{" +
                "val= " + val +
                '}';
    }


    /*@Override
    public String toString() {
        return "val = " + val;
    }*/

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        //some code here
    }

    /*@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IntHolder intHolder = (IntHolder) o;

        return val == intHolder.val;
    }*/

    @Override
    public boolean equals(Object o) {

        if(this == o) {
            return true;
        }
        if(o == null || !(o instanceof IntHolder)) {
            return false;
        }

        return this.val == ((IntHolder)o).val;
    }

    @Override
    public int hashCode() {
        return val;
    }
}
