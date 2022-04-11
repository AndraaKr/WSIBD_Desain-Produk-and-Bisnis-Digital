package BKPM2;
public class Persons {
        String name;
    int age;
    
    public Persons (String name, int age){
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
}