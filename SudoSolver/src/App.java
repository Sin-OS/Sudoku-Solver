public class App {
    public static void main(String[] args) throws Exception {
        int[][] sudoTable = new int[9][9];
        int sudoLength = sudoTable.length;
        
        meths.presetMatrix(sudoTable, sudoLength);
        meths.enterValues(sudoTable, sudoLength);
        meths.displayGame(sudoTable, sudoLength);
    }
    
    
}