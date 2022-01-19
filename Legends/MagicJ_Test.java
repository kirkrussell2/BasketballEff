package Legends;

public class MagicJ_Test
{
     static double pt2made = 6211;
     static double pt2miss = 11951;
     static double pt3made = 325;
     static double pt3miss = 1074;
     static double ftmade = 4960;
     static double ftmiss = 5850;
     static double rebounds = 6559;
     static double assist = 10141;
     static double steal = 1724; 
     static double block = 374;
     static double turnover = 3506;
     static double charge = 0;
     static double fouls = 2050;
     static double pt = 17707;
     static double plmin = 1; 
    public static double Kirkdefensive()
    {
            double ftper = (ftmade/ftmiss); 
            double made = (pt3made + pt2made);
            double miss = (pt3miss + pt2miss); 
            double fgper = (made/miss); 
            double as = (assist); 
            double reb = (rebounds);
            double bl = (block);
            double st = (steal);
            double defensive = (((pt)+(reb*2)+(2*as)+(((st+bl)*2)+(1.5*charge)))/((2*miss)+(2*fouls)+(2*turnover)));
            return defensive;
    }
    public static double Kirkoffensive()
    {
            double ftper = (ftmade/ftmiss); 
            double made = (pt3made + pt2made);
            double miss = (pt3miss + pt2miss); 
            double fgper = (made/miss); 
            double as = (assist); 
            double reb = (rebounds);
            double bl = (block);
            double st = (steal);
            double offensive = (((pt*2)+reb+(2*as)+(st+bl+(1.5*charge)))/((2*miss)+(2*fouls)+(2*turnover)));
            return offensive;
    }
    public static double Kirkbalanced()
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
    public static void main(String[] args)
    {
        System.out.println("Magic Johnson's stats");
        System.out.println("Offensive = "+Kirkdefensive());
        System.out.println("Defensive = "+Kirkoffensive());
        System.out.println("Balanced = "+Kirkbalanced());
    }
}
