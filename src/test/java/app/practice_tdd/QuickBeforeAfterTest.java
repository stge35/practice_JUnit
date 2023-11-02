package app.practice_tdd;

import org.junit.jupiter.api.*;

public class QuickBeforeAfterTest {

    @BeforeAll
    public static void beforeAllTest() {
        System.out.println("BeforeAll");
    }
    // BeforeAll 애너테이션은 static 으로 선언해야한다.
    // 변수 같은 걸 참조 할 수 없고 클래스 레벨에서만 초기화 할 수 있다.
    // 데이터 베이스를 초기화 하는 등에 사용할 수 있다.

    @BeforeEach
    public void setup() {
        System.out.println("Before Test");
    }

    @Test
    public void test1() {
        System.out.println("test1 executed");
    }

    @Test
    public void test2() {
        System.out.println("test2 executed");
    }

    @AfterEach
    public void teardown() {
        System.out.println("After test");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("AfterAll Test");
    }
}
