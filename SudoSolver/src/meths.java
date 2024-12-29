import java.util.*;

public class meths {
    
    public static void main(String[] args) throws Exception {
        
    }

    public static void presetMatrix(int[][] table, int lng) {        
        Scanner indice = new Scanner(System.in);
        Scanner values = new Scanner(System.in);

        int indiceNumber = Integer.parseInt(indice.nextLine());
        int valuesNumber = Integer.parseInt(values.nextLine());

        //------------------------------------------
        for (int i = 1; i <= 6; i++) {
            System.out.println("Table N°" + i + " (from left to right)");
            System.out.print("How many indices: ");
            
        }
        //-----------------------------------------
    }
    
    public static void enterValues (int[][] table, int lng){
        Scanner read = new Scanner(System.in);
        
        for (int i = 0; i < lng; i++) {
            for (int j = 0; j < lng; j++) {
                String sudoString = read.nextLine();
                int sudoNumber = Integer.parseInt(sudoString);
                
                //------------------------------------------
                table[i][j] = sudoNumber;
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