
/**
 * Write a description of class Player3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SmallForward extends PowerForward
{
     static   double plmin = 34.4;
    static  double assist = 4.8;
    static    double turnover = 3.4;
    static  double rebounds = 6.6;
     static  double block = 2.1;
     static   double steal = 0.7;      
     static double pt3made = 2.4;
     static double pt3miss = 5.8;
     static double pt2made = 9.2;
     static double pt2miss = 17.3;
    public static double getall3()
    {
        double pt3 = (pt3made / pt3miss);
        double pt2 = (pt2made / pt2miss); 
        double as = (assist/100);
        double reb = (rebounds/100);
        double turn = ((turnover* -1)/100);
        double bl = (block/100);
        double st = (steal/100);
        double getall = ((((pt3 + pt2)/2) + as + reb + turn + bl + st)/plmin)*100;       
        return getall;
    }
        public double player4()
    {
        return getall4();
    }
        public double player5()
    {
        return getall5();
    }
}
