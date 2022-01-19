package NewStats;
public class Kirk
{
     static  double assist = 3;
     static    double turnover = 2;
     static  double rebounds = 5;
     static  double block = 1;
     static   double steal = 2;      
     static double pt3made = 1;
     static double pt3miss = 1;
     static double pt2made = 5;
     static double pt2miss = 10;
     static double ftmade = 2;
     static double ftmiss = 5;
     static double pt = 13;
     static double fouls = 2;
     static double charge = 0;
     public static double balanced()
    {
            double ftper = (ftmade/ftmiss); 
            double made = (pt3made + pt2made);
            double miss = (pt3miss + pt2miss); 
            double fgper = (made/miss); 
            double as = (assist); 
            double reb = (rebounds);
            double bl = (block);
            double st = (steal);
            double defensive = ((pt+reb+(2*as)+(st+bl+(1.5*charge)))/((2*miss)+(2*fouls)+(2*turnover)));
            return defensive;
    }
}