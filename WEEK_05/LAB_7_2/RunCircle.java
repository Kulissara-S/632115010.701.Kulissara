package WEEK_05.LAB_7_2;
/* Kulissara Srikaew  632115010 */
public class RunCircle {
    public static void main(String[] args) {
        Circle circle01 = new Circle( 2.0 , 0.0 , 0.0 );
        System.out.println( "Area of circle 1 : " + circle01.getArea() );
        System.out.println( "Circumference of circle 1 : " + circle01.getCircumference() );
        Circle circle02 = new Circle( 3.0 , 1.0 , 2.0 );
        System.out.println( "Area of circle 1 : " + circle02.getArea() );
        System.out.println( "Circumference of circle 1 : " + circle02.getCircumference() );
        Circle circle03 = new Circle( 1.0 , 3.0 , 5.0 );
        System.out.println( "Area of circle 1 : " + circle03.getArea() );
        System.out.println( "Circumference of circle 1 : " + circle03.getCircumference() );
        Circle circle04 = new Circle( -1.0 , -1.0 , -10.0 );
        System.out.println( "Area of circle 1 : " + circle04.getArea() );
        System.out.println( "Circumference of circle 1 : " + circle04.getCircumference() );
        //getIntersect
        System.out.println( "Is circle 1 intersect circle 2 : " + Circle.getIntersect( circle01 , circle02 ) );
        System.out.println( "Is circle 1 intersect circle 3 : " + Circle.getIntersect( circle01 , circle03 ) );
    }
}
