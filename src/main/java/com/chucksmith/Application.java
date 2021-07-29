package com.chucksmith;

public class Application {

    public static void main(String[] args) {
        int[] numbers = new int[]{1, 3, 0, 7, 9};

        System.out.println(numbers[2]);
        try {
            // if you change to numbers[2] you get a 'bad math' error
            // if you change to numbers[8] you get a 'out of bounds' error
            int num = numbers[8];
            int result = 4 / num;
            //System.out.println(numbers[7]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("out of bounds");
        } catch (ArithmeticException e){
            System.out.println("bad math");
        }
        catch (Exception e){
            int foo = 4 / 0;
            System.out.println("something went wrong");
        } finally {
            System.out.println("finally");
        }

        System.out.println("Done");
    }

}
