package WEEK_07.LAB_8_2;
/* Kulissara Srikaew  632115010 */
public class Bird {
    String name ;
    String species ;
    String color ;
    int age ;
    String country ;
    String fly ;
    public Bird() {
        
    }
    public Bird( String name , String species , String color , int age , String country , String fly) {
        this.name = name ;
        this.species = species ;
        this.color = color ;
        this.age = age ;
        this.country = country ;
        this.fly = fly ;
    }
    public void data() {
        System.out.println("Name : " + name);
        System.out.println("Species : " + species);
        System.out.println("Color : " + color);
        System.out.println("Age : " + age + " month.");
    }
    public void Speak() {
        if ( species == "Parrot") {
            System.out.println("Can speak");
        } else {
            System.out.println("Cann't speak");
        }
    }
    public void country() {
        if ( country == "THAI") {
            System.out.println("Local Bird");
        } else {
            System.out.println("Import Bird");
        }
    }
    public boolean isCanFly( String fly ) {
        System.out.print("Can Fly? : ");
        if ( fly == "Fly" ) {
            System.out.println("True");
            return true ;
        } else {
            System.out.println("True");
            return false ;
        }
    }
}
