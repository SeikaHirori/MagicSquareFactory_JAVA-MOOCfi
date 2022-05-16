
public class MagicSquareFactory {

    private int x;
    private int y;

    public MagicSquareFactory() {

    }

    public MagicSquare createMagicSquare(int size) {


        MagicSquare square = new MagicSquare(size);
        
        if (size % 2 == 0 || size < 3) {
            System.out.println("Size was not an odd number above 2.");
            return square;
        }
        // implement the creation of a magic square with the Siamese method algorithm here
        
        this.x = firstColumnNumber(size); 
        this.y = 0;

        int value = 1;
        int totalValues = size * size;

        while (value <= totalValues) {

            boolean occupiedDiagonal = isOccupied(square, x, y);
            boolean occupiedDown = isOccupied(square, x - 1, y + 2);

            if (occupiedDiagonal) {
                goDiagonal();

                if ((!(occupiedDown)) && checkX(x, size) && (checkY(y, size))) {
                    goDown();
                }
            }

            if (checkY(y, size)) { // true
                resetY(size);
            }

            if (checkX(x, size)) { // true
                resetX(size);
            }

            if (isOccupied(square, x, y)) { // true
                goDown();
            }

            square.placeValue(this.x, this.y, value);
            value++;
        }


        return square;
    }

    public int firstColumnNumber(int size) {
        return (size / 2);
    }
    

    // Checks
    public boolean isOccupied(MagicSquare square, int x, int y) {

        if (square.readValue(x, y) != 0) {
            return true;
        }

        return false;
    }

    public boolean checkX(int x, int size) {
        
        if (x < 0 || x >= size) {
            return true;
        }

        return false;
    }

    public boolean checkY(int y, int size) {

        if (y < 0 || y >= size) {
            return true;
        }

        return false;
    }


    // Moves to different part of grind
    private void goDiagonal() {
        this.x++; // moveRight();
        this.y = this.y - 1; // moveUp();
    }

    private void goDown() {
        this.y += 2;
        this.x -= 1;
    }

    private void resetY(int size) {
        this.y = size - 1;
    }

    private void resetX(int size) {
        this.x = 0;
    }

    
}
