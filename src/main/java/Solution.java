import java.util.Arrays;

class Solution {
  public int solution(int[] a) {
    int equilib = 0;
    for(int i = 1; i < a.length; i++){
      int left = 0;
      int right = 0;
      for(int j = 0; j< a.length; j++){
        if(j < i)left +=a[j];
        if(j > i)right +=a[j];
      }
      if(left == right && left > 0)equilib++;
    }
    return equilib;

  }

}