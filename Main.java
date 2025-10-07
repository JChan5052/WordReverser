import java.util.ArrayList;
public class Main
{ 
    public static void main(String[] args)
{
    ArrayList<String> words = new ArrayList<String>();
    words.add(""); //repeat this for as many rows as there are
    words.add(""); //repeat this for as many rows as there are
    words.add(""); //repeat this for as many rows as there are
    words.add(""); //repeat this for as many rows as there are
    words.add(""); //repeat this for as many rows as there are
    words.add(""); //repeat this for as many rows as there are
    words.add(""); //repeat this for as many rows as there are
    words.add(""); //repeat this for as many rows as there are

   
   
 
    wordsFile test = new wordsFile(words);


    System.out.println(test.checkLength());
    System.out.print("All Rows Forward");
    System.out.println("\n");
    System.out.println(test.Rows());
    System.out.println("\n");
    System.out.print("All Rows Backward");
    System.out.println("\n");
    System.out.println(test.invertRows());
 
  System.out.print ("\n");
  System.out.print("All Columns Forward");
  System.out.println("\n");
  System.out.println(test.Columns());
  System.out.println("\n");
  System.out.print("All Columns Backward");
  System.out.println("\n");
  System.out.println(test.invertColumns());

  System.out.print ("\n");
  System.out.print("Diagonals BottomHalf Forward");
  System.out.println("\n");
  System.out.println(test.diagonalsBottomHalf());System.out.print ("\n");
  System.out.print("Diagonals BottomHalf Backward");
  System.out.println("\n");
  System.out.println(test.invertdiagonalsBottomHalf());
  System.out.print("Diagonals TopHalf Forward");
  System.out.println("\n");
  System.out.println(test.diagonalsTopHalf());System.out.print ("\n");
  System.out.print("Diagonals TopHalf Backward");
  System.out.println("\n");
  System.out.println(test.invertdiagonalsTopHalf());

}
}