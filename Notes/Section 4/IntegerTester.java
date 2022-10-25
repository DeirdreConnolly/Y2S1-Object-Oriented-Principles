
/**
 * Write a description of class IntegerTester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class IntegerTester
{
   public static void main(String[] args)    
        {
           IntegerSet iset1 = new IntegerSet();
           IntegerSet iset2 = new IntegerSet();
           IntegerSet iset3 = new IntegerSet();
           iset1.insertElement(1);
           iset2.insertElement(3);
           iset3 =iset1.union(iset2);
           System.out.println( " Iset1 is :"+ iset1.toString() );
           System.out.println( " Iset2 is :"+ iset2.toString() );
           System.out.println( " Iset3 is :"+ iset3.toString() );
        }
}
