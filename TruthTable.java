public class TruthTable {
    static Logger log = new Logger();

    static public String[][] setup(String [] vars){

        int numOfPeople = vars.length;
        int numOfRow = (int) Math.pow(2, numOfPeople);
        // Create a 2x2 matrix
        String [][] myTable = new String [numOfPeople][numOfRow];

        // for(int i = numOfPeople -1 ; i >= 0; i--){
            for(int i = 0 ; i < numOfPeople; i++){
            int groupSize = (int) Math.pow(2, numOfPeople - 1 -i);
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
        log.print("TruthTable");
        for(int z = 0 ; z < numOfPeople; z++){
            System.out.print(vars[z] + "\t");
        }
        System.out.println();
        for(int m = 0; m < numOfRow; m++){
            for(int n = 0; n < numOfPeople; n++){
                System.out.print(myTable[n][m] + "\t");
            }
            System.out.println();
        }

        return myTable;
    }
    
}
