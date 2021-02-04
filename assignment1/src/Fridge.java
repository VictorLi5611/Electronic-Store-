public class Fridge {
    double size;
    boolean freezer;
    String colour;


    //Three parameter
    public Fridge(double s, boolean f, String c){
        size = s;
        freezer = f;
        colour = c;
    }

    public String toString(){
        String type;
        if (freezer){
            type = "with Freezer ";
        }else{
            type = "";
        }
        return size + " cubic foot Fridge " + type + "(" + colour +")";
    }
}
