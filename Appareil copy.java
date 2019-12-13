import java.util.ArrayList;
import java.util.List;
import java.util.Set;


public class Appareil extends Object {
    public DeclAppType type;
    public String varName;
    public String typeMc;
    public List<String> defTypeListApp;
    Appareil(DeclAppType type,String varName,String typeMc){
        this.type = type;
        this.varName = varName;
        this.typeMc = typeMc;
    }
    Appareil(DeclAppType type,String varName,List<String> defTypeListApp){
        this.type = type;
        this.varName = varName;
        this.defTypeListApp = defTypeListApp;
    }

    @Override
    public String toString(){
        return this.varName + " "+ this.type;
    }

}

class VariableAlreadyDeclaredException extends Exception {
    public VariableAlreadyDeclaredException (String errorMessage){
        super(errorMessage);
    }
}


class WrongDateFormatException extends Exception {
    public WrongDateFormatException(String errorMessage){
        super(errorMessage);
    }
}

class UndeclaredVarException extends Exception {
    public UndeclaredVarException(String errorMessage){
        super(errorMessage);
    }
}