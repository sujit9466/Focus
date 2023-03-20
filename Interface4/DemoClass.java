
package Interface4;

public class DemoClass implements Rules {

    @Override
    public void rule1() {
        Rules.super.rule1();
        System.out.println("this is overridden rule1");
    }

    @Override
    public void rule2() {
        System.out.println("this is rule2");
    }
}

