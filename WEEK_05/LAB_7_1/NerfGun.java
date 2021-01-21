package WEEK_05.LAB_7_1;
public class NerfGun {
    private int bullet;
    private int displayGunID = 1;
    public NerfGun() {
        
    }
    public NerfGun(int bullet) {
        this.bullet = bullet ;
        displayGunID++;
    }
    public void displayNumOfAmmunition() {
        System.out.println( bullet + " bullet left.");
    }
    public void displayGunID() {
        System.out.println("The ID of this Gun is " + displayGunID + ".");
    }
    public void fire() {
        if ( bullet == 0 ) {
            System.out.println("There is no ammunition.");
        } else {
            bullet--;
            System.out.println("BANG !!!");
        }
    }
    public void reload(int i) {
        if ( bullet + i > 15 ) {
            System.out.println("Error ID of this Gun is " + displayGunID + ".");
        } else {
            bullet = bullet + i;
        }
    }
}
