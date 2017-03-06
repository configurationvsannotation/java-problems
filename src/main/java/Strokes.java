import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Strokes {

  public int solutionSlow(int[] a) {
    int max = Arrays.stream(a).max().getAsInt();
    int strokes = 0;
    boolean stroked = false;
    for (int i = 0; i < max; i++) {
      stroked = false;
      for (int j = 0; j < a.length; j++) {
        if (a[j] >= i + 1) {
          if (!stroked) {
            strokes++;
          }
          stroked = true;
        } else {
          stroked = false;
        }
      }
    }
    return strokes > 1_000_000_000 ? -1 : strokes;
  }
  class StrokeCounter{
    int strokesInProgress;
    int strokes;

    public StrokeCounter(int strokesInProgress, int strokes) {
      this.strokesInProgress = strokesInProgress;
      this.strokes = strokes;
    }
  }
  public int solution(int[] a) {
    int strokes = 0;
    for(int i = 0; i < a.length; i++){
      if(i > 0){
         if(a[i] > a[i - 1]){
           strokes += a[i] - a[i - 1];
         }
      }else{
        strokes += a[i];
      }
    }
    return strokes > 1_000_000_000 ? -1 : strokes;
  }
}
