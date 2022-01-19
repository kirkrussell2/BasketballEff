 import java.util.ArrayList;
public class PointGuard extends ShootingGuard
{
     static   double plmin = 32.6;
    static  double assist = 6.5;
    static    double turnover = 3.1;
    static  double rebounds = 5.2;
     static  double block = 0.2;
     static   double steal = 1.8;      
     static double pt3made = 3.5;
     static double pt3miss = 9.4;
     static double pt2made = 8.2;
     static double pt2miss = 17.7;
    public static double getall1()
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
    public double player2()
    {
        return getall2();
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
