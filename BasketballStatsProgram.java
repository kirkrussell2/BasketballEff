import java.util.Scanner;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.ScatterChart;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;
public class BasketballStatsProgram extends Application
{
    static double plmin;
    static double assist;
    static double turnover;
    static double rebounds;
    static double block;
    static double steal;
    static double pt3made;
    static double pt3miss;
    static double pt2made;
    static double pt2miss;
    @Override public void start(Stage stage) 
      {      
        double pointguard = 0;
        double shootingguard = 0;
        double smallforward =0;
        double powerforward = 0;
        double center = 0;
        double[] end = {pointguard,shootingguard,smallforward,powerforward, center};
        for (int count = 0; count < 5;count ++)
        {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the minutes played");
            plmin = input.nextDouble();
        
            System.out.println("Enter amount of rebounds");
            rebounds = input.nextDouble();
        
            System.out.println("Enter the number of 2 point shots made");
            pt2made = input.nextDouble();
        
            System.out.println("Enter the number of 2 point shots missed");
            pt2miss = input.nextDouble();
        
            System.out.println("Enter the number of 3 point shots made");
            pt3made = input.nextDouble();
        
            System.out.println("Enter the number of 3 point shots missed");
            pt3miss = input.nextDouble();
        
            System.out.println("Enter the assists");
            assist = input.nextDouble();
        
            System.out.println("Enter the amount of turnovers");
            turnover = input.nextDouble();
        
            System.out.println("Enter the amount of blocks");
            block = input.nextDouble();
        
            System.out.println("Enter the amount of steals");
            steal = input.nextDouble(); 
        
            double pt3 = (pt3made / pt3miss);
            double pt2 = (pt2made / pt2miss); 
            double as = (assist);
            double reb = (rebounds);
            double turn = (turnover* -1);
            double bl = (block);
            double st = (steal);
            double getall = (((((pt3 + pt2)/2)*100) + as + reb + turn + bl + st)/plmin);       
            end[count] = getall;
        
        double teamfinal = ((end[0]+end[1]+end[2]+end[3]+end[4])/5);
        System.out.println("Point Guard's efficiency = "+ end[0]);
        System.out.println("Shooting Guard's efficiency = " + end[1]);
        System.out.println("Small Forward's efficiency = "+ end[2]);
        System.out.println("Power Forward's efficiency = " +end[3]);
        System.out.println("Center's efficiency = "+ end[4]);
        System.out.println(" ");
        System.out.println("Overall team efficiency = "+ teamfinal); 
        
        stage.setTitle("Player Efficiency");
        final NumberAxis xAxis = new NumberAxis(0, 6.5, 1);
        final NumberAxis yAxis = new NumberAxis(0, 3,0.2);        
        final ScatterChart<Number,Number> sc = new
        ScatterChart<Number,Number>(xAxis,yAxis);
        xAxis.setLabel("Player");                
        yAxis.setLabel("Efficincy per Minute");
        sc.setTitle("Player effectivness");
       
        XYChart.Series series1 = new XYChart.Series();
        series1.setName("");
        series1.getData().add(new XYChart.Data(1, end[0]));
        series1.getData().add(new XYChart.Data(2, end[1]));
        series1.getData().add(new XYChart.Data(3, end[2]));
        series1.getData().add(new XYChart.Data(4, end[3]));
        series1.getData().add(new XYChart.Data(5, end[4]));
        series1.getData().add(new XYChart.Data(6, teamfinal));
        
        sc.getData().addAll(series1);
        Scene scene  = new Scene(sc, 500, 400);
        stage.setScene(scene);
        stage.show();
    }
}
    public static void main(String[] args) 
    {
        launch(args);
    }
}

