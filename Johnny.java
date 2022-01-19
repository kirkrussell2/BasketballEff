public class Johnny implements Weighting
{
     static double pt2made = 5;
     static double pt2miss = 14;
     static double pt3made = 6;
     static double pt3miss = 24;
     static double ftmade = 0;
     static double ftmiss = 1;
     static double rebounds = 13;
     static double assist = 6;
     static double steal = 2; 
     static double block = 0;
     static double turnover = 15;
     static double charge = 0;
     static double fouls = 4;
     static double pt = 33;
     static double plmin = 1; 
     public static double Johnnydefensive()
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
    public static double Johnnyoffensive()
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
    public static double Johnnybalanced()
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
