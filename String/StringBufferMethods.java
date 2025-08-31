public class StringBufferMethods {
  public static void main(String[] args) {
    StringBuffer str = new StringBuffer("StringBuffer");

    // append(string str)
    System.out.println(str.append("welcome"));

    // insert(in offset , string str)
    System.out.println(str.insert(6, "-"));

    // replace(int start , int end , string str)
    System.out.println(str.replace(6, 7, ""));

    // delete(int start , int end)
    System.out.println(str.delete(12, 19));

    // deleteCharAt(int index)
    System.out.println(str.deleteCharAt(6));

    // reverse()
    // capacity()
    // length()
    // ensureCapacity(int minCapacity)
    // charAt(int index)
    // setCharAt(int index , char ch)
    // substring(int start)
    // subString(int start , int end)
    // indexOf(String str)
    // lastIndexOf(String str)
    // setLength(int newLength)
    // trimToSize()
  }
}
