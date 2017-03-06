import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StrokesTest{
  @Test
  public void first (){
    int solution = new Strokes().solution(new int[]{1, 3, 2, 1, 2, 1, 5, 3, 3, 4, 2});
    assertEquals(9,solution);
  }
  @Test
  public void first2 (){
    int solution = new Strokes().solution(new int[]{1, 1, 1, 1});
    assertEquals(1,solution);
  }
  @Test
  public void first3 (){
    int solution = new Strokes().solution(new int[]{5,8});
    assertEquals(8,solution);
  }
}
