import java.util.*;
public class stringsprob2 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     String name = sc.next();
     
     char[] arr = name.toCharArray();
    //  String names = "";
    int vowels = 0;
    int cons = 0;
     int numbers = 0;

     System.out.println(Arrays.toString(arr));

     for(char c:arr)
     {
        if(Character.isDigit(c))
        {
            numbers += 1;
        }
        else if(c == 'a' || c=='e' || c=='i' || c=='o' || c=='u')
        {
            vowels += 1;
        }
        else
        {
            cons += 1;
        }
     }
     System.out.println(vowels);
     System.out.println(cons);
     System.out.println(numbers);
    }
}
