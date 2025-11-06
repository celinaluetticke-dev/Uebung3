package p3;

public class P3_main {
    public static void main(String[] args) {

        int z = -12;                
        if (z < 0) {               
            z = -z;
        }
        System.out.println("Betrag = " + z);
        
        z = z * z;                  
        System.out.println("Quadrat = " + z);            
      
        if ((z / 2) * 2 == z) {
            System.out.println("Gerade");
        } else {
            System.out.println("Ungerade");
        }
    }
}