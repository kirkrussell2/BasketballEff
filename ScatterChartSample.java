import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.ScatterChart;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;
import java.util.Scanner;
public class ScatterChartSample extends Application
 {
    @Override public void start(Stage stage) 
    {
        double p1;
        double p2;
        double p3;
        double p4;
        double p5;
        double team;
            Scanner input = new Scanner(System.in);
            System.out.println("Enter Point Guard's efficiency ");
            p1 = input.nextDouble();
            System.out.println("Enter Shooting Guard's efficiency");
            p2 = input.nextDouble();           
            System.out.println("Enter Small Forward's efficiency");
            p3 = input.nextDouble();
            System.out.println("Enter Power Forward's efficiency");
            p4 = input.nextDouble();
            System.out.println("Enter Center's efficiency");
            p5 = input.nextDouble();
            System.out.println("Enter Team's efficiency");
            team = input.nextDouble();
        
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
        series1.getData().add(new XYChart.Data(1, p1));
        series1.getData().add(new XYChart.Data(2, p2));
        series1.getData().add(new XYChart.Data(3, p3));
        series1.getData().add(new XYChart.Data(4, p4));
        series1.getData().add(new XYChart.Data(5, p5));
        series1.getData().add(new XYChart.Data(6, team));
        
        sc.getData().addAll(series1);
        Scene scene  = new Scene(sc, 500, 400);
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}