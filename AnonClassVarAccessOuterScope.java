abstract class SomeInterface {
    public abstract void doIt();
}

public class AnonymCls {
    public void meth(SomeInterface anon) {
        anon.doIt();
    }

    public static void main(String...args){
        int x = 1;
        new AnonymCls().meth(new SomeInterface() {
            @Override
            public void doIt() {
               int x = 2;
            }
        });

        System.out.println(x);
    }
}
