package NewStats;
import java.util.Arrays;
public class cifter
{
public static int getMaxValue(int[] numbers){
  int maxValue = numbers[0];
  for(int i=1;i < numbers.length;i++){
    if(numbers[i] > maxValue){
	  maxValue = numbers[i];
	}
  }
  return maxValue;
}
    }

