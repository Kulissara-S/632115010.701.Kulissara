package WEEK_06.LAB_8_1;
import WEEK_06.LAB_8_1.Person.Artist;
import WEEK_06.LAB_8_1.Person.Doctor;
import WEEK_06.LAB_8_1.Person.Engineer;
import WEEK_06.LAB_8_1.Person.Florist;
import WEEK_06.LAB_8_1.Person.Nurse;
import WEEK_06.LAB_8_1.Person.Police;
/* Kulissara Srikaew  632115010 */
public class InheritanceEXample {
    public static void main(String[] args) {
        Artist art = new Artist("Ball", 20, "Male");
        art.genre = "Hip Hop" ;
        art.introduce();
        art.playMusic();
        System.out.println("Name : " + art.age);

        Engineer en = new Engineer( "A" , 25 , "Male" );
        en.gender = "washing machine" ;
        en.introduce();
        en.repair();
        
        Doctor doc = new Doctor( "B", 30 , "Male" );
        doc.gender = "young" ;
        doc.introduce();
        doc.treatPatients();

        Nurse nu = new Nurse( "C", 30 , "Male" );
        nu.gender = "bed-stuck" ;
        nu.introduce();
        nu.takeCareOf();

        Police po = new Police( "D" , 35 , "Male" );
        po.gender = "culprit" ;
        po.introduce();
        po.catchTheCulprit();

        Florist flo = new Florist( "E" , 35 , "Male" );
        flo.gender = "roses" ;
        flo.introduce();
        flo.flowerArranging();
    }
}
