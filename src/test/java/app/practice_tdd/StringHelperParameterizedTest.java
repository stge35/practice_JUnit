package app.practice_tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.ParameterResolver;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Collection;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;



class StringHelperParameterizedTest {

    StringHelper stringHelper = new StringHelper();


    // ParameterizedTest
    // MethodSource 를 사용 시 Argument 의 순서 주의 할 것
    // 첫 번 째가 처음으로 들어간다!!
    private static Stream<Arguments> testArguments() {
        return Stream.of(
                Arguments.of("CD", "AACD"),
                Arguments.of("CD", "ACD")
        );
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    // MethodSource 애너테이션에서는 생성자 주입을 할 필요가 없음.
    public void truncateAInFirst2Positions_Test(String expectedOutput, String input) {

        assertEquals(expectedOutput, stringHelper.truncateAInFirst2Positions(input));
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