package org.example.st_pro;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest  {
    @Test
    public void test1() {
        Calculator calc = new Calculator("1 1 7 5 ="); // Addition Operation
        assertEquals(12.0, calc.run(), 0);
    }

    @Test
    public void test2() {
        Calculator calc = new Calculator("1 1 ="); //Going to Addition Operation with no input values
        assertEquals(0, calc.run(), 0);
    }

    @Test(expected = InvalidInputException.class)
    public void test3() {
        Calculator calc = new Calculator("1 2 5 b"); // Subtraction
        assertEquals(0.0, calc.run(), 0);
    }

    @Test
    public void test4() {
        Calculator calc = new Calculator("1 2 15 5 ="); // Subtraction
        assertEquals(10.0, calc.run(), 0);
    }

    @Test
    public void test5() {
        Calculator calc = new Calculator("1 3 ="); // Multiplication
        assertEquals(1.0, calc.run(), 0);
    }

    @Test
    public void test6() {
        Calculator calc = new Calculator("1 3 12 -3 ="); // Multiplication
        assertEquals(-36.0, calc.run(), 0);
    }

    @Test
    public void test7() {
        Calculator calc = new Calculator("1 4 ="); // Division
        assertEquals(0.0, calc.run(), 0);
    }

    @Test
    public void test8() {
        Calculator calc = new Calculator("1 4 12 -3 ="); // Division
        assertEquals(-4.0, calc.run(), 0);
    }

    @Test
    public void test8_1() {
        Calculator calc = new Calculator("1 4 0 12 ="); // Division
        assertEquals(0.0, calc.run(), 0);
    }

    @Test
    public void test32() {
        Calculator calc = new Calculator("1 5 ="); // Modulus
        assertEquals(0.0, calc.run(), 0);
    }

    @Test
    public void test9() {
        Calculator calc = new Calculator("1 5 10 6 ="); // Modulus
        assertEquals(4.0, calc.run(), 0);
    }

    @Test(expected = InvalidInputException.class)
    public void test10() {
        Calculator calc = new Calculator("1 6 ="); // Default case
        assertEquals(0.0, calc.run(), 0);
    }

    @Test
    public void test11() {
        Calculator calc = new Calculator("2 1 16"); // Square root of number
        assertEquals(4.0, calc.run(), 0);
    }

    @Test(expected = MyRuntimeException.class)
    public void test11_3(){
        Calculator calc = new Calculator("2 1 0");
        assertEquals(0.0, calc.run(), 0);
    }

    @Test(expected = MyRuntimeException.class)
    public void test11_1() {
        Calculator calc = new Calculator("2 1  "); // square of number
        assertEquals(0.0, calc.run(), 0);
    }

    @Test(expected = InvalidInputException.class)
    public void test11_2() {
        Calculator calc = new Calculator("2 1 b"); // square of number
        assertEquals(0.0, calc.run(), 0);
    }

    @Test
    public void test12() {
        Calculator calc = new Calculator("2 2 3 5"); // x power y
        assertEquals(243.0, calc.run(), 0);
    }

    @Test(expected = MyRuntimeException.class)
    public void test12_1() {
        Calculator calc = new Calculator("2 2  "); // square of number
        assertEquals(0.0, calc.run(), 0);
    }

    @Test(expected = InvalidInputException.class)
    public void test12_2() {
        Calculator calc = new Calculator("2 2 b"); // square of number
        assertEquals(0.0, calc.run(), 0);
    }

    @Test
    public void test13() {
        Calculator calc = new Calculator("2 3 5"); // square of number
        assertEquals(25.0, calc.run(), 0);
    }

    @Test(expected = MyRuntimeException.class)
    public void test13_1() {
        Calculator calc = new Calculator("2 3  "); // square of number
        assertEquals(0.0, calc.run(), 0);
    }

    @Test(expected = InvalidInputException.class)
    public void test13_2() {
        Calculator calc = new Calculator("2 3 b"); // square of number
        assertEquals(0.0, calc.run(), 0);
    }

    @Test
    public void test14() {
        Calculator calc = new Calculator("2 4 3"); // cube of number
        assertEquals(27.0, calc.run(), 0);
    }

    @Test(expected = MyRuntimeException.class)
    public void test14_1() {
        Calculator calc = new Calculator("2 4  "); // square of number
        assertEquals(0.0, calc.run(), 0);
    }

    @Test(expected = InvalidInputException.class)
    public void test14_2() {
        Calculator calc = new Calculator("2 4 b"); // square of number
        assertEquals(0.0, calc.run(), 0);
    }

    @Test(expected = InvalidInputException.class)
    public void test15() {
        Calculator calc = new Calculator("2 5 12"); // There is no case 12 in case 5
        assertEquals(0.0, calc.run(), 0);
    }

    @Test
    public void test16() {
        Calculator calc = new Calculator("2 6 81 4");
        assertEquals(3.0, calc.run(), 0);
    }

    @Test(expected = MyRuntimeException.class)
    public void test16_3() {
        Calculator calc = new Calculator("2 6 9 0"); // square of number
        assertEquals(0.0, calc.run(), 0);
    }

    @Test(expected = MyRuntimeException.class)
    public void test16_1() {
        Calculator calc = new Calculator("2 6  "); // square of number
        assertEquals(0.0, calc.run(), 0);
    }

    @Test(expected = InvalidInputException.class)
    public void test16_2() {
        Calculator calc = new Calculator("2 6 b"); // square of number
        assertEquals(0.0, calc.run(), 0);
    }

    @Test
    public void test17() {
        Calculator calc = new Calculator("2 7 -3.9");
        assertEquals(3.9, calc.run(), 0);
    }

    @Test(expected = MyRuntimeException.class)
    public void test17_1() {
        Calculator calc = new Calculator("2 7  "); // square of number
        assertEquals(0.0, calc.run(), 0);
    }

    @Test(expected = InvalidInputException.class)
    public void test17_2() {
        Calculator calc = new Calculator("2 7 b"); // square of number
        assertEquals(0.0, calc.run(), 0);
    }

    @Test
    public void test18() {
        Calculator calc = new Calculator("2 8 2.9");
        assertEquals(3.0, calc.run(), 0);
    }

    @Test(expected = MyRuntimeException.class)
    public void test18_1() {
        Calculator calc = new Calculator("2 8  "); // square of number
        assertEquals(0.0, calc.run(), 0);
    }

    @Test(expected = InvalidInputException.class)
    public void test18_2() {
        Calculator calc = new Calculator("2 8 b"); // square of number
        assertEquals(0.0, calc.run(), 0);
    }

    @Test
    public void test19() {
        Calculator calc = new Calculator("2 9 100");
        assertEquals(4.605170185988092, calc.run(), 0);
    }

    @Test(expected = MyRuntimeException.class)
    public void test19_3() {
        Calculator calc = new Calculator("2 9 0"); // square of number
        assertEquals(0.0, calc.run(), 0);
    }

    @Test(expected = MyRuntimeException.class)
    public void test19_1() {
        Calculator calc = new Calculator("2 9  "); // square of number
        assertEquals(0.0, calc.run(), 0);
    }

    @Test(expected = InvalidInputException.class)
    public void test19_2() {
        Calculator calc = new Calculator("2 9 b"); // square of number
        assertEquals(0.0, calc.run(), 0);
    }

    @Test
    public void test20() {
        Calculator calc = new Calculator("2 10 2");
        assertEquals(7.38905609893065, calc.run(), 0);
    }

    @Test(expected = MyRuntimeException.class)
    public void test20_1() {
        Calculator calc = new Calculator("2 10  "); // square of number
        assertEquals(0.0, calc.run(), 0);
    }

    @Test(expected = InvalidInputException.class)
    public void test20_2() {
        Calculator calc = new Calculator("2 10 b"); // square of number
        assertEquals(0.0, calc.run(), 0);
    }

    @Test(expected = MyRuntimeException.class)
    public void test1_1() {
        Calculator calc = new Calculator("2 5  "); // square of number
        assertEquals(0.0, calc.run(), 0);
    }

    @Test(expected = InvalidInputException.class)
    public void test1_2() {
        Calculator calc = new Calculator("2 5 b"); // square of number
        assertEquals(0.0, calc.run(), 0);
    }

    @Test
    public void test21() {
        Calculator calc = new Calculator("2 5 1 60");
        assertEquals(0.5, calc.run(),0.0000000001);
    }

    @Test(expected = MyRuntimeException.class)
    public void test21_1() {
        Calculator calc = new Calculator("2 5 1  "); // square of number
        assertEquals(0.0, calc.run(), 0);
    }

    @Test(expected = InvalidInputException.class)
    public void test21_2() {
        Calculator calc = new Calculator("2 5 1 b"); // square of number
        assertEquals(0.0, calc.run(), 0);
    }

    @Test
    public void test22() {
        Calculator calc = new Calculator("2 5 2 30");
        assertEquals(0.5, calc.run(), 0.0000000001);
    }
    @Test(expected = MyRuntimeException.class)
    public void test22_1() {
        Calculator calc = new Calculator("2 5 2  "); // square of number
        assertEquals(0.0, calc.run(), 0);
    }

    @Test(expected = InvalidInputException.class)
    public void test22_2() {
        Calculator calc = new Calculator("2 5 2 b"); // square of number
        assertEquals(0.0, calc.run(), 0);
    }

    @Test
    public void test23() {
        Calculator calc = new Calculator("2 5 3 45");
        assertEquals(1.0, calc.run(), 0.0000000001);
    }
    @Test(expected = MyRuntimeException.class)
    public void test23_1() {
        Calculator calc = new Calculator("2 5 3  "); // square of number
        assertEquals(0.0, calc.run(), 0);
    }

    @Test(expected = InvalidInputException.class)
    public void test23_2() {
        Calculator calc = new Calculator("2 5 3 b"); // square of number
        assertEquals(0.0, calc.run(), 0);
    }

    @Test
    public void test24() {
        Calculator calc = new Calculator("2 5 4 45");
        assertEquals(1.0, calc.run(), 0.0000000001);
    }
    @Test(expected = MyRuntimeException.class)
    public void test24_1() {
        Calculator calc = new Calculator("2 5 4  "); // square of number
        assertEquals(0.0, calc.run(), 0);
    }

    @Test(expected = InvalidInputException.class)
    public void test24_2() {
        Calculator calc = new Calculator("2 5 4 b"); // square of number
        assertEquals(0.0, calc.run(), 0);
    }

    @Test
    public void test25() {
        Calculator calc = new Calculator("2 5 5 60");
        assertEquals(2.0, calc.run(), 0.0000000001);
    }
    @Test(expected = MyRuntimeException.class)
    public void test25_1() {
        Calculator calc = new Calculator("2 5 5  "); // square of number
        assertEquals(0.0, calc.run(), 0);
    }

    @Test(expected = InvalidInputException.class)
    public void test25_2() {
        Calculator calc = new Calculator("2 5 5 b"); // square of number
        assertEquals(0.0, calc.run(), 0);
    }

    @Test
    public void test26() {
        Calculator calc = new Calculator("2 5 6 30");
        assertEquals(2.0, calc.run(), 0.0000000001);
    }
    @Test(expected = MyRuntimeException.class)
    public void test26_1() {
        Calculator calc = new Calculator("2 5 6  "); // square of number
        assertEquals(0.0, calc.run(), 0);
    }

    @Test(expected = InvalidInputException.class)
    public void test26_2() {
        Calculator calc = new Calculator("2 5 6 b"); // square of number
        assertEquals(0.0, calc.run(), 0);
    }

    @Test
    public void test27() {
        Calculator calc = new Calculator("2 5 7 0");
        assertEquals(90.0, calc.run(), 0.0000000001);
    }
    @Test(expected = MyRuntimeException.class)
    public void test27_1() {
        Calculator calc = new Calculator("2 5 7  "); // square of number
        assertEquals(0.0, calc.run(), 0);
    }

//    @Test(expected = MyRuntimeException.class)
//    public void test27_3() {
//        Calculator calc = new Calculator("2 5 7 2"); // square of number
//        assertEquals(0.0, calc.run(), 0);
//    }
//
//    @Test(expected = MyRuntimeException.class)
//    public void test27_4() {
//        Calculator calc = new Calculator("2 5 7 -2"); // square of number
//        assertEquals(0.0, calc.run(), 0);
//    }

    @Test(expected = InvalidInputException.class)
    public void test27_2() {
        Calculator calc = new Calculator("2 5 7 b"); // square of number
        assertEquals(0.0, calc.run(), 0);
    }

    @Test
    public void test28() {
        Calculator calc = new Calculator("2 5 8 -1");
        assertEquals(-90.0, calc.run(), 0.0000000001);
    }
    @Test(expected = MyRuntimeException.class)
    public void test28_1() {
        Calculator calc = new Calculator("2 5 8  "); // square of number
        assertEquals(0.0, calc.run(), 0);
    }

    @Test(expected = InvalidInputException.class)
    public void test28_2() {
        Calculator calc = new Calculator("2 5 8 b"); // square of number
        assertEquals(0.0, calc.run(), 0);
    }

    @Test
    public void test29() {
        Calculator calc = new Calculator("2 5 9 1");
        assertEquals(45.0, calc.run(), 0.0000000001);
    }
    @Test(expected = MyRuntimeException.class)
    public void test29_1() {
        Calculator calc = new Calculator("2 5 9  "); // square of number
        assertEquals(0.0, calc.run(), 0);
    }

    @Test(expected = InvalidInputException.class)
    public void test29_2() {
        Calculator calc = new Calculator("2 5 9 b"); // square of number
        assertEquals(0.0, calc.run(), 0);
    }

    @Test(expected = InvalidInputException.class)
    public void test30() {
        Calculator calc = new Calculator("2 11");
        assertEquals(0.0, calc.run(), 0);
    }

    @Test(expected = InvalidInputException.class)
    public void test31() {
        Calculator calc = new Calculator("3");
        assertEquals(0.0, calc.run(), 0);
    }

    @Test(expected = InvalidInputException.class)
    public void test_112() {
        Calculator calc1 = new Calculator("2.3");
        assertEquals(0, calc1.run(), 0);
    }
    @Test(expected = MyRuntimeException.class)
    public void test_113(){
        Calculator calc1 = new Calculator(" ");
        assertEquals(0, calc1.run(),0);
    }
    @Test(expected = MyRuntimeException.class)
    public void test_114(){
        Calculator calc1 = new Calculator("1  ");
        assertEquals(0, calc1.run(),0);
    }
    @Test(expected = InvalidInputException.class)
    public void test_115() {
        Calculator calc1 = new Calculator("1 2.3");
        assertEquals(0, calc1.run(), 0);
    }
    @Test(expected = InvalidInputException.class)
    public void test_116() {
        Calculator calc1 = new Calculator("2 b");
        assertEquals(0, calc1.run(), 0);
    }
    @Test(expected = MyRuntimeException.class)
    public void test_117() {
        Calculator calc1 = new Calculator("2  ");
        assertEquals(0, calc1.run(), 0);
    }


}
