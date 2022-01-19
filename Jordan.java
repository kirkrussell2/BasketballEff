public class Jordan implements Weighting
{
     static double pt2made = 28;
     static double pt2miss = 66;
     static double pt3made = 36;
     static double pt3miss = 118;
     static double ftmade = 18;
     static double ftmiss = 27;
     static double rebounds = 52;
     static double assist = 53;
     static double steal = 31; 
     static double block = 2;
     static double turnover = 43;
     static double charge = 2;
     static double fouls = 11;
     static double pt = 236;
     static double plmin = 1; 
         public static double Jordandefensive()
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
    public static double Jordanoffensive()
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
    public static double Jordanbalanced()
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
