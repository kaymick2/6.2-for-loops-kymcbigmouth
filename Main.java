class Main {
  public static void main(String[] args) {
    for (int x = 2; x <= 20; x = x + 2)
      System.out.print(x + ",");

    do {
      int y = y + 2;
      System.out.println(y + ",");
    } while (y <= 20);

    while (z <= 20)
      ;
    {
      int z = z + 2;
      System.out.println(z + ",");
    }
  }
}