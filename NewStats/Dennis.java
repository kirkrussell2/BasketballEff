package NewStats;
public class Dennis 
{
     static  double assist = 0;
     static    double turnover = 3;
     static  double rebounds = 13;
     static  double block = 2;
     static   double steal = 2;      
     static double pt3made = 0;
     static double pt3miss = 1;
     static double pt2made = 8;
     static double pt2miss = 11;
     static double ftmade = 5;
     static double ftmiss = 5;
     static double pt = 21;
     static double fouls = 4;
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