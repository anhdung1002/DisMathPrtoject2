public class TruthTable {
    static Logger log = new Logger();

    static public String[][] setup(int numOfArgs){

        // Calculate the number of row
        int numOfRow = (int) Math.pow(2, numOfArgs);
    
        // Create a 2-dimensional matrix
        String [][] myTable = new String [numOfArgs][numOfRow];

            for(int i = 0 ; i < numOfArgs; i++){    // Iterate through each column
            int groupSize = (int) Math.pow(2, numOfArgs - 1 -i);    // Compute group size of T or F to populate in each column
            int tracker = groupSize;    // Keep track of when to change the value from T to F when populating the truth table
            String valToInsert = "T";   // Initial value set to T
            for(int j = 0; j < numOfRow; j++){  // Iterate through each row
                if(j < tracker){
                    myTable[i][j] = valToInsert;    // Insert truth values
                }
                else{
                    if(valToInsert == "T"){         // Switch true values when tracker variable changes
                        valToInsert = "F";
                    }
                    else{
                        valToInsert = "T";
                    }
                    myTable[i][j] = valToInsert;
                    tracker = tracker + groupSize;
                }
            }
        }
        return myTable;
    }
    
}
