package BKPM2;
    class persons{
    String fName = "Lisa Palombo";
    String IName = "Lisa";
    String stuId = "123456789";
    String stuStatus = "Active";
    
    void set (){
        System.out.println("Student Name : " +fName);
        System.out.println("Student Nick Name : " +IName);
        System.out.println("Student ID : " +stuId);
        System.out.println("Status status : " +stuStatus);
    }
}
public class Person {
    public static void main(String[] args){
        persons aku = new persons();
        aku.set();
    }
}