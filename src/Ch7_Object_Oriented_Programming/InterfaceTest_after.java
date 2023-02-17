package Ch7_Object_Oriented_Programming;

class A {
    public void method(I i) { // 인터페이스 I를 구현한 경우 실행
        i.method();
    } // end of method()
} // end of class

// B클래스의 선언과 구현을 분리
interface I {
    public void method();
} // end of I

class B implements I {

    public void method() {
        System.out.println("B클래스의 메서드");
    }// end of method()

} // end of class

class C implements I {

    public void method() {
        System.out.println("C클래스의 메서드");
    }// end of method()
} // end of class

public class InterfaceTest_after {

    public static void main(String[] args) {
        A a = new A();
        a.method(new B()); // A가 B를 사용(의존)
    } // end of main
} // end of class