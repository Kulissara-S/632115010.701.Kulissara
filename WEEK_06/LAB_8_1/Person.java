package WEEK_06.LAB_8_1;
/* Kulissara Srikaew  632115010 */
public class Person {
    String name ;
    int age ;
    String gender ;
    String genre ;
    public Person() {
        
    }
    public Person( String name , int age , String gender) {
        this.name = name ;
        this.age = age ;
        this.gender = gender ;
    }
    public void introduce() {
        System.out.println( "My name is " + name );
        System.out.println( "Age : " + age );
        System.out.println( "Gender : " + gender );
    }
    public class Artist extends Person {
        public Artist( String name , int age , String genre ) {
            this.age = age ;
            this.name = name ;
            this.genre = genre ;
        }
        public void playMusic() {
            System.out.println( name + " is playing " + genre + " music." );
        }
    }
    public class Engineer extends Person {
        public Engineer( String name , int age , String genre ) {
            this.age = age ;
            this.name = name ;
            this.genre = genre ;
        }
        public void repair() {
            System.out.println( name + " is Repairing the " + genre + " ." );
        }
    }
    public class Doctor extends Person {
        public Doctor( String name , int age , String genre ) {
            this.age = age ;
            this.name = name ;
            this.genre = genre ;
        }
        public void treatPatients() {
            System.out.println( name + " is treating " + genre + " patients." );
        }
    }
    public class Nurse extends Person {
        public Nurse( String name , int age , String genre ) {
            this.age = age ;
            this.name = name ;
            this.genre = genre ;
        }
        public void takeCareOf() {
            System.out.println( name + " is takeing care of " + genre + " patients." );
        }
    }
    public class Police extends Person {
        public Police( String name , int age , String genre ) {
            this.age = age ;
            this.name = name ;
            this.genre = genre ;
        }
        public void catchTheCulprit() {
            System.out.println( name + " is Catching the " + genre + " ." );
        }
    }
    public class Florist extends Person {
        public Florist( String name , int age , String genre ) {
            this.age = age ;
            this.name = name ;
            this.genre = genre ;
        }public void flowerArranging() {
            System.out.println( name + " is arranging " + genre + " in a vase." );
        }
    }

}
