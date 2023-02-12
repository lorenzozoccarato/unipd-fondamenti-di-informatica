public class Cerchio
{
   public Cerchio (double x, double y, double radius)
   {
     xc = x;
     yc = y;
     rc = radius;
   }

   /*
       Verifica se questo cerchio e il cerchio c sono coincidenti, 
       ovvero se hanno tutti i punti in comune
   */

   public boolean isCoincident(Cerchio c)
   {
	  return (distance(xc, yc, c.xc, c.yc) == 0) && approxEquals(rc, c.rc);
   }


   /*
       verifica se questo cerchio e' interno al cerchio c o se
       il cerchio c e' interno a questo cerchio
   */
   public boolean isEncircled(Cerchio c)
   {
	   return distance(xc, yc, c.xc, c.yc) < (rc - c.rc); 
   }

   /*
      verifica se questo cerchio e il cerchio c sono esterni, ovvero non
      sono contenuti uno nell'altro e non hanno alcun punto in comune
   */
   public boolean isExternal(Cerchio c)
   {
      return distance(xc, yc, c.xc, c.yc) > (rc + c.rc);
   }
          


   /*
      verifica se questo cerchio e il cerchio c sono secanti, 
      ovvero se hanno almeno un punto in comune.
   */
   public boolean isSecant(Cerchio c)
   {
      return (distance(xc, yc, c.xc, c.yc) < (rc + c.rc)) && (distance(xc, yc, c.xc, c.yc) > (rc - c.rc));
   }
          


   /*
      Verifica se questo cerchio e il cerchio c sono tangenti,
      ovvero se hanno un solo punto in comune
   */
   public boolean isTangential(Cerchio c)
   {
      return (distance(xc, yc, c.xc, c.yc) == (rc + c.rc)) || (distance(xc, yc, c.xc, c.yc) == (rc - c.rc));
   }

   public boolean approxEquals(double r1, double r2)
   {
      if (r1 == r2)
      return true;
      else
      return false;
      
   }

   public double distance(double x1, double y1, double x2, double y2)
   {
      return Math.sqrt(Math.pow(x1-x2,2) + Math.pow(y1-y2,2));
   }

   private double xc;
   private double yc;
   private double rc;

}
