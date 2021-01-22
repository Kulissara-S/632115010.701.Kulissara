package WEEK_07.LAB_8_2;
/* Kulissara Srikaew  632115010 */
public class Mypet {
   public static void main(String[] args) {
       Dog dog = new Dog("Poppy", "Pooddle", "Brown", 10, "short");
       dog.data();
       dog.size();
       dog.run();
       dog.bark();
       dog.isShortHair("short");
       
       Fish f = new Fish("Booby", "Nemo", "Orange , White , Black", 10 , "Salt", 6);
       f.data();
       f.size();
       f.swimFast();
       f.isSwimToTheSea("Salt");

       Bird b = new Bird("Birddy", "Parrot" , "Black , Gray", 12 , "Italy", "Fly");
       b.data();
       b.Speak();
       b.country();
       b.isCanFly("Fly");
   } 
}
