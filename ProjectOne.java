import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class ProjectOne {
    static Logger log = new Logger();
    public static void main(String[] args) throws FileNotFoundException{
        // Set to 'true' to enable console output for debugging
        boolean debug = false;
        LogicExec logic = new LogicExec();

        // Get number of p's from args[0]
        int userNumInput = Integer.parseInt(args[0]);

        // Create output text file
        PrintStream outFile = new PrintStream(new File("Results_with_n_" + userNumInput + ".text")); // Use this to print output to file
        PrintStream console = System.out;   // Use this to print to console
        // Create an array with p1 to pn to be the table header
        String [] pSequence = new String [userNumInput];
        for(int p = 0; p < userNumInput; p++){
            pSequence[p] = "p" + (p+1);
        }
        
        // Generate the truth table
        String [][] myTruthTable = TruthTable.setup(userNumInput);
        if(debug)
            printTable(pSequence, myTruthTable);

        // Add a result column to the truth table
        // First [] is column, second [] is row
        int numOfRow = myTruthTable[0].length;
        int numOfColumn = myTruthTable.length;
        if(debug)
            log.print(numOfRow + " x " + numOfColumn);

        // Copy and append a column to myTruthTable
        String [][] fullTable = new String [numOfColumn + 2] [numOfRow];    //Add 2 columns
        for(int m = 0; m < numOfRow; m++){
            for(int n = 0; n < numOfColumn; n++){
                fullTable[n][m] = myTruthTable[n][m];
            }
        }

        // Evaluate the truth table
        String [] tempResult = fullTable[0];
        for(int t=1; t<numOfColumn; t++){
            tempResult = logic.biDirExec(tempResult, fullTable[t]);
        }
        // Count number of true for each row and add to the main table
        String [] xCount = new String[numOfRow];
        for(int r=0; r<numOfRow; r++){
            int x = 0;
            for(int c=0; c<numOfColumn; c++){
                if(fullTable[c][r] == "T"){
                    x++;
                }
            }
            xCount[r] = String.valueOf(x);
        }

        // Add (1) results and x count
        for(int h=0; h<numOfRow; h++){
            fullTable[numOfColumn][h] = tempResult[h];  // Add the (1) result to each row
            fullTable[numOfColumn+1][h] = xCount[h];    // Add x count to each row
        }

        // Append result to the header
        String [] fullHeader = new String [pSequence.length + 2];
        for(int h=0; h<pSequence.length; h++){
            fullHeader[h] = pSequence[h];
        }
        fullHeader[fullHeader.length - 2] = "Result"; // subtract 1 because of 0 base index
        fullHeader[fullHeader.length - 1] = "x";

        if(debug)
            printTable(fullHeader, fullTable);
        System.setOut(outFile); // Sending below output to file
        printTable(fullHeader, fullTable);
        System.setOut(console); // Set back to send output to console

    }
    static void printTable(String [] header, String [][] generatedTable){
        int numOfRow = generatedTable[0].length;
        log.print("TruthTable");
        // Print out the header
        for(int z = 0 ; z < header.length; z++){
            System.out.print(header[z] + "\t");
        }
        System.out.println();
        // Populate one row at a time
        // n is the row number, m is column number
        for(int m = 0; m < numOfRow; m++){
            for(int n = 0; n < header.length; n++){
                System.out.print(generatedTable[n][m] + "\t");
            }
            System.out.println();
        }
    }
    
}
