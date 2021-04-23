package _05_Access_modifier_Static.thuc_hanh;

public class AccessModifier {
    //pprivate
//    static class A{
//
//        private int data=40;
//
//        private void msg(){System.out.println("Hello java");}
//
//    }
    //default
    static class A {
        void msg() {
            System.out.println("Hello");
        }
    }

    //protected
//    public class A{
//
//        protected void msg(){System.out.println("Hello");}
//
//    }
//public
//public class A{
//
//    public void msg(){System.out.println("Hello");}
//
//}
    public static void main(String[] args) {
        //private
//        A obj= new A();
//        System.out.println(obj.data);//Compile Time Error
//
//        obj.msg();//Compile Time Error
        //default
//        A obj = new A();//Compile Time Error
//
//        obj.msg();//Compile Time Error
//
//    }
        //protected
//        B obj = new B();
//
//        obj.msg();
        //public
        A obj = new A();
        obj.msg();
    }
}
