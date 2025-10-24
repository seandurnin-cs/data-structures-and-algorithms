public class palindrome
{
    public static void main(String args[])
    {
        String s = "find";
        if(isPalindrome(s))
        {
            System.out.println("True!");
        }
        else
        {
            System.out.println("False!");
        }
    }

    public static boolean isPalindrome(String x)
    {
        if(x.length() > 1)
        {
            return true;
        }
        else if(x.charAt(0) == x.charAt(x.length()))
        {
            return isPalindrome(x.substring(1,x.length()-1));
        }
        else
        {
            return false;
        }
    }
}