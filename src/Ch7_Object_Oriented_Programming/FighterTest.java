package Ch7_Object_Oriented_Programming;

abstract class Unit2 {
    int x, y;

    abstract void move(int x, int y);

    void stop() {
        System.out.println("멈춥니다.");
    }
} // end of class

interface Fightable {
    // public abstract void move(int x, int y);
    // public abstract void attack(Fightable f);
    void move(int x, int y); // public abstract가 생략됨

    void attack(Fightable f); // public abstract가 생략됨
} // end of interface

class Fighter extends Unit2 implements Fightable {
    // void move(int x, int y)쓰면 오류 발생
    // 오버라이딩 규치: 조상(public)보다 접근제어가가 좁으면 안된다
    public void move(int x, int y) {
        System.out.println("[" + x + ", " + y + "]로 이동");
    } // end of move()

    public void attack(Fightable f) {
        System.out.println(f + "를 공격");
    } // end of move()

    // 싸울 수 있는 상대를 불러온다
    Fightable getFighterable() {
        Fightable f = new Fighter(); // Fighter를 생성해서 반환
        return f; // Fighter를 Fightable로 형변환해서 반환
        // return (Fightable)f;
    } // end of getFighterable

} // end of class

public class FighterTest {
    public static void main(String[] args) throws Exception {
        // 객체 생성
        Fighter f = new Fighter();
        f.move(100, 200);
        Fighter f2 = new Fighter();
        f2.attack(f);

        Fightable f3 = new Fighter();
        f.move(100, 200);
        f3.attack(f2);
        // f3.stop(); // Fightable안에 stop()이 없기 때문에 오류

        Unit2 u = new Fighter();
        u.move(100, 200);
        u.stop();
        // f3.attack(f2); // 에러발생 -> Unit2에 없어서 호출불가

        //
        Fighter f4 = new Fighter();
        Fightable f5 = f.getFighterable();

    } // end of main
} // end of class