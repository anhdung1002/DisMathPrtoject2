public class ProjectOne {
    static Logger log = new Logger();
    public static void main(String[] args) {

        // LogicExec logic = new LogicExec();

        // Get number of p's from args[0]
        int userNumInput = Integer.parseInt(args[0]);

        // Create an array with p1 to pn to be the table header
        String [] pSequence = new String [userNumInput];
        for(int p = 0; p < userNumInput; p++){
            pSequence[p] = "p" + (p+1);
        }
        
        // Generate the truth table
        String [][] myTruthTable = TruthTable.setup(userNumInput);
        printTable(pSequence, myTruthTable);













        // int numberOfPeople = names.length;
        // int numberOfTruthValues = (int)Math.pow(2, numberOfPeople);
        
        // // This breaks down the truth table for individual name
        // // to make it easy to perform the logical operations
        // String[] p = myTruthTable[0];   //Paul
        // String[] q = myTruthTable[1];   //Quinn
        // String[] r = myTruthTable[2];   //Ray
        // String[] s = myTruthTable[3];   //Steve
        // String[] t = myTruthTable[4];   //Todd

        // String[][] resultTable = new String[numberOfPeople][numberOfTruthValues];
        // // Paul says, “Ray is guilty.”
        // String[] stm1 = logic.biDirExec(p, logic.notExec(r));
        // resultTable[0] = stm1;
        // // Quinn says, “If Steve is guilty, then so is Ray.”
        // String[] stm2 = logic.biDirExec(q,logic.impliExec(logic.notExec(s), logic.notExec(r)));
        // resultTable[1] = stm2;
        // // Ray says, “Both Steve and Todd are guilty.”
        // String[] stm3 = logic.biDirExec(r,logic.andExec(logic.notExec(s), logic.notExec(t)));
        // resultTable[2] = stm3;
        // // Steve says, “Both Quinn and Ray are guilty.”
        // String[] stm4 = logic.biDirExec(s,logic.andExec(logic.notExec(q), logic.notExec(r)));
        // resultTable[3] = stm4;
        // // Todd says, “At least one of Paul or Ray is guilty.”
        // String[] stm5 = logic.biDirExec(t,logic.orExec(logic.notExec(p), logic.notExec(r)));
        // resultTable[4] = stm5;
    
        // Print out the results for debug //
        // System.out.println();
        // for(int m = 0; m < numberOfTruthValues; m++){
        //     for(int n = numberOfPeople - 1; n >= 0; n--){
        //         System.out.print(resultTable[n][m] + "\t");
        //     }
        //     System.out.println();
        // }


        // int answerCol = -1;
        // for(int i = 0; i < numberOfTruthValues; i++){
        //     int truthCount = 0;
        //     for(int j = 0; j < numberOfPeople; j++){
        //         if(resultTable[j][i] == "T")
        //             truthCount++;
        //     }
        //     if(truthCount == numberOfPeople)
        //         answerCol = truthCount+1;
        // }
        // log.print("Answer is in row: " + answerCol);

        // for(int l = 0; l < numberOfPeople; l++){
        //     printResult(names[l], myTruthTable[l][answerCol]);
        // }
    }
    static void printTable(String [] header, String [][] generatedTable){



        int numOfRow = (int) Math.pow(2, header.length);

        log.print("TruthTable from MAIN");
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

    static void printResult(String name, String truthVal){
        if(truthVal == "T"){
            System.out.println(name + " is innocent.");
        }        
        else if(truthVal == "F"){
            System.out.println(name + " is guilty");
        }
    }
    
}
