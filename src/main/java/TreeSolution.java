import org.omg.CORBA.Current;

import java.util.*;

public class TreeSolution {
  public int solution(Tree t) {
    HashSet<Integer> set = new HashSet<>();
    Map<String,Set<Integer>> paths= new HashMap<>();
    paths.put("last",set);
    set.add(t.x);
    CurrentMax currentMax = distinct(t, paths, new CurrentMax(1));
    return currentMax.max;
  }
  private CurrentMax distinct(Tree t, Map<String,Set<Integer>> paths, CurrentMax currentMax){
    if(t.l != null){
      Set<Integer> last = new HashSet<>(paths.get("last"));
      last.add(t.l.x);
      currentMax.updatePossible(last.size());
      distinct(t.l, Collections.singletonMap("last",last),currentMax);
    }
    if(t.r != null){
      Set<Integer> last = new HashSet<>(paths.get("last"));
      last.add(t.r.x);
      currentMax.updatePossible(last.size());
      distinct(t.r, Collections.singletonMap("last",last), currentMax);
    }
    return currentMax;
  }

}
