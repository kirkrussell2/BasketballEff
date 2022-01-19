
/**
 * Write a description of class Player2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ShootingGuard extends SmallForward
{
         static   double plmin = 33.1;
    static  double assist = 2.6;
    static    double turnover = 1.5;
    static  double rebounds = 4.3;
     static  double block = 0.8;
     static   double steal = 0.7;      
     static double pt3made = 3.5;
     static double pt3miss = 7.7;
     static double pt2made = 8.0;
     static double pt2miss = 16.1;
    public static double getall2()
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
    public double player3()
    {
        return getall3();
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
