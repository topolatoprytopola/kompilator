public class Type {
    private String type;
    private String var;
    Type(String type, String var)
    {
        this.var = var;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getVar() {
        return var;
    }

    public void setVar(String var) {
        this.var = var;
    }
}
