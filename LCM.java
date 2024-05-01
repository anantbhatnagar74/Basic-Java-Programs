import java.util.*;
class LCM {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);;
        System.out.print("Enter two numbers :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans = (a > b) ? a : b;
        while (true) {
            if (ans % a == 0 && ans % b == 0)
                break;
            ans++;
        }
        System.out.println("LCM of " + a + " and " + b
                           + " : " + ans);
    }
}

Output : Enter two numbers : 15 
25
LCM of 15 and 25 : 75
