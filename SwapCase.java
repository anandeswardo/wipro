import java.util.Scanner;
class SwapCase
{ 
    public static void convertOpposite(char str) 
     { 
        { 
        Character c = str.charAt(i);
            if (str.isLowerCase(c)) 
                str.replace(i, str.toUpperCase(c)+""); 
            else
                str.replace(i, i+1, Character.toLowerCase(c)+"");  
        } 
     }
     public static void main(String[] args)  
     { 
         Scanner sc=new Scanner(System.in);
         char str = sc.next().charAt(0);  
         convertOpposite(str);
         System.out.println(str); 
        } 
 } 
