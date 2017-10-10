/**
 * Created by ReinWD on 2017/7/11.
 */
public class MutisituationTest {

    static class Base{
        public void foo(Base b){
            System.out.println("Base.Base");
        }
        public void foo(Other o){
            System.out.println("Base.Other");
        }
    }

    static class Other extends Base{
        @Override
        public void foo(Base b){
            System.out.println("Other.Base");
        }

        @Override
        public void foo(Other o){
            System.out.println("Other.Other");
        }
    }

    static class Test{
        Test(Base b,Base d){
            b.foo(d);
        }
    }

    public static void main(String[] args) {
        Base b = new Base();
        Other d = new Other();
        new Test(b,b);
        new Test(b,d);
        new Test(d,b);
        new Test(d,d);
    }
}
