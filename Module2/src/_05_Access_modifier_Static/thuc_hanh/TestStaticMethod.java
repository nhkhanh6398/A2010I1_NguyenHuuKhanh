package _05_Access_modifier_Static.thuc_hanh;

public class TestStaticMethod {
    public static void main(String args[]) {
        StaticMethod.change(); //calling change method

        //creating objects
        StaticMethod s1 = new StaticMethod(111, "Hoang");
        StaticMethod s2 = new StaticMethod(222, "Khanh");
        StaticMethod s3 = new StaticMethod(333, "Nam");

        //calling display method
        s1.display();
        s2.display();
        s3.display();
    }
}

