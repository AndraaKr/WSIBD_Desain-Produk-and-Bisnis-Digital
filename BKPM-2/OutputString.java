package BKPM2;
public class OutputString {
    public static void main(String[] args){
        String s1 = "ABC";
        String s2 = new String ("DEF");
        String s3 = "AB" + "C";
        
        s1.compareTo(s2);
        System.out.println("s1.compareTo(s2) = " +s1.compareTo(s2));
        System.out.println("");
        
        s2.equals(s3);
        System.out.println("s2.equals(s3) = " +s2.equals(s3));
        System.out.println("");
        
        boolean name = s3 == s1;
        System.out.println("s3 == s1 =" +s3==s1);
        System.out.println("");
        
        s2.compareTo(s3);
        System.out.println("s2,compareTo(s3) = " +s2.compareTo(s3));
        System.out.println("");
        
        s3.equals(s1);
        System.out.println("s3.equals(s1) = " +s3.equals(s1));
    }
}