/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package two;

/**
 *
 * @author Prestamo
 */
import java.util.*;

public class TwoStrings 
{
        public static Set<Character> toCharSet(String word) 
        {
            Set<Character> charSet = new HashSet<>();

            for (int i = 0; i < word.length(); i++) 
            {
                charSet.add(word.charAt(i));
            }

            return charSet;
        }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();

        for (int qItr = 0; qItr < q; qItr++) 
        {
            Set<Character> s1 = toCharSet(sc.next());
            Set<Character> s2 = toCharSet(sc.next());
            s1.retainAll(s2);
            if (s1.size() > 0) 
            {
                System.out.println("YES");
            } 
            else 
            {
                System.out.println("NO");
            }
        }
    }
}
    


