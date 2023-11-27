package org.example.st_pro;
import org.junit.Test;
import static org.junit.Assert.*;
import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class CalculatorTest  {
    @Test
    public void test1() {
        Calculator calc = new Calculator("1 1 7 5.2 ="); // Addition Operation
        assertEquals(12.2, calc.run(), 0.001);
    }

    @Test
    public void test2() {
        Calculator calc = new Calculator("1 1 ="); //Addition Operation with no input values
        assertEquals(0.0, calc.run(), 0);
    }

    @Test(expected = InvalidInputException.class)
    public void test2_1() {
        Calculator calc = new Calculator("1 1 7 b"); //Addition Operation with no input values
        assertEquals(0.0, calc.run(), 0);
    }

    @Test(expected = InvalidInputException.class)
    public void test3() {
        Calculator calc = new Calculator("1 2 5 b"); // Subtraction Operation with no input values
        assertEquals(0.0, calc.run(), 0);
    }

    @Test
    public void test4() {
        Calculator calc = new Calculator("1 2 15 5 ="); // Subtraction
        assertEquals(10.0, calc.run(), 0);
    }

    @Test
    public void test5() {
        Calculator calc = new Calculator("1 3 ="); // Multiplication operation with no input values
        assertEquals(1.0, calc.run(), 0);
    }

    @Test(expected = InvalidInputException.class)
    public void test6_1() {
        Calculator calc = new Calculator("1 3 7 b"); //Addition Operation with no input values
        assertEquals(0.0, calc.run(), 0);
    }

    @Test
    public void test6() {
        Calculator calc = new Calculator("1 3 12 -3 ="); // Multiplication
        assertEquals(-36.0, calc.run(), 0);
    }

    @Test
    public void test7() {
        Calculator calc = new Calculator("1 4 ="); // Division operation with no input values
        assertEquals(0.0, calc.run(), 0);
    }

    @Test
    public void test8() {
        Calculator calc = new Calculator("1 4 12 -3 ="); // Division
        assertEquals(-4.0, calc.run(), 0);
    }

    @Test(expected = InvalidInputException.class)
    public void test8_2() {
        Calculator calc = new Calculator("1 4 7 b"); //Addition Operation with no input values
        assertEquals(0.0, calc.run(), 0);
    }

    @Test
    public void test8_1() {
        Calculator calc = new Calculator("1 4 0 12 ="); // Division operation of dividing 0 by 12 which gives us 0
        assertEquals(0.0, calc.run(), 0);
    }

    @Test
    public void test32() {
        Calculator calc = new Calculator("1 5 ="); // Modulus operation with no input values
        assertEquals(0.0, calc.run(), 0);
    }

    @Test(expected = InvalidInputException.class)
    public void test9_1() {
        Calculator calc = new Calculator("1 5 7 b"); //Addition Operation with no input values
        assertEquals(0.0, calc.run(), 0);
    }

    @Test
    public void test9() {
        Calculator calc = new Calculator("1 5 10 6 ="); // Modulus
        assertEquals(4.0, calc.run(), 0);
    }

    @Test(expected = InvalidInputException.class)
    public void test10() {
        Calculator calc = new Calculator("1 6 ="); // 6 is not there in case 1
        assertEquals(0.0, calc.run(), 0);
    }

    @Test
    public void test11() {
        Calculator calc = new Calculator("2 1 16"); // Square root of number
        assertEquals(4.0, calc.run(), 0);
    }
    // DOUBT
    @Test(expected = MyRuntimeException.class)
    public void test11_3(){
        Calculator calc = new Calculator("2 1 0"); // Square root of 0 DOUBT
        assertEquals(0.0, calc.run(), 0);
    }

    @Test(expected = MyRuntimeException.class)
    public void test11_1() {
        Calculator calc = new Calculator("2 1  "); // square root of no number which gives run time exception
        assertEquals(0.0, calc.run(), 0);
    }

    @Test(expected = InvalidInputException.class)
    public void test11_2() {
        Calculator calc = new Calculator("2 1 b"); // square root of string is not possible
        assertEquals(0.0, calc.run(), 0);
    }

    @Test
    public void test12() {
        Calculator calc = new Calculator("2 2 3 5"); // x power y i.e. here 3 power 5 = 243
        assertEquals(243.0, calc.run(), 0);
    }

    @Test(expected = MyRuntimeException.class)
    public void test12_1() {
        Calculator calc = new Calculator("2 2  "); // square of nothing gives run time error
        assertEquals(0.0, calc.run(), 0);
    }

    @Test(expected = InvalidInputException.class)
    public void test12_2() {
        Calculator calc = new Calculator("2 2 b"); // square of string is not possible because it is not valid
        assertEquals(0.0, calc.run(), 0);
    }

    @Test
    public void test13() {
        Calculator calc = new Calculator("2 3 5"); // square of number
        assertEquals(25.0, calc.run(), 0);
    }

    @Test(expected = MyRuntimeException.class)
    public void test13_1() {
        Calculator calc = new Calculator("2 3  "); // square of empty is not possible as it only takes int
        assertEquals(0.0, calc.run(), 0);
    }

    @Test(expected = InvalidInputException.class)
    public void test13_2() {
        Calculator calc = new Calculator("2 3 b"); // square of string is not possible as it is invalid
        assertEquals(0.0, calc.run(), 0);
    }

    @Test
    public void test14() {
        Calculator calc = new Calculator("2 4 3"); // cube of number
        assertEquals(27.0, calc.run(), 0);
    }

    @Test(expected = MyRuntimeException.class)
    public void test14_1() {
        Calculator calc = new Calculator("2 4  "); // cube of empty value gives run time error
        assertEquals(0.0, calc.run(), 0);
    }

    @Test(expected = InvalidInputException.class)
    public void test14_2() {
        Calculator calc = new Calculator("2 4 b"); // cube of string gives error because it is invalid input
        assertEquals(0.0, calc.run(), 0);
    }

    @Test(expected = InvalidInputException.class)
    public void test15() {
        Calculator calc = new Calculator("2 5 12"); // Invalid input in case 5
        assertEquals(0.0, calc.run(), 0);
    }

    @Test
    public void test16() {
        Calculator calc = new Calculator("2 6 81 4"); // 4th root of 81 is 3.
        assertEquals(3.0, calc.run(), 0);
    }

    @Test(expected = MyRuntimeException.class)
    public void test16_3() {
        Calculator calc = new Calculator("2 6 9 0"); // 0th root is not possible
        assertEquals(0.0, calc.run(), 0);
    }

    @Test(expected = MyRuntimeException.class)
    public void test16_1() {
        Calculator calc = new Calculator("2 6  "); // Invalid Input
        assertEquals(0.0, calc.run(), 0);
    }

    @Test(expected = InvalidInputException.class)
    public void test16_2() {
        Calculator calc = new Calculator("2 6 b"); // Invalid Input
        assertEquals(0.0, calc.run(), 0);
    }

    @Test
    public void test17() {
        Calculator calc = new Calculator("2 7 -3.9"); // Absolute of number
        assertEquals(3.9, calc.run(), 0);
    }

    @Test(expected = MyRuntimeException.class)
    public void test17_1() {
        Calculator calc = new Calculator("2 7  "); // Invalid Input
        assertEquals(0.0, calc.run(), 0);
    }

    @Test(expected = InvalidInputException.class)
    public void test17_2() {
        Calculator calc = new Calculator("2 7 b"); // Invalid Input
        assertEquals(0.0, calc.run(), 0);
    }

    @Test
    public void test18() {
        Calculator calc = new Calculator("2 8 2.9"); // Round of the number
        assertEquals(3.0, calc.run(), 0);
    }

    @Test(expected = MyRuntimeException.class)
    public void test18_1() {
        Calculator calc = new Calculator("2 8  "); // Invalid Input
        assertEquals(0.0, calc.run(), 0);
    }

    @Test(expected = InvalidInputException.class)
    public void test18_2() {
        Calculator calc = new Calculator("2 8 b"); // Invalid Input
        assertEquals(0.0, calc.run(), 0);
    }

    @Test
    public void test19() {
        Calculator calc = new Calculator("2 9 100"); // Logarithm of number
        assertEquals(4.605170185988092, calc.run(), 0);
    }

    @Test(expected = MyRuntimeException.class)
    public void test19_3() {
        Calculator calc = new Calculator("2 9 0"); // Invalid Input
        assertEquals(0.0, calc.run(), 0);
    }

    @Test(expected = MyRuntimeException.class)
    public void test19_1() {
        Calculator calc = new Calculator("2 9  "); // Invalid Input
        assertEquals(0.0, calc.run(), 0);
    }

    @Test(expected = InvalidInputException.class)
    public void test19_2() {
        Calculator calc = new Calculator("2 9 b"); // square of number
        assertEquals(0.0, calc.run(), 0);
    }

    @Test
    public void test20() {
        Calculator calc = new Calculator("2 10 2"); // Exponential of number
        assertEquals(7.38905609893065, calc.run(), 0);
    }

    @Test(expected = MyRuntimeException.class)
    public void test20_1() {
        Calculator calc = new Calculator("2 10  "); // Invalid Input
        assertEquals(0.0, calc.run(), 0);
    }

    @Test(expected = InvalidInputException.class)
    public void test20_2() {
        Calculator calc = new Calculator("2 10 b"); // Invalid Input
        assertEquals(0.0, calc.run(), 0);
    }

    @Test(expected = MyRuntimeException.class)
    public void test1_1() {
        Calculator calc = new Calculator("2 5  "); // Invalid Input
        assertEquals(0.0, calc.run(), 0);
    }

    @Test(expected = InvalidInputException.class)
    public void test1_2() {
        Calculator calc = new Calculator("2 5 b"); // Invalid Input
        assertEquals(0.0, calc.run(), 0);
    }

    @Test
    public void test21() {
        Calculator calc = new Calculator("2 5 1 60"); // cos of the angle
        assertEquals(0.5, calc.run(),0.0000000001);
    }

    @Test(expected = MyRuntimeException.class)
    public void test21_1() {
        Calculator calc = new Calculator("2 5 1  "); // Invalid Input
        assertEquals(0.0, calc.run(), 0);
    }

    @Test(expected = InvalidInputException.class)
    public void test21_2() {
        Calculator calc = new Calculator("2 5 1 b"); // Invalid Input
        assertEquals(0.0, calc.run(), 0);
    }

    @Test
    public void test22() {
        Calculator calc = new Calculator("2 5 2 30"); // sin of the angle
        assertEquals(0.5, calc.run(), 0.0000000001);
    }
    @Test(expected = MyRuntimeException.class)
    public void test22_1() {
        Calculator calc = new Calculator("2 5 2  "); // sInvalid Input
        assertEquals(0.0, calc.run(), 0);
    }

    @Test(expected = InvalidInputException.class)
    public void test22_2() {
        Calculator calc = new Calculator("2 5 2 b"); // Invalid Input
        assertEquals(0.0, calc.run(), 0);
    }

    @Test
    public void test23() {
        Calculator calc = new Calculator("2 5 3 45"); // tan of the angle
        assertEquals(1.0, calc.run(), 0.0000000001);
    }
    @Test(expected = MyRuntimeException.class)
    public void test23_1() {
        Calculator calc = new Calculator("2 5 3  "); // Invalid Input
        assertEquals(0.0, calc.run(), 0);
    }

    @Test(expected = InvalidInputException.class)
    public void test23_2() {
        Calculator calc = new Calculator("2 5 3 b"); // Invalid Input
        assertEquals(0.0, calc.run(), 0);
    }

    @Test
    public void test24() {
        Calculator calc = new Calculator("2 5 4 30"); // cot of the angle
        assertEquals(1.7320508075688774, calc.run(), 0.0000000001);
    }
    @Test(expected = MyRuntimeException.class)
    public void test24_1() {
        Calculator calc = new Calculator("2 5 4  "); // Invalid Input
        assertEquals(0.0, calc.run(), 0);
    }

    @Test(expected = InvalidInputException.class)
    public void test24_2() {
        Calculator calc = new Calculator("2 5 4 b"); // Invalid Input
        assertEquals(0.0, calc.run(), 0);
    }

    @Test
    public void test25() {
        Calculator calc = new Calculator("2 5 5 60"); // secant of the angle
        assertEquals(2.0, calc.run(), 0.0000000001);
    }
    @Test(expected = MyRuntimeException.class)
    public void test25_1() {
        Calculator calc = new Calculator("2 5 5  "); // Invalid Input
        assertEquals(0.0, calc.run(), 0);
    }

    @Test(expected = InvalidInputException.class)
    public void test25_2() {
        Calculator calc = new Calculator("2 5 5 b"); // Invalid Input
        assertEquals(0.0, calc.run(), 0);
    }

    @Test
    public void test26() {
        Calculator calc = new Calculator("2 5 6 30"); // cosec of angle
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
        Calculator calc = new Calculator("2 5 7 -1"); // cos inverse of number
        assertEquals(180.0, calc.run(), 0.0000000001);
    }
    @Test(expected = MyRuntimeException.class)
    public void test27_1() {
        Calculator calc = new Calculator("2 5 7  "); // Invalid Input
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
        Calculator calc = new Calculator("2 5 7 b"); // Invalid Input
        assertEquals(0.0, calc.run(), 0);
    }

    @Test
    public void test28() {
        Calculator calc = new Calculator("2 5 8 -1"); // sin inverse of value
        assertEquals(-90.0, calc.run(), 0.0000000001);
    }
    @Test(expected = MyRuntimeException.class)
    public void test28_1() {
        Calculator calc = new Calculator("2 5 8  "); // Invalid Input
        assertEquals(0.0, calc.run(), 0);
    }

    @Test(expected = InvalidInputException.class)
    public void test28_2() {
        Calculator calc = new Calculator("2 5 8 b"); // Invalid Input
        assertEquals(0.0, calc.run(), 0);
    }

    @Test
    public void test29() {
        Calculator calc = new Calculator("2 5 9 1"); // tan inverse of value
        assertEquals(45.0, calc.run(), 0.0000000001);
    }
    @Test(expected = MyRuntimeException.class)
    public void test29_1() {
        Calculator calc = new Calculator("2 5 9  "); // Invalid Input
        assertEquals(0.0, calc.run(), 0);
    }

    @Test(expected = InvalidInputException.class)
    public void test29_2() {
        Calculator calc = new Calculator("2 5 9 b"); // sInvalid Input
        assertEquals(0.0, calc.run(), 0);
    }

    @Test(expected = InvalidInputException.class)
    public void test30() {
        Calculator calc = new Calculator("2 11"); // Invalid Input
        assertEquals(0.0, calc.run(), 0);
    }

    @Test(expected = InvalidInputException.class)
    public void test31() {
        Calculator calc = new Calculator("3"); // Invalid Input
        assertEquals(0.0, calc.run(), 0);
    }

    @Test(expected = InvalidInputException.class)
    public void test_112() {
        Calculator calc1 = new Calculator("2.3"); // Invalid Input
        assertEquals(0, calc1.run(), 0);
    }

    @Test(expected = MyRuntimeException.class)
    public void test_113(){
        Calculator calc1 = new Calculator(" "); // Invalid Input
        assertEquals(0, calc1.run(),0);
    }

    @Test(expected = MyRuntimeException.class)
    public void test_114(){
        Calculator calc1 = new Calculator("1  "); // Invalid Input
        assertEquals(0, calc1.run(),0);
    }
    @Test(expected = InvalidInputException.class)
    public void test_115() {
        Calculator calc1 = new Calculator("1 2.3"); // Invalid Input
        assertEquals(0, calc1.run(), 0);
    }

    @Test(expected = InvalidInputException.class)
    public void test_116() {
        Calculator calc1 = new Calculator("2 b"); // Invalid Input
        assertEquals(0, calc1.run(), 0);
    }

    @Test(expected = MyRuntimeException.class)
    public void test_117() {
        Calculator calc1 = new Calculator("2  "); // Invalid Input
        assertEquals(0, calc1.run(), 0);
    }

    @Test(expected = OutOfDomainException.class)
    public void test_334(){
        String validInput = "1.5\n";
        System.setIn(new ByteArrayInputStream(validInput.getBytes()));
        Scanner scanner = new Scanner(System.in);
        Calculator calc1 = new Calculator("2 2");
        double result = calc1.asinInput(scanner);
        assertEquals(0.5, result, 0.001);
    }

}