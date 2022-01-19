
/**
 * Write a description of class Player4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PowerForward extends Center
{
     static   double plmin = 31.7;
    static  double assist = 2.0;
    static    double turnover = 2.9;
    static  double rebounds = 7.3;
     static  double block = 1.3;
     static   double steal = 1.5;      
     static double pt3made = 1.2;
     static double pt3miss = 3.6;
     static double pt2made = 3.6;
     static double pt2miss = 7.7;
    public static double getall4()
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
    public double player5()
    {
        return getall5();
    }
}
