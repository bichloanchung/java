public class Exercise19{
    public static void main(String[] args){
        int[] intValue = {2, 100, 99, 1, 12, 101, 20, 80, 10, 200};
        int minValue = intValue[0];
        int i = 0;
        do{
            if (minValue > intValue[i]){
                minValue = intValue[i];
            }
            i++;
        }while (i < intValue.length);
        System.out.println("The smallest value is: "+minValue);
    }
}