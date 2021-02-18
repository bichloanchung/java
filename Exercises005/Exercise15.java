public class Exercise15{
    public static void main(String[] args){
        //print the sum of the squares of the values that are odd
        int i = 0;
        int sum = 0;
        do {
            if (i % 2 != 0){
                sum += i*i;
            }
            i++;
        }while (i <= 10);
        System.out.println("The sum of the square of the values that are odd: "+sum);
    }
}