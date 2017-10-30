//This program accepts 3 numbers and returns the smallest value
public class SmallestNumber {

    public static void main(String[] args) {
        System.out.println("The smallest value : " + smallestValue(15,7,36));
    }

    public static int smallestValue(int a, int b, int c){
        return Math.min(Math.min(a, b), c);
    }
}
