package WEEK_07.LAB_8_2;
/* Kulissara Srikaew  632115010 */
public class Fish {
    String name ;
    String species ;
    String color ;
    int age ;
    String water ;
    int speed ;
    public Fish() {
        
    }
    public Fish( String name , String species , String color , int age , String water , int speed) {
        this.name = name ;
        this.species = species ;
        this.color = color ;
        this.age = age ;
        this.water = water ;
        this.speed = speed ;
    }
    public void data() {
        System.out.println("Name : " + name);
        System.out.println("Species : " + species);
        System.out.println("Color : " + color);
        System.out.println("Age : " + age + " month.");
    }
    public void size() {
        if ( age <= 2 ) {
            System.out.println("Small size");
        } else {
            System.out.println("Big size");
        }
    }
    public void swimFast() {
        if ( speed >= 5 ) {
            System.out.println("Swim Fast");
        } else {
            System.out.println("Swim normal");
        }
    }
    public boolean isSwimToTheSea( String water ) {
        System.out.print("Swim To The Sea? : ");
        if ( water == "Salt" ) {
            System.out.println("True");
            return true ;
        } else {
            System.out.println("True");
            return false ;
        }
    }
}
