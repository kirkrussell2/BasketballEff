public class Jack implements Weighting
{
     static double pt2made = 8;
     static double pt2miss = 32;
     static double pt3made = 5;
     static double pt3miss = 19;
     static double ftmade = 7;
     static double ftmiss = 10;
     static double rebounds = 28;
     static double assist = 9;
     static double steal = 8; 
     static double block = 9;
     static double turnover = 22;
     static double charge = 0;
     static double fouls = 9;
     static double pt = 49;
     static double plmin = 1; 
     public static double Jackdefensive()
    {
            double ftper = (ftmade/ftmiss); 
            double made = (pt3made + pt2made);
            double miss = (pt3miss + pt2miss); 
            double fgper = (made/miss); 
            double as = (assist); 
            double reb = (rebounds);
            double bl = (block);
            double st = (steal);
            double defensive1 = (((pt)+(reb*2)+(2*as)+(((st+bl)*2)+(1.5*charge))));
            double defensive2 = (((2*miss)+(2*fouls)+(2*turnover)));
            if(defensive1 < 75)
            {
                return 0;
            }
            double defensive = defensive1/defensive2;
            return defensive;
    }
    public static double Jackoffensive()
    {
            double ftper = (ftmade/ftmiss); 
            double made = (pt3made + pt2made);
            double miss = (pt3miss + pt2miss); 
            double fgper = (made/miss); 
            double as = (assist); 
            double reb = (rebounds);
            double bl = (block);
            double st = (steal);
            double offensive1 = (((pt*2)+reb+(2*as)+(st+bl+(1.5*charge))));
            double offensive2 = (((2*miss)+(2*fouls)+(2*turnover)));
           if(offensive1 < 75)
            {
                return 0;
            }
            double offensive = offensive1/offensive2;
            return offensive; 
    }
    public static double Jackbalanced()
    {
            double ftper = (ftmade/ftmiss); 
            double made = (pt3made + pt2made);
            double miss = (pt3miss + pt2miss); 
            double fgper = (made/miss); 
            double as = (assist); 
            double reb = (rebounds);
            double bl = (block);
            double st = (steal);
            double balanaced1 = ((pt+reb+(2*as)+(st+bl+(1.5*charge))));
            double balanced2 = (((2*miss)+(2*fouls)+(2*turnover)));
            if(balanaced1 < 100)
            {
                return 0;
            }
             double balanced = balanaced1/balanced2;       
            return balanced;
    }
}
