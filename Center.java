
/**
 * Write a description of class Player5 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Center
{
    static   double plmin = 26.0;
    static  double assist = 2.9;
    static    double turnover = 0.7;
    static  double rebounds = 3.5;
     static  double block = 0.6;
     static   double steal = 0.6;      
     static double pt3made = 0.6;
     static double pt3miss = 1.9;
     static double pt2made = 2.4;
     static double pt2miss = 4.9;
    public static double getall5()
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
}
