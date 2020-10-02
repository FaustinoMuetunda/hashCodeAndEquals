/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashcodeandequals;

/**
 *
 * @author faust
 */
public class HashCodeandEquals {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Cliente c1 = new Cliente("Faustino", "faustinomuetunda@gmail.com");
        Cliente c2 = new Cliente("Paulo", "faustinomuetunda@gmail.com");
        System.out.println("Equals: " + c1.equals(c2));
        int x = c1.hashCode();
        int y = c2.hashCode();
        boolean z=false;
        
        if(x==y){
            System.out.println("HashCode true");
        }else
            System.out.println("HashCode false");
        System.out.println("HashCode c1: "+x);
        System.out.println("HashCode c2: "+y);
      
    }

}
