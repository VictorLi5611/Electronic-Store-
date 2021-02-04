public class Laptop {
    double cpuSpeed;
    int ram;
    int storage;
    boolean SSD;
    int screenSize;



    // This is a 5-parameter constructor
    public Laptop(Integer size,Double c, Integer r, Integer st, Boolean t){
        cpuSpeed = c;
        ram = r;
        storage = st;
        SSD = t;
        screenSize = size;
    }



    //This returns a String representation
    public String toString() {
        String type;
        if (SSD){
            type = "SSD";
        }else{
            type = "HDD";
        }

        return screenSize + "\" Laptop PC with "  + cpuSpeed + "ghz CPU, " + ram + "GB RAM, " + storage + "GB " + type +" drive." ;
    }


}

