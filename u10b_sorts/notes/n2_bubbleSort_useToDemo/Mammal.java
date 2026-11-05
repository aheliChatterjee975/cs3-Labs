class Animal {
   protected double length;
   
   public Animal(double len) { length = len; }
}

public class Mammal extends Animal implements Comparable<Mammal>
{
   private double weight;
   
   public Mammal(double len, double wt) {
      super(len);
      this.weight = weight;
   }
   
   public int compareTo(Mammal a) {
      return Double.compare(length, a.length);
   }
}