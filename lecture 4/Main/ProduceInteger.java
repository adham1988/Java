/**
 * @author  Ole Borch
 */
public class ProduceInteger extends Thread {
   private HoldInteger pHold;
   public ProduceInteger( HoldInteger h )
   {
      pHold = h;
      System.out.println( "Producer created");
   }

   public void run()
   {
      for ( int count = 0; count < 10; count++ ) {
         pHold.setSharedInt( count );
         // sleep for a random interval
         try {
            sleep( (int) ( Math.random() * 3000 ) );
         }
         catch( InterruptedException e ) {
            System.err.println( "Exception " + e.toString() );
         }
      }
   }
}