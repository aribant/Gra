
class Person {
    
    // Instance variables (data or "state")
    String name;
    int age;
    
    
    // Classes can contain
    
    // 1. Data
    // 2. Subroutines (methods)
}


public class Lecture_17_Classes_and_Objects {

    public static void main(String[] args) {
        
        
        // Create a Person object using the Person class
        Aperson person1 = new Aperson();    
        person1.name = "Joe Bloggs";
        person1.age = 37;
        
        // Create a second Person object
        Aperson person2 = new Aperson();
        person2.name = "Sarah Smith";
        person2.age = 20;
        
        System.out.println(person1.name);
        
    }

}
