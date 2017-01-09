import java.util.*;

public class Solution {
	
	static boolean check(String str) {
        if (str == null)
            return true;

        int idx = 0;
        List<Character> Possible = new ArrayList<Character>();

        while (idx < str.length())
        {
            switch (str.charAt(idx))
            {
                case '(':
                    Possible.add(')');
                    break;
                case '[':
                    Possible.add(']');
                    break;
                case ']':
                case ')':
                    if ((Possible.size() == 0)
                      ||((char)Possible.get(Possible.size() - 1) != str.charAt(idx)))
                        return false;
                    Possible.remove(Possible.size() - 1);
                    break;
            }
            idx++;
        }
        return (Possible.size() == 0);
	}

	public static void main(String[] args) {
		// -----
	}
}
