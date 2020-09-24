/**
 * @author  Ole Borch
 */
public class HoldInteger{
   private int sharedInt;
   private boolean writeable = true;

   public void setSharedInt( int val ) {
	while(!writeable);
   sharedInt = val; 
   System.out.println( "Producer set sharedInt to " + sharedInt );
   }
   public int getSharedInt() {
	writeable = false;
   System.out.println( "Consumer retrieved " + sharedInt ); 
   int n = sharedInt; 
   writeable = true;
   return n;
   }
}