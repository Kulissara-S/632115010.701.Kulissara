package WEEK_07.LAB_8_3;
public class BicycleSpeed {
    private int speed;
    public BicycleSpeed() {
        
    }
    public BicycleSpeed(int speed) {
        this.speed = speed ;
    }
    public void speedUp() {
        if ( speed >= 99 ) {
            System.out.println("ERROR !!! Too much speed, cycling is not safe.");
        } else {
            speed = speed + 5 ;
            System.out.println( "The speed now is " + speed + " km/h." );
        }
    }
    public void speedDown() {
        if ( speed >= 99 ) {
            System.out.println("ERROR !!! Too much speed, cycling is not safe.");
        } else if ( speed == 0 ) {
            System.out.println("End of cycling");
        } else {
            speed = speed - 5 ;
            System.out.println( "The speed now is " + speed + " km/h." );
        }
    }
    public void gSpeed(int gear) {
        if ( speed >= 99 ) {
            System.out.println("ERROR !!! Too much speed, cycling is not safe.");
        } else {
            switch (gear) {
                case 1:
                    speed = speed + ( 5 * 1 ) ;
                    System.out.println( "The speed now is " + speed + " km/h." );
                    break;
                case 2:
                    speed = speed + ( 5 * 2 ) ;
                    System.out.println( "The speed now is " + speed + " km/h." );
                    break;
                case 3:
                    speed = speed + ( 5 * 3 ) ;
                    System.out.println( "The speed now is " + speed + " km/h." );
                    break;
                case 4:
                    speed = speed + ( 5 * 4 ) ;
                    System.out.println( "The speed now is " + speed + " km/h." );
                    break;
                default:
                    break;
            }
        }
    }
}
