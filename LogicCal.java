public class LogicCal {
    
    static public String not(String var){
        String rVal="Some inputs entered. Use 'T' or 'F'";
        if(var == "T"){
            rVal = "F";
        }
        else if( var == "F"){
            rVal = "T";
        }
        return rVal;
    }
    static public String impli(String var1, String var2){
        String rVal="Some inputs entered. Use 'T' or 'F'";

        if(var1 == "T" && var2 == "T"){
            rVal = "T";
        }
        else if(var1 == "T" && var2 == "F"){
            rVal = "F";
        }
        else if(var1 == "F" && var2 == "T"){
            rVal = "T";
        }
        else if(var1 == "F" && var2 == "F"){
            rVal = "T";
        }
        return rVal;
    }

    static public String and(String var1, String var2){
        String rVal="Some inputs entered. Use 'T' or 'F'";

        if(var1 == "T" && var2 == "T"){
            rVal = "T";
        }
        else if(var1 == "T" && var2 == "F"){
            rVal = "F";
        }
        else if(var1 == "F" && var2 == "T"){
            rVal = "F";
        }
        else if(var1 == "F" && var2 == "F"){
            rVal = "F";
        }
        return rVal;
    }

    static public String or(String var1, String var2){
        String rVal="Some inputs entered. Use 'T' or 'F'";

        if(var1 == "T" && var2 == "T"){
            rVal = "T";
        }
        else if(var1 == "T" && var2 == "F"){
            rVal = "T";
        }
        else if(var1 == "F" && var2 == "T"){
            rVal = "T";
        }
        else if(var1 == "F" && var2 == "F"){
            rVal = "F";
        }
        return rVal;
    }

    static public String biDir(String var1, String var2){
        String rVal="Some inputs entered. Use 'T' or 'F'";

        if(var1 == "T" && var2 == "T"){
            rVal = "T";
        }
        else if(var1 == "T" && var2 == "F"){
            rVal = "F";
        }
        else if(var1 == "F" && var2 == "T"){
            rVal = "F";
        }
        else if(var1 == "F" && var2 == "F"){
            rVal = "T";
        }
        return rVal;
    }

}
