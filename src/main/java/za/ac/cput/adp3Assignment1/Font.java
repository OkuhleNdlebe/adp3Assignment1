package za.ac.cput.adp3Assignment1;

public class Font {
    private String type, type1;

    public Font() {}

    public Font(String type, String type1)
    {
        this.type = type;
        this.type= type1;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType1() {
        return type1;
    }

    public void setType1(String type1) {
        this.type1 = type1;
    }

    @Override
    public String toString() {
        return "Font{" +
                "type='" + type + '\'' +
                ", type1='" + type1 + '\'' +
                '}';
    }
}
