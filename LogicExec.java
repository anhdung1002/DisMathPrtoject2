

public class LogicExec extends LogicCal{
    static public String[] andExec(String[] var1, String[] var2){
        // Make sure the inputs have the same size
        int size = 0;
        if((var1.length) == (var2.length)){
            size = var1.length;
        }
        else{
            System.out.print("Input sizes do not match");
        }

        String[] resultStr = new String [size];
        for(int i = 0; i < size; i++){
            resultStr[i] = and(var1[i], var2[i]);
        }
        return resultStr;
    }

    static public String[] orExec(String[] var1, String[] var2){
        // Make sure the inputs have the same size
        int size = 0;
        if((var1.length) == (var2.length)){
            size = var1.length;
        }
        else{
            System.out.print("Input sizes do not match");
        }

        String[] resultStr = new String [size];
        for(int i = 0; i < size; i++){
            resultStr[i] = or(var1[i], var2[i]);
        }
        return resultStr;
    }

    static public String[] impliExec(String[] var1, String[] var2){
        // Make sure the inputs have the same size
        int size = 0;
        if((var1.length) == (var2.length)){
            size = var1.length;
        }
        else{
            System.out.print("Input sizes do not match");
        }

        String[] resultStr = new String [size];
        for(int i = 0; i < size; i++){
            resultStr[i] = impli(var1[i], var2[i]);
        }
        return resultStr;
    }

    static public String[] biDirExec(String[] var1, String[] var2){
        // Make sure the inputs have the same size
        int size = 0;
        if((var1.length) == (var2.length)){
            size = var1.length;
        }
        else{
            System.out.print("Input sizes do not match");
        }

        String[] resultStr = new String [size];
        for(int i = 0; i < size; i++){
            resultStr[i] = biDir(var1[i], var2[i]);
        }
        return resultStr;
    }

    static public String[] notExec(String[] var1){
        // Make sure the inputs have the same size
        int size = var1.length;
        String[] resultStr = new String [size];
        for(int i = 0; i < size; i++){
            resultStr[i] = not(var1[i]);
        }
        return resultStr;
    }












}
