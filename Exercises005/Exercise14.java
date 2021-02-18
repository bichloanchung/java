public class Exercise14{
    public static void main(String[] args){
        // sum of the values (divisible by 7) between 0 -50
        int sum = 0;
        for (int i = 0; i <= 50; i++){
            if (i % 7 == 0){
                sum +=i;
            }
        }
        System.out.println("The sum of the values that are divisible by 7: "+sum);
    }
}