class Main {
  public static void main(String[] args) {
    boolean a = true;
	boolean b = true;

	System.out.println("a" + "\t\t" + "b" + "\t\t" + "a && (b || !a) == a && b" + "\t" + "a && (b || !a) == (a && b)");

	for (int i = 0; i < 2; i++) {
		for (int j = 0; j < 2; j++) {
			boolean test1 = a && (b || !a) == a && b;
			boolean test2 = (a && (b || !a)) == (a && b);
			System.out.println(a + "\t" + b + "\t" + test1 + "\t\t\t\t\t\t" + test2);
			b = false;
		}
		a = false;
		b = true;
	}


  }
}