public class StringPoolTest {
  public static void main(String[] args) {
    String str1 = new String("abc").intern();
    String str2 = new String("abc").intern();
    System.out.println(str1 == str2);
  }
}
