public class New1 //implements Weighting
{
     static double pt3made = 0;
     static double pt3miss = 0;
     static double pt2made = 0;
     static double pt2miss = 0;
     static double ftmade = 0;
     static double ftmiss = 0;
     static double rebounds = 0;
     static double assist = 0;
     static double steal = 0; 
     static double block = 0;
     static double turnover = 0;
     static double charge = 0;
     static double fouls = 0;
     static double pt = 0;
     static double plmin = 0;
     public static double Rigeldefensive()
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
    public static double Rigeloffensive()
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
    public static double Rigelbalanced()
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
