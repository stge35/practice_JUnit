package app.practice_tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class StringHelperParameterizedTest {

    StringHelper stringHelper;

    @BeforeEach
    public void beforeEach() {
        stringHelper = new StringHelper();
        System.out.println("test eachBefore Annotation");
    }

    @Test
    public void truncateAInFirst2Positions_AinFirst2Positions_Test() {
        assertEquals("CD", stringHelper.truncateAInFirst2Positions("AACD"));
        // 하나의 단위 테스트에 2가지 테스트는 좋지 않은 방법
    }

    @Test
    public void truncateAInFirst2PositionsTest2_AinFirst1Positions_Test() {
        assertEquals("CD", stringHelper.truncateAInFirst2Positions("ACD"));
        // Test는 공개적인 void 타입으로 해야함. 특정 반환타입은 안됨
    }

    @Test
    public void areFirstAndLastTwoCharactersTheSame__BasicNegativeScenario_Test() {
        assertFalse(stringHelper.areFirstAndLastTwoCharactersTheSame("ABCD"));
    }

    @Test
    public void areFirstAndLastTwoCharactersTheSame__BasicPositiveScenario_Test() {
        assertTrue(stringHelper.areFirstAndLastTwoCharactersTheSame("ABAB"));
    }

}