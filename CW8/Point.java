package CW7;
 final class Point {
     private int x;
     private int y;

     Point() {
         this.x = 0;
         this.y = 0;
     }

     private Point(int x, int y) {
      this.x=getX();
      this.y=getY();
     }

     public static Point createPoint() {

     }

     public static Point createPoint(int x, int y) {

     }

     public static int translate(Point point, int x, int y) {
         return point.getX() + x + point.getY() + y;
     }

     public int getX() {
         return this.x;
     }

     public int getY() {
         return this.y;
     }
 }