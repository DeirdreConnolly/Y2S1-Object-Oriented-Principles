

public class IntegerSet
{

   boolean [] intar;

   public IntegerSet ()
   {
     intar = new boolean[100];
     for (int i =0; i< 100; i++)
       intar[i] = false;
   }


   public void insertElement ( int k)
   {
     intar [k] = true;
   }

   public void deletElement (int k)
   {
     intar[k] = false;
   }

   public String toString ()
   {
      boolean emptySet= true;
      String outputString ="" ;
      for (int i =0; i< 100; i++)
        if (intar[i] == true)
        {
           emptySet = false;
           outputString = outputString + "   " + i;
        }
      if (emptySet == true)
           outputString = "---";
      return outputString;
        
   }

   public boolean isInSet (int k)
   {
     if (intar[k] )
       return true;
     return false;
   }

/*  could be this way ????????
   public boolean isEqualTo ( IntegerSet  i1, IntegerSet  i2)
   {
      boolean isEqual = true;
      for (int i =0; i< 100; i++)
          {
           if (!( i1.isInSet(i) == i2.isInSet(i)))
                return false;
          }
     return true;
   }
*/
   public IntegerSet intersection (  IntegerSet  i2)
   {
      IntegerSet result = new IntegerSet();
      
      for (int i =0; i< 100; i++)
          {
           if (( this.isInSet(i) && i2.isInSet(i)))
                result.insertElement(i);
          }
     return result;
   } 


   public IntegerSet union ( IntegerSet  i2)
   {
      IntegerSet result = new IntegerSet();
      
      for (int i =0; i< 100; i++)
          {
           if (( this.isInSet(i) || i2.isInSet(i)))
                result.insertElement(i);
          }
     return result;
   } 
}

