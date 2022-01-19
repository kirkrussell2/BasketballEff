import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public interface Weighting 
{
     public static void main(String[] args)
      {      
        double pointguard = 0;
        double shootingguard = 0;
        double smallforward =0;
        double powerforward = 0;
        double center = 0;
        double[] end = {pointguard,shootingguard,smallforward,powerforward, center};
        
        Scanner input = new Scanner(System.in);
        System.out.println("What kind of line up would you like Defensive = 1, Offensive = 2, Balanced = 3");
        int lineup = input.nextInt();  
        if(lineup == 1)
        {
        Kirk kk;
        kk=new Kirk();
        String k = kk.Kirkdefensive() + " Kirk";
       
        Jordan jj;
        jj=new Jordan();
        String j = jj.Jordandefensive() + " Jordan";
        
        Max mm;
        mm=new Max();
        String m = mm.Maxdefensive() + " Max";
        
        Dennis dd;
        dd=new Dennis();
        String d = dd.Dennisdefensive() + " Dennis";
        
        Will ww;
        ww=new Will();
        String w = ww.Willdefensive() + " Will";
        
        Jack ja;
        ja=new Jack();
        String jack = ja.Jackdefensive() + " Jack";
        
        Johnny jo;
        jo=new Johnny();
        String john = jo.Johnnydefensive() + " Johnny";
        
        Isiah ii;
        ii=new Isiah();
        String i = ii.Isiahdefensive() + " Isiah";
        
        Costick cc;
        cc=new Costick();
        String c = cc.Costickdefensive() + " Costick";
        
       /** Rigel rr;
        rr=new Rigel();
        String r = rr.Rigeldefensive() + " Rigel"; */
        
        Evan ee;
        ee=new Evan();
        String e = ee.Evandefensive() + " Evan";
        
        Meatball ave;
        ave=new Meatball();
        String av = ave.Meatballdefensive() + " Avery";
        
        Alfonso al;
        al=new Alfonso();
        String alf = al.Alfansodefensive() + " D'Alfonso";
        
        Aidan ai;
        ai=new Aidan();
        String aid = ai.Aidandefensive() + " Aidan";
        
        Gabe g;
        g=new Gabe();
        String ga = g.Gabedefensive() + " Gabe";
        
      List<String> myList = new ArrayList<String>();
      myList.add(k);
      myList.add(j);
      myList.add(m);
      myList.add(d);
      myList.add(w);
      myList.add(jack);
      myList.add(john);
     // myList.add(r);
      myList.add(e);
      myList.add(c);
      myList.add(i);
      myList.add(av);
      myList.add(alf);
      myList.add(aid);
      myList.add(ga);
      
      Collections.sort(myList);
      Collections.reverse(myList);
      for (int x=0; x<13; x++)
      {
        System.out.println(myList.get(x));
      }
    }
    if(lineup == 2)
    {
        Kirk kk;
        kk=new Kirk();
        String k = kk.Kirkoffensive() + " Kirk";
       
        Jordan jj;
        jj=new Jordan();
        String j = jj.Jordanoffensive() + " Jordan";
        
        Max mm;
        mm=new Max();
        String m = mm.Maxoffensive() + " Max";
        
        Dennis dd;
        dd=new Dennis();
        String d = dd.Dennisoffensive() + " Dennis";
        
        Will ww;
        ww=new Will();
        String w = ww.Willoffensive() + " Will";
        
        Jack ja;
        ja=new Jack();
        String jack = ja.Jackoffensive() + " Jack";
        
        Johnny jo;
        jo=new Johnny();
        String john = jo.Johnnyoffensive() + " Johnny";
        
        Isiah ii;
        ii=new Isiah();
        String i = ii.Isiahoffensive() + " Isiah";
        
        Costick cc;
        cc=new Costick();
        String c = cc.Costickoffensive() + " Costick";
        
       /** Rigel rr;
        rr=new Rigel();
        String r = rr.Rigeloffensive() + " Rigel"; */
        
        Evan ee;
        ee=new Evan();
        String e = ee.Evanoffensive() + " Evan";
        
        Meatball ave;
        ave=new Meatball();
        String av = ave.Meatballoffensive() + " Avery";
        
        Alfonso al;
        al=new Alfonso();
        String alf = al.Alfonsooffensive() + " D'Alfonso";
        
        Aidan ai;
        ai=new Aidan();
        String aid = ai.Aidanoffensive() + " Aidan";
        
        Gabe g;
        g=new Gabe();
        String ga = g.Gabeoffensive() + " Gabe";
        
      List<String> myList = new ArrayList<String>();
      myList.add(k);
      myList.add(j);
      myList.add(m);
      myList.add(d);
      myList.add(w);
      myList.add(jack);
      myList.add(john);
     // myList.add(r);
      myList.add(e);
      myList.add(c);
      myList.add(i);
      myList.add(av);
      myList.add(alf);
      myList.add(aid);
      myList.add(ga);
      
      Collections.sort(myList);
      Collections.reverse(myList);
      for (int x=0; x<13; x++)
      {
        System.out.println(myList.get(x));
      }
    }
    if(lineup == 3)
    {
        Kirk kk;
        kk=new Kirk();
        String k = kk.Kirkbalanced() + " Kirk";
       
        Jordan jj;
        jj=new Jordan();
        String j = jj.Jordanbalanced() + " Jordan";
        
        Max mm;
        mm=new Max();
        String m = mm.Maxbalanced() + " Max";
        
        Dennis dd;
        dd=new Dennis();
        String d = dd.Dennisbalanced() + " Dennis";
        
        Will ww;
        ww=new Will();
        String w = ww.Willbalanced() + " Will";
        
        Jack ja;
        ja=new Jack();
        String jack = ja.Jackbalanced() + " Jack";
        
        Johnny jo;
        jo=new Johnny();
        String john = jo.Johnnybalanced() + " Johnny";
        
        Isiah ii;
        ii=new Isiah();
        String i = ii.Isiahbalanced() + " Isiah";
        
        Costick cc;
        cc=new Costick();
        String c = cc.Costickbalanced() + " Costick";
        
       /** Rigel rr;
        rr=new Rigel();
        String r = rr.Rigelbalanced() + " Rigel"; */
        
        Evan ee;
        ee=new Evan();
        String e = ee.Evanbalanced() + " Evan";
        
        Meatball ave;
        ave=new Meatball();
        String av = ave.Meatballbalanced() + " Avery";
        
        Alfonso al;
        al=new Alfonso();
        String alf = al.Alfonsobalanced() + " D'Alfonso";
        
        Aidan ai;
        ai=new Aidan();
        String aid = ai.Aidanbalanced() + " Aidan";
        
        Gabe g;
        g=new Gabe();
        String ga = g.Gabebalanced() + " Gabe";
 
      List<String> myList = new ArrayList<String>();
      myList.add(k);
      myList.add(j);
      myList.add(m);
      myList.add(d);
      myList.add(w);
      myList.add(jack);
      myList.add(john);
     // myList.add(r);
      myList.add(e);
      myList.add(c);
      myList.add(i);
      myList.add(av);
      myList.add(alf);
      myList.add(aid);
      myList.add(ga);
      
      Collections.sort(myList);
      Collections.reverse(myList);
      for (int x=0; x<13; x++)
      {
        System.out.println(myList.get(x));
      }
      //System.out.println(myList.subList(0, 5));
    }
    }
}
