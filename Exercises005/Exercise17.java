public class Exercise17{
    public static void main(String[] args){
        double[] grade = {8.5, 6, 9.9};
        double sum = 0.0;
        double avgG = 0.0;
        for (int i = 0; i < grade.length; i++){
            System.out.println("The grade of subject "+(i+1)+" is : "+grade[i]);
            sum += grade[i];
        }
        avgG = sum / grade.length;
        System.out.println("----------");
        System.out.println("The average of the grades: "+avgG);
        if (avgG >= 6){
            System.out.println("A student cleared a course!");
        }else
            System.out.println("A student not cleared a course!");
    }
}