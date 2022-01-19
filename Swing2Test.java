import javafx.animation.FadeTransition;
import javafx.animation.RotateTransition;
import javafx.animation.Timeline;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Swing2Test extends JFrame 
{
  public Swing2Test() 
  {
    setTitle("Simple example");
    JPanel panel = new JPanel();
    getContentPane().add(panel);
    JButton button = new JButton("Show JavaFX Dialog");
    button.setBounds(50, 60, 80, 30);
    button.addActionListener(new ActionListener() 
    {
      @Override
      public void actionPerformed(ActionEvent event) 
      {
        final JDialog dialog = new JDialog(Swing2Test.this,
            "JavaFX Dialog",
            true);
        final JFXPanel contentPane = new JFXPanel();
        dialog.setContentPane(contentPane);
        dialog.setDefaultCloseOperation(
            JDialog.HIDE_ON_CLOSE);

        // building the scene graph must be done on the javafx thread
        Platform.runLater(new Runnable() 
        {
          @Override
          public void run() 
          {
            contentPane.setScene(createScene());
            SwingUtilities.invokeLater(new Runnable() 
            {
              @Override
              public void run() {
                dialog.pack();
                dialog.setVisible(true);
              }
            });
          }
        });
      }
      private Scene createScene() 
      {
        System.out.println("creating scene");
        StackPane root = new StackPane();
        Rectangle rect1 = new Rectangle(10, 10, 50, 50);
        rect1.setFill(Color.BLUE);
        Rectangle rect2 = new Rectangle(0, 0, 30, 30);
        rect2.setFill(Color.ORANGE);
        root.getChildren().addAll(rect1, rect2);
        FadeTransition ft = new FadeTransition(Duration.millis(1800), rect1);
        ft.setFromValue(1.0);
        ft.setToValue(0.1);
        ft.setCycleCount(Timeline.INDEFINITE);
        ft.setAutoReverse(true);
        ft.play();
        RotateTransition rt = new RotateTransition(Duration.millis(1500), rect2);;
        rt.setByAngle(180f);
        rt.setCycleCount(Timeline.INDEFINITE);
        rt.setAutoReverse(true);
        rt.play();
        return new Scene(root, 150, 150);
      }
    });

    panel.add(button);

    setSize(300, 200);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
  }
  public static void main(String[] args) 
  {
    SwingUtilities.invokeLater(new Runnable() 
    {
      @Override
      public void run() 
      {
        Swing2Test ex = new Swing2Test();
        ex.setVisible(true);
      }
    });
  }
}