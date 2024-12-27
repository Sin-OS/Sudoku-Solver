import java.util.*;

public class meths {
    
    public static void main(String[] args) throws Exception{
        
    }
    
    
    public static void enterValues (int[][] table, int lng){
        Scanner read = new Scanner(System.in);
        
        for (int i = 0; i < lng; i++) {
            for (int j = 0; j < lng; j++) {
                
                String sudoElement = null;
                while (sudoElement == null || sudoElement == " ") {
                    System.out.println("Line: " + i + " Column: " + j + " : ");
                    sudoElement = read.nextLine();
                }
                //------------------------------------------
                int SudoValue = Integer.valueOf(sudoElement);
                //------------------------------------------
                
            }
        }
    }

    public static void displayGame(int[][] table, int lng) {
        for (int i = 0; i < lng; i++) {
            for (int j = 0; j < lng; j++) {
                System.out.println(table[i] + " " + table[j]);
            }
        }
    }

}
