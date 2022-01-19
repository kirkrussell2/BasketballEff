package Legends;

public class LBird_Test
{
     static double pt2made = 8591;
     static double pt2miss = 17334;
     static double pt3made = 649;
     static double pt3miss = 1727;
     static double ftmade = 3960;
     static double ftmiss = 4471;
     static double rebounds = 8974;
     static double assist = 5695;
     static double steal = 1556; 
     static double block = 755;
     static double turnover = 2816;
     static double charge = 0;
     static double fouls = 2279;
     static double pt = 21791;
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
        System.out.println("Larry Bird's stats");
        System.out.println("Offensive = "+Kirkdefensive());
        System.out.println("Defensive = "+Kirkoffensive());
        System.out.println("Balanced = "+Kirkbalanced());
    }
}
