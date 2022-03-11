public class TruthTable {
    static Logger log = new Logger();

    static public String[][] setup(int numOfArgs){

        // Calculate the number of row
        int numOfRow = (int) Math.pow(2, numOfArgs);
        // Create an array with Pn
        String [] pSequence = new String [numOfArgs];
        for(int p = 0; p < numOfArgs; p++){
            pSequence[p] = "p"+(p+1);
            log.print(pSequence[p]);
        }








        // Create a 2-dimensional matrix
        String [][] myTable = new String [numOfArgs][numOfRow];

        // for(int i = numOfPeople -1 ; i >= 0; i--){
            for(int i = 0 ; i < numOfArgs; i++){
            int groupSize = (int) Math.pow(2, numOfArgs - 1 -i);
            int tracker = groupSize;
            String valToInsert = "T";
            for(int j = 0; j < numOfRow; j++){
                if(j < tracker){
                    myTable[i][j] = valToInsert;
                }
                else{
                    if(valToInsert == "T"){
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
        // Print out the truth table //
        // log.print("TruthTable");
        // for(int z = 0 ; z < numOfPeople; z++){
        //     System.out.print(vars[z] + "\t");
        // }
        // System.out.println();
        // for(int m = 0; m < numOfRow; m++){
        //     for(int n = 0; n < numOfPeople; n++){
        //         System.out.print(myTable[n][m] + "\t");
        //     }
        //     System.out.println();
        // }

        return myTable;
    }
    
}
