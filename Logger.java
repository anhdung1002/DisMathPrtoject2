public class Logger {
    static public void print(Object var){
        System.out.println(var);
    }

    static public void showArr(String [] varIn){
        for(int i = 0; i < varIn.length; i++){
            System.out.println(varIn[i]);
        }
    }
}
