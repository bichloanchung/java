public class Exercise02{
    public static void main(String[] args){
        String str1 = "myName";
        String str2 = "Myname";
        System.out.println("String 1 (lower): "+str1.toLowerCase());
        System.out.println("String 2 (upper): "+str2.toUpperCase());
        System.out.println("-------------------");
        System.out.println("String 1 equals w String 2? "+str1.equals(str2));
        System.out.println("String 1 equalsIgnoreCase w String 2? "+str1.equalsIgnoreCase(str2));
        System.out.println("-------------------");
        String str3 = "Rafael";
        System.out.println("String 3 is: "+str3);
        if(str3.endsWith("fael")){
            System.out.println("String 3 ends with 'fael'");
        }else System.out.println("String 3 not end with 'fael'");
        if(str3.startsWith("Rafa")){
            System.out.println("String 3 starts with 'Rafa'");
        }else System.out.println("String 3 starts with "+str3.substring(0,2));
    }
}