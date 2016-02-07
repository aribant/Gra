class Bperson {
    String name;
    int age;
    
    void speak() {
        System.out.println("My name is: " + name);
    }
    
    int calculateYearsToRetirement() {
        int yearsLeft = 65 - age;
        
        return yearsLeft;
    }
    
    int getAge() {
        return age;
    }
    
    String getName() {
        return name;
    }
}


public class Lecture_19_Getters_and_Return_Values {

    public static void main(String[] args) {
        Bperson person1 = new Bperson();
        
        person1.name = "Joe";
        person1.age = 25;
        
        // person1.speak();
        
        int years = person1.calculateYearsToRetirement();
        
        System.out.println("Years till retirements " + years);
        
        int age = person1.getAge();
        String name = person1.getName();
        
        System.out.println("Name is: " + name);
        System.out.println("Age is: " + age);
    }

}
