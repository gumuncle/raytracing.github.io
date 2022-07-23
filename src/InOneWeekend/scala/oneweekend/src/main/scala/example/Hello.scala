package oneweekend 
import sys.process._

object OneWeekEnd extends App {
  val height = 256;
  val width = 256;
  println(s"P3\n${width} ${height}\n255");
  for (j <- (height-1) to 0 by -1) {
    Console.err.println(s"\rScanlines remaining: ${j} ")
    for (i <- 0 until width) {
      var r = i.toDouble / (width-1);
      var g = j.toDouble / (height-1);
      var b = 0.25;
      var ir = 255.999 * r;  
      var ig = 255.999 * g;
      var ib = 255.999 * b;
      println(s"${ir.abs.toInt} ${ig.abs.toInt} ${ib.abs.toInt}");
    }
  }

}