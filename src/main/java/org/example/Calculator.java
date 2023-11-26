package org.example.st_pro;
import java.util.*;
import java.io.*;

public class Calculator
{
    int choice,c1,c2;
    public double res;
    public String str;
    public Calculator(String x)
    {
        str = x;
        res = 0.0;
    }
    public static int calcInput(Scanner keyboard)
    {
        //Scanner keyboard = new Scanner(in);
        int res = 0;
        while(true)
        {
            try
            {
                res=keyboard.nextInt();
            }
            catch(InputMismatchException obj)
            {
                throw new InvalidInputException("Invalid input. Please enter a valid number.");
            }
            catch(Exception o)
            {
                throw new MyRuntimeException("Error occurred.");
            }
            break;
        }
        return res;
    }
    public static int normCalcInput(Scanner keyboard)
    {
        //Scanner keyboard = new Scanner(in);
        int res = 0;
        while(true)
        {
            try
            {
                res = keyboard.nextInt();
            }
            catch(InputMismatchException obj)
            {
                throw new InvalidInputException("Invalid input. Please enter a valid number.");
            }
            catch(Exception o)
            {
                throw new MyRuntimeException("Error occurred.");
            }
            break;
        }
        return res;
    }
    public static int scientCalcInput(Scanner keyboard)
    {
        //Scanner keyboard = new Scanner(in);
        int res;
        while(true)
        {
            try
            {
                res=keyboard.nextInt();
            }
            catch(InputMismatchException obj)
            {
                throw new InvalidInputException("Invalid input. Please enter a valid number.");
            }
            catch(Exception o)
            {
                throw new MyRuntimeException("Error occurred.");
            }
            break;
        }
        return res;
    }
    public static double addInput(Scanner keyboard)
    {
        //Scanner keyboard = new Scanner(in);
        int res;
        if(keyboard.hasNextInt())
        {
            while(true)
            {
                try
                {
                    res=keyboard.nextInt();
                }
                catch(InputMismatchException obj)
                {
                    throw new InvalidInputException("Invalid input. Please enter a valid number.");
                }
                catch(Exception o)
                {
                    throw new MyRuntimeException("Error occurred.");
                }
                break;
            }
        }
        else
        {
            while(true)
            {
                String x = keyboard.next();
                if(x.equals("="))
                {
                    return 0.1;
                }
            }
        }
        return res;
    }
    public static double subInput(Scanner keyboard)
    {
        //Scanner keyboard = new Scanner(in);
        int res;
        if(keyboard.hasNextInt())
        {
            while(true)
            {
                try
                {
                    res=keyboard.nextInt();
                }
                catch(InputMismatchException obj)
                {
                    throw new InvalidInputException("Invalid input. Please enter a valid number.");
                }
                catch(Exception o)
                {
                    throw new MyRuntimeException("Error occurred.");
                }
                break;
            }
        }
        else {
            while (true) {
                try {
                    String x = keyboard.next();
                    if (x.equals("=")) {
                        return 0.1;
                    }
                } catch (NoSuchElementException e) {
                    throw new InvalidInputException("Invalid input. Please enter a valid number or '='.");
                } catch (Exception e) {
                    throw new MyRuntimeException("Error occurred.");
                }
            }
        }
        return res;
    }
    public static double mulInput(Scanner keyboard)
    {
        //Scanner keyboard = new Scanner(in);
        int res;
        if(keyboard.hasNextInt())
        {
            while(true)
            {
                try
                {
                    res=keyboard.nextInt();
                }
                catch(InputMismatchException obj)
                {
                    throw new InvalidInputException("Invalid input. Please enter a valid number.");
                }
                catch(Exception o)
                {
                    throw new MyRuntimeException("Error occurred.");
                }
                break;
            }
        }
        else
        {
            while(true)
            {
                String x = keyboard.next();
                if(x.equals("="))
                {
                    return 0.1;
                }
            }
        }
        return res;
    }
    public static double divInput(Scanner keyboard)
    {
        //Scanner keyboard = new Scanner(in);
        int res;
        if(keyboard.hasNextInt())
        {
            while(true)
            {
                try
                {
                    res=keyboard.nextInt();
                }
                catch(InputMismatchException obj)
                {
                    throw new InvalidInputException("Invalid input. Please enter a valid number.");
                }
                catch(Exception o)
                {
                    throw new MyRuntimeException("Error occurred.");
                }
                break;
            }
        }
        else
        {
            while(true)
            {
                String x = keyboard.next();
                if(x.equals("="))
                {
                    return 0.1;
                }
            }
        }
        return res;
    }
    public static double modInput(Scanner keyboard)
    {
        //Scanner keyboard = new Scanner(in);
        int res;
        if(keyboard.hasNextInt())
        {
            while(true)
            {
                try
                {
                    res=keyboard.nextInt();
                }
                catch(InputMismatchException obj)
                {
                    throw new InvalidInputException("Invalid input. Please enter a valid number.");
                }
                catch(Exception o)
                {
                    throw new MyRuntimeException("Error occurred.");
                }
                break;
            }
        }
        else
        {
            while(true)
            {
                String x = keyboard.next();
                if(x.equals("="))
                {
                    return 0.1;
                }
            }
        }
        return res;
    }
    public static double squareRootInput(Scanner keyboard)
    {
        //Scanner keyboard = new Scanner(in);
        double res;
        while(true)
        {
            try
            {
                res=keyboard.nextDouble();
            }
            catch(InputMismatchException obj)
            {
                throw new InvalidInputException("Invalid input. Please enter a valid number.");
            }
            catch(Exception o)
            {
                throw new MyRuntimeException("Error occurred.");
            }
            if(res<=0)
            {
                //System.out.println("Please enter a positive value");
                continue;
            }
            break;
        }
        return res;
    }
    public static double rootToXInput(Scanner keyboard)
    {
        //Scanner keyboard = new Scanner(in);
        double res;
        while(true)
        {
            try
            {
                res=keyboard.nextDouble();
            }
            catch(InputMismatchException obj)
            {
                throw new InvalidInputException("Invalid input. Please enter a valid number.");
            }
            catch(Exception o)
            {
                throw new MyRuntimeException("Error occurred.");
            }
            if(res<=0)
            {
                //System.out.println("Please enter a positive value");
                continue;
            }
            break;
        }
        return res;
    }
    public static double squareInput(Scanner keyboard)
    {
        //Scanner keyboard = new Scanner(in);
        double res;
        while(true)
        {
            try
            {
                res=keyboard.nextDouble();
            }
            catch(InputMismatchException obj)
            {
                throw new InvalidInputException("Invalid input. Please enter a valid number.");
            }
            catch(Exception o)
            {
                throw new MyRuntimeException("Error occurred.");
            }
            break;
        }
        return res;
    }
    public static double cubeInput(Scanner keyboard)
    {
        //Scanner keyboard = new Scanner(in);
        double res;
        while(true)
        {
            try
            {
                res=keyboard.nextDouble();
            }
            catch(InputMismatchException obj)
            {
                throw new InvalidInputException("Invalid input. Please enter a valid number.");
            }
            catch(Exception o)
            {
                throw new MyRuntimeException("Error occurred.");
            }
            break;
        }
        return res;
    }
    public static double raiseToXInput(Scanner keyboard)
    {
        //Scanner keyboard = new Scanner(in);
        double res;
        while(true)
        {
            try
            {
                res=keyboard.nextDouble();
            }
            catch(InputMismatchException obj)
            {
                throw new InvalidInputException("Invalid input. Please enter a valid number.");
            }
            catch(Exception o)
            {
                throw new MyRuntimeException("Error occurred.");
            }
            break;
        }
        return res;
    }
    public static double absInput(Scanner keyboard)
    {
        //Scanner keyboard = new Scanner(in);
        double res;
        while(true)
        {
            try
            {
                res=keyboard.nextDouble();
            }
            catch(InputMismatchException obj)
            {
                throw new InvalidInputException("Invalid input. Please enter a valid number.");
            }
            catch(Exception o)
            {
                throw new MyRuntimeException("Error occurred.");
            }
            break;
        }
        return res;
    }
    public static double logInput(Scanner keyboard)
    {
        //Scanner keyboard = new Scanner(in);
        double res;
        while(true)
        {
            try
            {
                res=keyboard.nextDouble();
            }
            catch(InputMismatchException obj)
            {
                throw new InvalidInputException("Invalid input. Please enter a valid number.");
            }
            catch(Exception o)
            {
                throw new MyRuntimeException("Error occurred.");
            }
            if(res<=0)
            {
                //System.out.println("Enter a valid number greater than 0");
                continue;
            }
            break;
        }
        return res;
    }
    public static double expInput(Scanner keyboard)
    {
        //Scanner keyboard = new Scanner(in);
        double res;
        while(true)
        {
            try
            {
                res=keyboard.nextDouble();
            }
            catch(InputMismatchException obj)
            {
                throw new InvalidInputException("Invalid input. Please enter a valid number.");
            }
            catch(Exception o)
            {
                throw new MyRuntimeException("Error occurred.");
            }
            break;
        }
        return res;
    }
    public static double roundInput(Scanner keyboard)
    {
        //Scanner keyboard = new Scanner(in);
        double res;
        while(true)
        {
            try
            {
                res=keyboard.nextDouble();
            }
            catch(InputMismatchException obj)
            {
                throw new InvalidInputException("Invalid input. Please enter a valid number.");
            }
            catch(Exception o)
            {
                throw new MyRuntimeException("Error occurred.");
            }
            break;
        }
        return res;
    }
    public static int trigoInput(Scanner keyboard)
    {
        //Scanner keyboard = new Scanner(in);
        int res;
        while(true)
        {
            try
            {
                res=keyboard.nextInt();
            }
            catch(InputMismatchException obj)
            {
                throw new InvalidInputException("Invalid input. Please enter a valid number.");
            }
            catch(Exception o)
            {
                throw new MyRuntimeException("Error occurred.");
            }
            break;
        }
        return res;
    }
    public static double cosInput(Scanner keyboard)
    {
        //Scanner keyboard = new Scanner(in);
        double res;
        while(true)
        {
            try
            {
                res=keyboard.nextDouble();
            }
            catch(InputMismatchException obj)
            {
                throw new InvalidInputException("Invalid input. Please enter a valid number.");
            }
            catch(Exception o)
            {
                throw new MyRuntimeException("Error occurred.");
            }
            break;
        }
        return res;
    }
    public static double sinInput(Scanner keyboard)
    {
        //Scanner keyboard = new Scanner(in);
        double res;
        while(true)
        {
            try
            {
                res=keyboard.nextDouble();
            }
            catch(InputMismatchException obj)
            {
                throw new InvalidInputException("Invalid input. Please enter a valid number.");
            }
            catch(Exception o)
            {
                throw new MyRuntimeException("Error occurred.");
            }
            break;
        }
        return res;
    }
    public static double tanInput(Scanner keyboard)
    {
        double res;
        while(true)
        {
            try
            {
                res=keyboard.nextDouble();
            }
            catch(InputMismatchException obj)
            {
                throw new InvalidInputException("Invalid input. Please enter a valid number.");
            }
            catch(Exception o)
            {
                throw new MyRuntimeException("Error occurred.");
            }
            break;
        }
        return res;
    }
    public static double cotInput(Scanner keyboard)
    {
        //Scanner keyboard = new Scanner(in);
        double res;
        while(true)
        {
            try
            {
                res=keyboard.nextDouble();
            }
            catch(InputMismatchException obj)
            {
                throw new InvalidInputException("Invalid input. Please enter a valid number.");
            }
            catch(Exception o)
            {
                throw new MyRuntimeException("Error occurred.");
            }
            break;
        }
        return res;
    }
    public static double secInput(Scanner keyboard)
    {
        //Scanner keyboard = new Scanner(in);
        double res;
        while(true)
        {
            try
            {
                res=keyboard.nextDouble();
            }
            catch(InputMismatchException obj)
            {
                throw new InvalidInputException("Invalid input. Please enter a valid number.");
            }
            catch(Exception o)
            {
                throw new MyRuntimeException("Error occurred.");
            }
            break;
        }
        return res;
    }
    public static double cosecInput(Scanner keyboard)
    {
        //Scanner keyboard = new Scanner(in);
        double res;
        while(true)
        {
            try
            {
                res=keyboard.nextDouble();
            }
            catch(InputMismatchException obj)
            {
                throw new InvalidInputException("Invalid input. Please enter a valid number.");
            }
            catch(Exception o)
            {
                throw new MyRuntimeException("Error occurred.");
            }
            break;
        }
        return res;
    }
    public static double acosInput(Scanner keyboard)
    {
        //Scanner keyboard = new Scanner(in);
        double res;
        while(true)
        {
            try
            {
                res=keyboard.nextDouble();
            }
            catch(InputMismatchException obj)
            {
                throw new InvalidInputException("Invalid input. Please enter a valid number.");
            }
            catch(Exception o)
            {
                throw new MyRuntimeException("Error occurred.");
            }
            if(res>1 || res<-1)
            {
                //System.out.println("Val out of domain");
                continue;
            }
            break;
        }
        return res;
    }
    public static double asinInput(Scanner keyboard)
    {
        //Scanner keyboard = new Scanner(in);
        double res;
        while(true)
        {
            try
            {
                res=keyboard.nextDouble();
            }
            catch(InputMismatchException obj)
            {
                throw new InvalidInputException("Invalid input. Please enter a valid number.");
            }
            catch(Exception o)
            {
                throw new MyRuntimeException("Error occurred.");
            }
            if(res>1 || res<-1)
            {
                //System.out.println("Val out of domain");
                continue;
            }
            break;
        }
        return res;
    }
    public static double atanInput(Scanner keyboard)
    {
        //Scanner keyboard = new Scanner(in);
        double res;
        while(true)
        {
            try
            {
                res=keyboard.nextDouble();
            }
            catch(InputMismatchException obj)
            {
                throw new InvalidInputException("Invalid input. Please enter a valid number.");
            }
            catch(Exception o)
            {
                throw new MyRuntimeException("Error occurred.");
            }
            break;
        }
        return res;
    }
    public double run()
    {
        ByteArrayInputStream in = new ByteArrayInputStream(str.getBytes());
        Scanner keyboard = new Scanner(in);
        // System.exit(0);
        // InputStream in = System.in;
        //System.out.println("ENTER ONE FOR BASIC CALCULATOR");
        //System.out.println("ENTER TWO FOR SCIENTIFIC CALCULATOR");
        choice = Calculator.calcInput(keyboard);
        switch(choice)
        {
            case 1:
                //System.out.println("ENTER 1 FOR ADDITION");
                //System.out.println("ENTER 2 FOR SUBTRACTION");
                //System.out.println("ENTER 3 FOR MULTIPLICATION");
                //System.out.println("ENTER 4 FOR DIVISION");
                //System.out.println("ENTER 5 FOR MODULUS");
                int cho = Calculator.normCalcInput(keyboard);
                switch(cho)
                {
                    case 1:
                        while(true)
                        {
                            double num = Calculator.addInput(keyboard);
                            if(num==0.1)break;
                            res = add((int)num,(int)res);
                        }
                        break;
                    case 2:
                        int flag = 0;
                        while(true)
                        {
                            double num = Calculator.subInput(keyboard);
                            if(num==0.1)break;
                            if(flag==0)res = (int)num;
                            else res = subtract((int)num,(int)res);
                            flag=1;
                        }
                        break;
                    case 3:
                        res = 1;
                        while(true)
                        {
                            double num = Calculator.mulInput(keyboard);
                            if(num==0.1)break;
                            res = multiply((int)num,(int)res);
                        }
                        break;
                    case 4:
                        flag = 0;
                        while(true)
                        {
                            double num = Calculator.divInput(keyboard);
                            if(num==0.1)break;
                            if(flag==1 && num==0)
                            {
                                //System.out.println("Cannot divide by 0");
                                continue;
                            }
                            if(flag==0)res = (int)num;
                            else res = divide((int)num,(int)res);
                            flag=1;
                        }
                        break;
                    case 5:
                        flag = 0;
                        while(true)
                        {
                            double num = Calculator.modInput(keyboard);
                            if(num==0.1)break;
                            if(flag==0)res = (int)num;
                            else res = modulus((int)num,(int)res);
                            flag=1;
                        }
                        break;
                    default:
                        throw new InvalidInputException("Invalid choice. Please enter a valid operation.");//System.out.println("Invalid choice");
                }
                break;
            case 2:
                //System.out.println("ENTER 1 TO FIND SQUARE ROOT");
                //System.out.println("ENTER 2 TO FIND RAISE TO POWER 'x'");
                //System.out.println("ENTER 3  TO FIND SQUARE");
                //System.out.println("ENTER 4  TO FIND CUBE");
                //System.out.println("ENTER 5  TO FIND TRIGNOMETRICAL VALUES");
                //System.out.println("ENTER 6  TO FIND ROOT TO X");
                //System.out.println("ENTER 7  TO ABSOLUTE VALUE");
                //System.out.println("ENTER 8  TO FIND ROUNDED OFF VALUE");
                //System.out.println("ENTER 9  TO FIND LOG");
                //System.out.println("ENTER 10  TO FIND EXPONENTIAL VALUE");
                int c9 = Calculator.scientCalcInput(keyboard);
                switch(c9)
                {
                    case 1:
                        double x = Calculator.squareRootInput(keyboard);
                        res = squareroot(x);
                        break;
                    case 2:
                        x = Calculator.raiseToXInput(keyboard);
                        double y = Calculator.raiseToXInput(keyboard);
                        res = raise_to_x(x,y);
                        break;
                    case 3:
                        x = Calculator.squareInput(keyboard);
                        res = square(x);
                        break;
                    case 4:
                        x = Calculator.cubeInput(keyboard);
                        res = cube(x);
                        break;
                    case 5:
                        //System.out.println("Enter Your choice");
                        //System.out.println("Enter one for cosine");
                        //System.out.println("Enter two for sine");
                        //System.out.println("Enter three for tangent");
                        //System.out.println("Enter four for cotangent");
                        //System.out.println("Enter five for secant");
                        //System.out.println("Enter six for cosecant");
                        //System.out.println("Enter seven for inverse-cosine");
                        //System.out.println("Enter eight for inverse-sine");
                        //System.out.println("Enter nine for inverse-tangent");
                        int ch = Calculator.trigoInput(keyboard);
                        switch(ch)
                        {
                            case 1:
                                double theta = Calculator.cosInput(keyboard);
                                res = cosine(theta);
                                break;
                            case 2:
                                theta = Calculator.sinInput(keyboard);
                                res = sine(theta);
                                break;
                            case 3:
                                theta = Calculator.tanInput(keyboard);
                                res = tangent(theta);
                                break;
                            case 4:
                                theta = Calculator.cotInput(keyboard);
                                res = cotangent(theta);
                                break;
                            case 5:
                                theta = Calculator.secInput(keyboard);
                                res = secant(theta);
                                break;
                            case 6:
                                theta = Calculator.cosecInput(keyboard);
                                res = cosecant(theta);
                                break;
                            case 7:
                                double val = Calculator.acosInput(keyboard);
                                res = acosine(val);
                                break;
                            case 8:
                                val = Calculator.asinInput(keyboard);
                                res = asine(val);
                                break;
                            case 9:
                                val = Calculator.atanInput(keyboard);
                                res = atangent(val);
                                break;
                            default:
                                throw new InvalidInputException("Invalid choice. Please enter a valid operation.");
                        }
                        break;
                    case 6:
                        x = Calculator.rootToXInput(keyboard);
                        y = Calculator.rootToXInput(keyboard);
                        res = root_to_x(x,y);
                        break;
                    case 7:
                        x = Calculator.absInput(keyboard);
                        res = absolute(x);
                        break;
                    case 8:
                        x = Calculator.roundInput(keyboard);
                        res = round(x);
                        break;
                    case 9:
                        x = Calculator.logInput(keyboard);
                        res = log(x);
                        break;
                    case 10:
                        x = Calculator.expInput(keyboard);
                        res = exponential(x);
                        break;
                    default:
                        throw new InvalidInputException("Invalid choice. Please enter a valid operation.");//System.out.println("Invalid choice");
                }
                break;
            default:
                throw new InvalidInputException("Invalid choice. Please enter a valid operation.");
        }
        // //System.out.println(res);
        return res;
    }
    public int add(int num, int res)
    {
        res+=num;
        return res;
    }
    public int subtract(int num, int res)
    {
        res-=num;
        return res;
    }
    public int multiply(int num, int res)
    {
        res*=num;
        return res;
    }
    public int divide(int num, int res)
    {
        res/=num;
        return res;
    }
    public int modulus(int num, int res)
    {
        res%=num;
        return res;
    }
    public double squareroot(double num)
    {
        double result=Math.sqrt(num);
        return result;
    }
    public double root_to_x(double x, double y)
    {
        double result=Math.pow(x,(1.0/y));
        return result;
    }
    public double square(double num)
    {
        double result=Math.pow(num,2);
        return result;
    }
    public double cube(double num)
    {
        double result=Math.pow(num,3);
        return result;
    }
    public double raise_to_x(double x, double y)
    {
        double result=Math.pow(x,y);
        return result;
    }
    public double absolute(double num)
    {
        double result=Math.abs(num);
        return result;
    }
    public double log(double num)
    {
        double result=Math.log(num);
        return result;
    }
    public double exponential(double num)
    {
        double result=Math.exp(num);
        return result;
    }
    public double round(double num)
    {
        double result=Math.rint(num);
        return result;
    }
    public double cosine(double num)
    {
        double result=Math.cos(num*(Math.PI/180));
        return result;
    }
    public double sine(double num)
    {
        double result=Math.sin(num*(Math.PI/180));
        return result;
    }
    public double tangent(double num)
    {
        double result=Math.tan(num*(Math.PI/180));
        return result;
    }
    public double cotangent(double num)
    {
        double result=1.0/(Math.tan(num*(Math.PI/180)));
        return result;
    }
    public double secant(double num)
    {
        double result=1.0/(Math.cos(num*(Math.PI/180)));
        return result;
    }
    public double cosecant(double num)
    {
        double result=1.0/(Math.sin(num*(Math.PI/180)));
        return result;
    }
    public double acosine(double num)
    {
        double result=Math.acos(num)*180/Math.PI;
        return result;
    }
    public double asine(double num)
    {
        double result=Math.asin(num)*180/Math.PI;
        return result;
    }
    public double atangent(double num)
    {
        double result=180*Math.atan(num)/Math.PI;
        return result;
    }
}