import java.util.*;

public class meths {
    
    public static void main(String[] args) throws Exception {
        
    }

    public static void presetMatrix(int[][] table, int lng) {        
        Scanner indice = new Scanner(System.in);
        Scanner values = new Scanner(System.in);

        
        int valuesNumber = Integer.parseInt(values.nextLine());
        int tableNumber  = 1;

        System.out.print("How many indices: ");
        int indiceNumber = Integer.parseInt(indice.nextLine());

        
        //-------------------------------------------------------
        for (int t = 0; t < indiceNumber; t++) {
            for (int i = 1; i <= 9; i++) {
                for (int j = 1; j <= 9; j++) {
                    System.out.println("Table N°" + tableNumber + " (from left to right)");
                    System.out.println("--------------------------------------");
    
                     if(i == j && i % 3 == 0) {
                         tableNumber++;
                    }
                }
                
            }
        }
        //------------------------------------------------------
    }
    
    public static void enterValues (int[][] table, int lng){
        Scanner read = new Scanner(System.in);
        
        for (int i = 0; i < lng; i++) {
            for (int j = 0; j < lng; j++) {
                
                //------------------------------------------
                table[i][j] = 0;
                //------------------------------------------
                
            }
        }
    }

    public static void displayGame(int[][] table, int lng) {
        for (int i = 0; i < lng; i++) {
            for (int j = 0; j < lng; j++) {
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
    }

}