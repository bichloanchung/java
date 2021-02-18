public class Exercise06{
    public static void main(String[] args){
        /*Create a java program that prints values 1-20
        **using the for loop/ while loop/ do-while loop statement*/
        /*for (int i = 0; i < 20; i++){
            System.out.println(i+1);
        }
        */
        /*int i = 0;
        while (i < 20){
            System.out.println(i+1);
            i++;
        }
        */
        int i = 0;
        do {
            System.out.println(i+1);
            i++;
        }while (i < 20);
    }
}