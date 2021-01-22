package WEEK_05.LAB_7_2;
/* Kulissara Srikaew  632115010 */
public class Circle {
    private double r = 1 ;
    private double i = 0.0 ;
    private double j = 0.0 ;
    public Circle() {
        
    }
    public Circle( double newR , double i , double j ) {
        r = newR ;
        this.i = i ;
        this.j = j ;
    }
    public static boolean getIntersect( Circle c1 , Circle c2) {
        double dSQ = 0 ;
        dSQ = ( c1.i - c2.i ) * ( c1.i - c2.i ) + ( c1.j - c2.j ) * ( c1.j - c2.j );
        double radSumSQ = 0 ;
        radSumSQ = ( c1.r + c2.r ) * ( c1.r + c2.r );
        if ( dSQ > radSumSQ ) {
            return false ;
        } else {
            return true ;
        }
    }
    public double getArea() {
        if ( r < 0 ) {
            return 0.0 ;
        } else {
            return r * r * Math.PI;
        }
    }
    public double getCircumference() {
        if ( r < 0 ) {
            return 0.0 ;
        } else {
            return 2.0 * r * Math.PI ;
        }
    }
}
