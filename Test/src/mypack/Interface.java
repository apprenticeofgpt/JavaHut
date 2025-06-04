package mypack;
interface PhoneInterface { // 인터페이스 선언
    final int TIMEOUT = 10000; // 상수 필드 선언
    void sendCall(); // 추상 메소드
    void receiveCall(); // 추상 메소드

    default void printLogo() { // default 메소드
        System.out.println("** Phone **");
    }
}

class SamsungPhone implements PhoneInterface { // 인터페이스 구현
    @Override
    public void sendCall() {
        System.out.println("띠리리리링");
    }

    @Override
    public void receiveCall() {
        System.out.println("전화가 왔습니다.");
    }

    // SamsungPhone만의 추가 메소드
    public void flash() {
        System.out.println("전화기에 불이 켜졌습니다.");
    }
}

public class Interface {
    public static void main(String[] args) {
        SamsungPhone phone = new SamsungPhone();
        phone.printLogo();         // default 메소드 사용
        phone.sendCall();          // 오버라이드된 메소드 호출
        phone.receiveCall();       // 오버라이드된 메소드 호출
        phone.flash();             // 클래스 자체 메소드 호출
    }
}
