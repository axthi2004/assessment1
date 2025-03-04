class Palindrome {
    public static void main(String[] args) {
     String str = "madam";
   
         stringb(str);
         stringbuilder(str);
         stringbuffer(str);
         without(str);
       }
        static void stringb(String str) {
          
           String reversed = new StringBuilder(str).reverse().toString();
           if (str.equals(reversed)) {
               System.out.println(str + " is a palindrome.");
           } else {
               System.out.println(str + " is not a palindrome.");
           }
       }
   
   
        static void stringbuilder(String str) {
           //String str = "madam";
          StringBuilder sb = new StringBuilder(str);
           sb.reverse();
           
           if (str.equals(sb.toString())) {
               System.out.println(str + " is a palindrome.");
           } else {
               System.out.println(str + " is not a palindrome.");
           }
       }
   
   
        static void stringbuffer(String str) {
           //String str = "madam";
           StringBuffer sbf = new StringBuffer(str);
           sbf.reverse();
           
           if (str.equals(sbf.toString())) {
               System.out.println(str + " is a palindrome.");
           } else {
               System.out.println(str + " is not a palindrome.");
           }
       }
   
   
        static void without(String str) {
           //String str = "madam";
           int start = 0;
           int end = str.length() - 1;
           boolean isPalindrome = true;
           
           while (start < end) {
               if (str.charAt(start) != str.charAt(end)) {
                   isPalindrome = false;
                   break;
               }
               start++;
               end--;
           }
           
           if (isPalindrome) {
               System.out.println(str + " is a palindrome.");
           } else {
               System.out.println(str + " is not a palindrome.");
           }
   
   
   }
}
   
   
   