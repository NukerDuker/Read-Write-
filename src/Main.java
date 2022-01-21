import java.util.Scanner;

public class Main {
    int length;
    int[] first;
    int[] second;
    int max;
    int min;
    int range;

    Main(){
        max = 10;
        min = 1;
        range = max - min + 1;
        length = (int) (Math.random() * range) + min;
        first = new int[length];
        second = new int[length];
    }

    public static void main(String[] args) throws LessOneException{
       Main test = new Main();
       test.fillArr(test.first);
       test.fillArr(test.second);
       System.out.println("length = " + test.length);
       System.out.println("test = " + test.first[1]);
       test.runArr();
    }

    public void fillArr(int[] arr) {
        int max = 100;
        int min = 1;
        int range = max - min + 1;
        for (int i = 0; i < arr.length; i++){
            arr[i] = (int) (Math.random() * range) + min;
            System.out.println(arr[i]);
        }
    }

    public void runArr() throws LessOneException{
        int result = 0;
        for(int i = 0; i < this.first.length; i++){
            try {
                result = divide(this.first[i], this.second[i]);
            } catch (ArithmeticException e) {
                System.out.println(this.second[i]);
                System.out.println("I = " + i);
            }
            if (result < 1) {
                throw new LessOneException("Less then one! " + result);
            }
        }
    }

    public int divide(int x, int y){
        return x / y;
    }
}
