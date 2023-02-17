package Ch7_Object_Oriented_Programming;

class A {
    public void method(B b) {
        b.method();
    } // end of method()
} // end of class

class B {

    public void method() {
        System.out.println("B클래스의 메서드");
    }// end of method()

} // end of class

class C {

    public void method() {
        System.out.println("C클래스의 메서드");
    }// end of method()
} // end of class

public class InterfaceTest_before {
    public static void main(String[] args) {
        A a = new A();
        a.method(new B()); // A가 B를 사용(의존)
    } // end of main
} // end of class
