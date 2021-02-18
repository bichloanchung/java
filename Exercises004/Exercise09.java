import java.util.Scanner;
public class Exercise09{
    public static void main(String[] args){
        // The relation between Celsius and Fahrenheit
        double tempC;
        Scanner sc = new Scanner(System.in);
        System.out.print("Temperature is: ");
        tempC = sc.nextDouble();
        double tempF = tempC * 1.8 + 32;
        //double tempf = Math.round(((tempc * 1.8 + 32) * 100.0) / 100.0);
        System.out.println(tempC+" C"+" = "+tempF+" F");

    }
}