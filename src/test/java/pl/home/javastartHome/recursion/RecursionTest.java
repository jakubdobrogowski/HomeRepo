package pl.home.javastartHome.recursion;

import org.junit.jupiter.api.Test;

import java.util.ArrayDeque;
import java.util.Deque;

import static org.junit.jupiter.api.Assertions.*;

class RecursionTest {

    Recursion recursion = new Recursion();

    @Test
    void test_factorial() {

        assert 1 == recursion.factorial(0);
        assert 1 == recursion.factorial(1);
        assert 2 == recursion.factorial(2);
        assert 479001600 == recursion.factorial(12);
    }

    @Test
    void test_bunnyEars() {

        assert 0 == recursion.bunnyEars(0);
        assert 2 == recursion.bunnyEars(1);
        assert 600 == recursion.bunnyEars(300);
    }

    @Test
    void test_fibonacci() {

        assert 3 == recursion.fibonacci(4);
    }

    @Test
    void test_bunnyEars2() {

        assert 0 == recursion.bunnyEars2(0);
        assert 2 == recursion.bunnyEars2(1);
        assert 5 == recursion.bunnyEars2(2);
    }

    @Test
    void test_triangle() {

        assert 1 == recursion.triangle(1);
        assert 10 == recursion.triangle(4);
    }

    @Test
    void test_sumDigits() {

        assert 6 == recursion.sumDigits(123);
        assert 0 == recursion.sumDigits(0);
    }

    @Test
    void test_count7() {

        assert 0 == recursion.count7(198);
        assert 1 == recursion.count7(7);
        assert 2 == recursion.count7(77);
    }

    @Test
    void test_count8() {

        assert 0 == recursion.count8(199);
        assert 1 == recursion.count8(78);
        assert 3 == recursion.count8(88);
        assert 3 == recursion.count8(81818);
        assert 4 == recursion.count8(8818);
        assert 9 == recursion.count8(88888);
    }

    @Test
    void test_powerN() {

        assertEquals(1, recursion.powerN(4, 0));
        assertEquals(9, recursion.powerN(3, 2));
        assertEquals(1024, recursion.powerN(2, 10));
    }

    @Test
    void test_countX() {

        assertEquals(0, recursion.countX("logopedia"));
        assertEquals(3, recursion.countX("xxxvideos"));
        assertEquals(1, recursion.countX("x-man"));
    }

    @Test
    void test_countHi() {

        assertEquals(0, recursion.countHi("looool"));
        assertEquals(3, recursion.countHi("loohiloolhiohi"));
        assertEquals(1, recursion.countHi("x-hijp"));
    }

    @Test
    void test_changeXY() {

        assertEquals("yyy-videos", recursion.changeXY("xxx-videos"));
    }

    @Test
    void test_changePi() {

        assertEquals("3.14", recursion.changePi("pi"));
        assertEquals("logopedia", recursion.changePi("logopedia"));
        assertEquals("logopedia3.14", recursion.changePi("logopediapi"));
        assertEquals("logo3.14pedia3.14", recursion.changePi("logopipediapi"));
    }

    @Test
    void test_noX() {

        assertEquals("lol", recursion.noX("lol"));
        assertEquals("lol", recursion.noX("lxoxl"));
        assertEquals("lol", recursion.noX("xlxoxlx"));
        assertEquals("", recursion.noX("xx"));
    }

    @Test
    void test_stackDuck() {

        Deque<Integer> intsStack = new ArrayDeque<>();
        intsStack.push(5);
        intsStack.push(4);
        intsStack.push(3);
        intsStack.push(2);
        intsStack.push(1);

        recursion.stackDuck(intsStack);
    }
}