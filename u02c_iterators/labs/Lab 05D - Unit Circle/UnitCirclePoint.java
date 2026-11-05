public class UnitCirclePoint implements Comparable<UnitCirclePoint> {
   public int    angleInDegrees;
   public String nameOfAngleInRadians;
   public double angleInRadians;
   public String xName;
   public String yName;
   public double x;
   public double y;
   public String tangentName;
   public double tangent;

   public UnitCirclePoint(int aid, String nameAir, double air, String xName, String yName, String tName) {
      angleInDegrees = aid;
      nameOfAngleInRadians = nameAir;
      angleInRadians = air;
      this.xName = xName;
      this.yName = yName;
      x = Math.cos(angleInRadians);
      y = Math.sin(angleInRadians);
      tangentName = tName;
      tangent = y / x;
   }

   public int compareTo(UnitCirclePoint other) {
      return this.angleInDegrees - other.angleInDegrees;
   }

   @Override
   public boolean equals(Object o) {
      UnitCirclePoint other = (UnitCirclePoint)o;
      return this.angleInDegrees == other.angleInDegrees;
   }

   public String toString() {
      return "degrees = " + String.format("%3d", angleInDegrees) +
             ", radians = " + String.format("%6s", nameOfAngleInRadians) +
             ", (" + String.format("%10s", xName) + ", " + String.format("%10s", yName) + ")" +
             ", tangent = " + String.format("%10s", tangentName);
   }
}
