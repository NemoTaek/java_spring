package org.example;

public interface Phone {
    int version = 12;

    String getManufacturer();
    String getOS();

    // Java8 이후 default 키워드를 사용하면 인터페이스에서 구현부를 작성할 수 있습니다.
    // 따라서 이를 상속받는 클래스에서의 구현은 강제적이 아니게 됩니다.
    default void printRing() {
        System.out.println("전화가 온다. 위이이이이이잉");
    }

    // Java8 이후 static 키워드를 사용하면 인스턴스 생성 없이 인터페이스 이름을 통해서 직접 메소드 호출이 가능합니다.
    // 이는 상속받는 클래스에서 재정의가 불가능합니다.
    static void printUser(String user) {
        System.out.println("사용자: " + user);
    }
}