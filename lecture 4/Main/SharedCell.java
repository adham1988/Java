public class SharedCell {
   public static void main( String args[] )
   {
      HoldInteger 		h = new HoldInteger();
      ProduceInteger 	p = new ProduceInteger( h );
      ConsumeInteger 	c = new ConsumeInteger( h );
      c.start();
      p.start();
   }
}