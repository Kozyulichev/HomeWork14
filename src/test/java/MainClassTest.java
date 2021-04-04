import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;


class MainClassTest {
    private MainClass mainClass;

    @BeforeAll
    public static void startUp(){
        System.out.println("Начинаем тесты!");
    }

    @AfterAll
    static void end(){
        System.out.println("Окончание тестов!");
    }

    @BeforeEach
    public void init() {
        mainClass = new MainClass();
    }

    @ParameterizedTest
    @MethodSource("firstTask")
    public void testForTask1(int[] a, int[] b) {
        Assertions.assertArrayEquals(a, mainClass.returnArr(b));
    }

    @ParameterizedTest
    @MethodSource("secondTask")
    public void testForTask2(int[] a) {
        Assertions.assertTrue(mainClass.isOneAndFour(a));
    }

    static Stream<Arguments> firstTask() {
        return Stream.of(
                Arguments.arguments(new int[]{5, 6, 7, 8, 9}, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}),
                Arguments.arguments(new int[]{3, 2, 1}, new int[]{0, 9, 8, 7, 6, 5, 4, 3, 2, 1}),
                Arguments.arguments(new int[]{33, 99, 24}, new int[]{12, 17, 23, 47, 4, 33, 99, 21})
        );
    }

    static Stream<Arguments> secondTask() {
        return Stream.of(
                Arguments.arguments(new int[]{1, 4}),
                Arguments.arguments(new int[]{1, 1, 1, 1, 4, 1, 1}),
                Arguments.arguments(new int[]{3,4,2,9,0,1})
        );
    }


}