package singleton;

/**
 * 饿汉式
 *
 * @author tty
 * @version 1.0 2021-01-08 11:39
 */
public class HugerySingle {
    private static final HugerySingle hugerySingle = new HugerySingle();

    private HugerySingle() {
    }

    public static HugerySingle getInstance() {
        return hugerySingle;
    }

    public void eat() {
        System.out.println("i am hugery very much");
    }
}
