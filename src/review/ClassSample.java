package review;


/**
 * @program: LeetCode *
 * @classname: classSample *
 * @author: lnback *
 * @create: 2020-07-11 09:39
 **/

public class ClassSample {
    static class StaticInnerClass {
        public void printA() {
            System.out.println(a);
        }

    }

    static int a = 10;

    class NormalInnerClass {
    }

    public void test() {
        class LocalClass {
        }
        // 成员内部类的创建方法
        new ClassSample().new NormalInnerClass();

        // 局部内部类的创建
        new LocalClass();

        // 匿名内部类的创建
        Runnable runnable = new Runnable() {
            @Override
            public void run() {

            }
        };
        Runnable runnable1 = () -> {
        };
    }

    public void printB() {
        System.out.println(a + 10);
    }

    public static void main(String[] args) {
        StaticInnerClass staticInnerClass = new StaticInnerClass();
    }
}
