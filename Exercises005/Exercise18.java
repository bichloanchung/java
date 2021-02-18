public class Exercise18{
    public static void main(String[] args){
        int[] intValue = {100, 8, 28, 999, 22, 9, 191, 16, 60, 80};
        int maxValue = intValue[0];
        int i = 0;
        while (i < intValue.length){
            if (maxValue < intValue[i]){
                maxValue = intValue[i];
            }
            i++;
        }
        System.out.println("The greatest value is : "+maxValue);
    }
}