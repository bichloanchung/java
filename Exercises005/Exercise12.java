public class Exercise12{
    public static void main(String[] args){
        //print the sum & average of first 20 natural numbers
        int i = 0;
        int sum = 0;
        double avgN = 0;
        while (i <= 20){
            sum += i;
            i++;
        }
        avgN = sum / i;
        System.out.println("The sum of first 20 natural numbers: "+sum);
        System.out.println("The average of first 20 natural numbers: "+avgN);
    }
}