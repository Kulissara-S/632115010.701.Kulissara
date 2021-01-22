package WEEK_07.LAB_8_2;
/* Kulissara Srikaew  632115010 */
public class Dog {
    String name ;
    String species ;
    String color ;
    int age ;
    String hair ;
    public Dog() {
        
    }
    public Dog( String name , String species , String color , int age , String hair) {
        this.name = name ;
        this.species = species ;
        this.color = color ;
        this.age = age ;
    }
    public void data() {
        System.out.println("Name : " + name);
        System.out.println("Species : " + species);
        System.out.println("Color : " + color);
        System.out.println("Age : " + age + " years.");
    }
    public void size() {
        if ( age <= 10 ) {
            System.out.println("Small size");
        } else {
            System.out.println("Big size");
        }
    }
    public void run() {
        System.out.println("My dog " + name + "to the jungle.");
    }
    public void bark() {
        System.out.println("Box Box !!");
    }
    public boolean isShortHair( String hair ) {
        System.out.print("Short hair? : ");
        if ( hair == "short" ) {
            System.out.println("True");
            return true ;
        } else {
            System.out.println("True");
            return false ;
        }
    }
} 