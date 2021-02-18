public class Exercise08{
    public static void main(String[] args){
        /* 
        //print with for loop statement
        for (int i = 0; i <= 20; i++){
            if (i % 2 == 0){
                System.out.println(i + " is the even");
            }
            else
                System.out.println(i + " is the odd");
        }
        */
        /*
        // print with while loop statement
        int i = 0;
        while (i <= 20){
            if (i % 2 == 0){
                System.out.println(i + " is the even");
            }
            else
                System.out.println(i + " is the odd");
            i++;
        }
        */
        // print with do-while loop statement
        int i = 0;
        do{
            if (i % 2 == 0){
                System.out.println(i + " is the even");
            }
            else
                System.out.println(i + " is the odd");
            i++;
        } while (i <= 20);
    }
}