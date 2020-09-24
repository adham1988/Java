/**
 * @author  Ole Borch
 */
public class ConsumeInteger extends Thread {
   private HoldInteger cHold;

   public ConsumeInteger( HoldInteger h )
   {
      cHold = h;
      System.out.println( "Consumer created" );

   }

   public void run()
   {
      int val;

      val = cHold.getSharedInt();

      while ( val != 9 ) {
         // sleep for a random interval
         try {
            sleep( (int) ( Math.random() * 3000 ) );
         }
         catch( InterruptedException e ) {
            System.err.println( "Exception " + e.toString() );
         }

         val = cHold.getSharedInt();
      }
      //System.out.println( "pingpong-list was: " + cHold.pingpong );
   }
}