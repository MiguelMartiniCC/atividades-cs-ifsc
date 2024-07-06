public class Ex1 {
    public static void main(String[] args) {
      boolean resA = 5 + 3 * 6 / 2 >= 10;
      boolean resB = 36 / 3 * 2 - 5 +8 == 27;
       boolean resC = ! (30 / 4 * 6 == 15);
       boolean resD = (30 % 4 * 6 == 12) || true;
       boolean resE = (5 * 7 % 3) + 4 / 2 + 5 == 12 && (12 / 4 < 8);
       Boolean resF = (((5 * 7 % 3 + 5) / 2 + 5) <= 14) || (! (12 / 4 < 8 * 2));

      System.out.println(resA);
      System.out.println(resB);
      System.out.println(resC);
      System.out.println(resD);
      System.out.println(resE);
      System.out.println(resF);
    }
}
