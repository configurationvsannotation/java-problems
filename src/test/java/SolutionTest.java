import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
  @Test
  public void solution() throws Exception {
    int[] a = new int[]{-1, 3, -4, 5, 1, -6, 2, 1};
    int solution = new Solution().solution(a);
    assertEquals(3, solution);
  }

}