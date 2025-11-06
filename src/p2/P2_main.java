package p2;

public class P2_main {
    public static void main(String[] args) {
        
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 999; 

        boolean E1 = (a == b);
       
        boolean E2 = (a == b) || (a == c);
       
        boolean E3 = (a + b >= c);
       
        boolean E4 = (a + b + c >= 100);

       
        d = 0;
        if (E1) { d = d + 1; }
        if (E2) { d = d + 1; }
        if (E3) { d = d + 1; }
        if (E4) { d = d + 1; }

        System.out.println("a=" + a + ", b=" + b + ", c=" + c);
        System.out.println("Erfüllte Eigenschaften: d=" + d);
    }
}
