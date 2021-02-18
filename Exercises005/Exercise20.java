public class Exercise20{
    public static void main(String[] args){
        int[] intValue = {1, 20, 300, 60, 8, 9, 12, -2, -90, 10};
        System.out.println("The numbers are grater or equal to 10 are: ");
        for (int i = 0; i < intValue.length; i++){
            if (intValue[i] >= 10){
                System.out.print(" "+intValue[i]+", ");
            }
        }
        System.out.println();
    }
}