package org.example.st_pro;
import org.junit.Test;
import static org.junit.Assert.*;


public class AppTest  {
    String testCase1 = "1 1 =";
    double testRes1 = 0.0;
    String testCase2 = "1 1 4 5 =";
    double testRes2 = 9.0;
    String testCase3 = "1 2 =";
    double testRes3 = 0.0;
    String testCase4 = "1 2 10 5 =";
    double testRes4 = 5.0;
    String testCase5 = "1 3 =";
    double testRes5 = 1.0;
    String testCase6 = "1 3 10 -3 =";
    double testRes6 = -30.0;
    String testCase7 = "1 4 =";
    double testRes7 = 0.0;
    String testCase8 = "1 4 12 -2 =";
    double testRes8 = -6.0;
    String testCase9 = "1 5 10 7 =";
    double testRes9 = 3.0;
    String testCase10 = "1 6 =";
    double testRes10 = 0.0;
    String testCase11 = "2 1 9";
    double testRes11 = 3.0;
    String testCase12 = "2 2 3 4";
    double testRes12 = 81.0;
    String testCase13 = "2 3 6";
    double testRes13 = 36.0;
    String testCase14 = "2 4 4";
    double testRes14 = 64.0;
    String testCase15 = "2 5 12";
    double testRes15 = 0.0;
    String testCase16 = "2 6 81 4";
    double testRes16 = 3.0;
    String testCase17 = "2 7 -3.9";
    double testRes17 = 3.9;
    String testCase18 = "2 8 2.9";
    double testRes18 = 3.0;
    String testCase19 = "2 9 100";
    double testRes19 = 4.605170185988092;
    String testCase20 = "2 10 2";
    double testRes20 = 7.38905609893065;
    String testCase21 = "2 5 1 60";
    double testRes21 = 0.5;
    String testCase22 = "2 5 2 30";
    double testRes22 = 0.5;
    String testCase23 = "2 5 3 45";
    double testRes23 = 1.0;
    String testCase24 = "2 5 4 45";
    double testRes24 = 1.0;
    String testCase25 = "2 5 5 60";
    double testRes25 = 2.0;
    String testCase26 = "2 5 6 30";
    double testRes26 = 2.0;
    String testCase27 = "2 5 7 1";
    double testRes27 = 0.0;
    String testCase28 = "2 5 8 -1";
    double testRes28 = -90.0;
    String testCase29 = "2 5 9 1";
    double testRes29 = 45.0;
    String testCase30 = "2 11";
    double testRes30 = 0.0;
    String testCase31 = "3";
    double testRes31 = 0.0;
    String testCase32 = "1 5 =";
    double testRes32 = 0.0;

    @Test
    public void testCase() {
        Calculator calc1 = new Calculator(testCase1);
        assertEquals(testRes1, calc1.run(),0);

        Calculator calc2 = new Calculator(testCase2);
        assertEquals(testRes2, calc2.run(),0);
//
        Calculator calc3 = new Calculator(testCase3);
        assertEquals(testRes3, calc3.run(),0);
//
        Calculator calc4 = new Calculator(testCase4);
        assertEquals(testRes4, calc4.run(),0);
//
        Calculator calc5 = new Calculator(testCase5);
        assertEquals(testRes5, calc5.run(),0);
//
        Calculator calc6 = new Calculator(testCase6);
        assertEquals(testRes6, calc6.run(),0);

        Calculator calc7 = new Calculator(testCase7);
        assertEquals(testRes7, calc7.run(),0);

        Calculator calc8 = new Calculator(testCase8);
        assertEquals(testRes8, calc8.run(),0);

        Calculator calc9 = new Calculator(testCase9);
        assertEquals(testRes9, calc9.run(),0);

        Calculator calc10 = new Calculator(testCase10);
        assertEquals(testRes10, calc10.run(),0);

        Calculator calc11 = new Calculator(testCase11);
        assertEquals(testRes11, calc11.run(),0);

        Calculator calc12 = new Calculator(testCase12);
        assertEquals(testRes12, calc12.run(),0);

        Calculator calc13 = new Calculator(testCase13);
        assertEquals(testRes13, calc13.run(),0);

        Calculator calc14 = new Calculator(testCase14);
        assertEquals(testRes14, calc14.run(),0);

        Calculator calc15 = new Calculator(testCase15);
        assertEquals(testRes15, calc15.run(),0);

        Calculator calc16 = new Calculator(testCase16);
        assertEquals(testRes16, calc16.run(),0);

        Calculator calc17 = new Calculator(testCase17);
        assertEquals(testRes17, calc17.run(),0);

        Calculator calc18 = new Calculator(testCase18);
        assertEquals(testRes18, calc18.run(),0);

        Calculator calc19 = new Calculator(testCase19);
        assertEquals(testRes19, calc19.run(),0);

        Calculator calc20 = new Calculator(testCase20);
        assertEquals(testRes20, calc20.run(),0);

        Calculator calc21 = new Calculator(testCase21);
        assertEquals(testRes21, calc21.run(),0.0000000001);

        Calculator calc22 = new Calculator(testCase22);
        assertEquals(testRes22, calc22.run(),0.0000000001);

        Calculator calc23 = new Calculator(testCase23);
        assertEquals(testRes23, calc23.run(),0.0000000001);

        Calculator calc24 = new Calculator(testCase24);
        assertEquals(testRes24, calc24.run(),0.0000000001);

        Calculator calc25 = new Calculator(testCase25);
        assertEquals(testRes25, calc25.run(),0.0000000001);

        Calculator calc26 = new Calculator(testCase26);
        assertEquals(testRes26, calc26.run(),0.0000000001);

        Calculator calc27 = new Calculator(testCase27);
        assertEquals(testRes27, calc27.run(),0.0000000001);

        Calculator calc28 = new Calculator(testCase28);
        assertEquals(testRes28, calc28.run(),0.0000000001);

        Calculator calc29 = new Calculator(testCase29);
        assertEquals(testRes29, calc29.run(),0.0000000001);

        Calculator calc30 = new Calculator(testCase30);
        assertEquals(testRes30, calc30.run(),0);

        Calculator calc31 = new Calculator(testCase31);
        assertEquals(testRes31, calc31.run(),0);

        Calculator calc32 = new Calculator(testCase32);
        assertEquals(testRes32, calc32.run(),0);
    }
}
