import org.junit.Test;

import static org.junit.Assert.*;

public class TreeSolutionTest {
  @Test
  public void distinctElements(){
    TreeSolution t = new TreeSolution();
    int solution = t.solution(buildTree());
    assertEquals(3, solution);
  }

  Tree buildTree(){
    Tree a = new Tree("a",4);
    Tree b = new Tree("b",5);
    Tree c = new Tree("c",6);
    Tree d = new Tree("d",4);
    Tree e = new Tree("e",1);
    Tree f = new Tree("f",6);
    Tree g = new Tree("g",5);

    a.l = b;
    a.r = c;
    b.l = d;
    c.l = e;
    c.r = f;
    d.l = g;

    return a;
  }


}