


public class palindrome {

    static boolean isPalindrome(String str)
    {

        
        int i = 0, j = str.length() - 1;

        
        while (i < j) {

  
            if (str.charAt(i) != str.charAt(j))
                return false;

            i++;
            j--;
        }

        // Given string is a palindrome
        return true;
    }

    
    public static void main(String[] args)
    {
      
        String str = "geeks";

        
        str = str.toLowerCase();
        
        if (isPalindrome(str))

           
            System.out.print("Yes");
        else

           
            System.out.print("No");
    }
}
