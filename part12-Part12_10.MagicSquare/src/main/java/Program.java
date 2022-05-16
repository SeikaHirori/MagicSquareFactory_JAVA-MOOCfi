
public class Program {

    public static void main(String[] args) {
        // Test the MagicSquare class here

        MagicSquareFactory msFactory = new MagicSquareFactory();
        System.out.println(msFactory.createMagicSquare(3)); 
        System.out.println(msFactory.createMagicSquare(5)); 
        // System.out.println(msFactory.createMagicSquare(7)); 


        
        /* System.out.println(msFactory.firstColumnNumber(3));
        System.out.println(msFactory.firstColumnNumber(5));
        System.out.println(msFactory.firstColumnNumber(7));
        */

    }
}
