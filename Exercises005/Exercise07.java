import java.util.Scanner;
public class Exercise07{
    public static void main(String[] args){
        int numN;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input N: ");
        numN = sc.nextInt();
        System.out.println();
        System.out.println("N\t"+"10*N\t"+"100*N\t"+"1000*N\t");
        //System.out.printf("%s%12s%10s%10s\n","N","10*N","100*N","1000*N");
        System.out.println();
        for (int i = 1; i <= numN; i++){
            System.out.println(i+"\t"+(10*i)+"\t"+(100*i)+"\t"+(1000*i)+"\t");
            //System.out.printf("%d%10d%10d%10d\n",i,10*i,100*i,1000*i);
        }
    }
}