public class insertionStringSort
{
    public static void main(String args[])
    {
        String strA [] = 
        {"dog", "banana", "carpet", "applejack", "bath", "banish", "carrots", "zap", "do", "bard", 
        "carefully", "band", "aa", "banana", "apples", "apple", "z", "cart", "carp", "apricot", "bark", 
        "care", "app", "aaaa", "car", "carrot", "car", "carts", "carrot", "card", 
        "batch", "bandana", "cargo", "barn", "bandage", "apply", "", "careful", "aaa", "doge", "pear", 
        "dove", "ban", "bar", "cards", "a", "dogs"};

        StringSort(strA);

        for(String a: strA)
        {
            System.out.println(a);
        }
    }

    public static void StringSort(String x[])
    {
        for(int i = 1; i < x.length; i++)
        {
            String key = x[i];
            int j = i - 1;
            while(j >= 0 && x[j].compareTo(key) > 0)
            {
                x[j+1] = x[j];
                j--;
            }
            x[j+1] = key;
        }
    }
}