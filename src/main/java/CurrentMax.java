public class CurrentMax {
  public int max;

  public CurrentMax(int max) {
    this.max = max;
  }
  public void updatePossible(int max){
    this.max = Math.max(this.max,max);
  }
}
