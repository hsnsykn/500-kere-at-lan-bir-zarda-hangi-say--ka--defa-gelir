/** Bir zar 500 defa atılıyor
 * hangi sayı kaç defa gelir
 *
 * @author soyka
 */
public class zarörneği {
    public static void main(String[] args) {
     int z1=0,z2=0,z3=0,z4=0,z5=0,z6=0;
     for (int k = 1;k <= 500; k++){
     int rs = (int) (Math.random () * 6) + 1 ;
     if (rs== 1) z1++ ;
     if (rs== 2) z2++ ; 
     if (rs== 3) z3++ ; 
     if (rs== 4) z4++ ; 
     if (rs== 5) z5++ ; 
     if (rs== 6) z6++ ; 
     }
        System.out.println("Zar 1 :" + z1 + "defa geldi");
        System.out.println("Zar 2 :" + z2 + "defa geldi");
        System.out.println("Zar 3 :" + z3 + "defa geldi");
        System.out.println("Zar 4 :" + z4 + "defa geldi");
        System.out.println("Zar 5 :" + z5 + "defa geldi");
        System.out.println("Zar 6 :" + z6 + "defa geldi");
        
            
    
    
    
    }
   
  
}
