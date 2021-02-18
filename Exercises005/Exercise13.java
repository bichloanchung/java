public class Exercise13{
    public static void main(String[] args){
        // print the sum of the even between 0-50
        int sum = 0;
        for (int i = 0; i<= 50; i++){
            if (i % 2 == 0){
                sum += i;
            }
        }
        System.out.println("The sum of values that are even: "+sum);
    }
}