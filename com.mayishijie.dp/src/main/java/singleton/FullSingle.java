package singleton;

/**
 * 饱汉式
 *
 * @author tty
 * @version 1.0 2021-01-08 11:41
 */
public class FullSingle {
    private static  FullSingle fullSingle = null;

    private FullSingle() {
    }

    public static FullSingle getInstance() {
        if (fullSingle == null) {
            fullSingle = new FullSingle();
        }
        return fullSingle;
    }

    public void eat() {
        System.out.println("i eat too much,not hugery");
    }
}
