class Exercise6 {

  public boolean isStringPalindrome(String s, int start, int end) {
    if(start >= end) {
      return true;
    } else {
      if(s.charAt(start) == s.charAt(end)) {
        return isStringPalindrome(s, start + 1, end - 1);
      } else {
        return false;
      }
    }
  }

  public static void main(String[] args) {

    Exercise6 ex = new Exercise6();
    String s = "house";//"racecar";
    boolean result = ex.isStringPalindrome(s, 0, s.length() - 1);
    System.out.printf("Is %s a palindrome? %b\n", s, result);

    System.exit(0);
  }
}
