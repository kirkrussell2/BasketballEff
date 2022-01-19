package Legends;

public class MichaelJ_Test
{
     static double pt2made = 12192;
     static double pt2miss = 24537;
     static double pt3made = 581;
     static double pt3miss = 1778;
     static double ftmade = 7327;
     static double ftmiss = 8772;
     static double rebounds = 6672;
     static double assist = 5633;
     static double steal = 2514; 
     static double block = 893;
     static double turnover = 2924;
     static double charge = 0;
     static double fouls = 2783;
     static double pt = 32292;
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
        System.out.println("Michael Jordan's stats");
        System.out.println("Offensive = "+Kirkdefensive());
        System.out.println("Defensive = "+Kirkoffensive());
        System.out.println("Balanced = "+Kirkbalanced());
    }
}
