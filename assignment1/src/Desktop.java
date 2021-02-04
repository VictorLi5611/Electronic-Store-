public class Desktop {
    double cpuSpeed;
    int ram;
    int storage;
    boolean SSD;


    // This is a 4-parameter constructor
    public Desktop(Double c, Integer r, Integer s, Boolean t){
        cpuSpeed = c;
        ram = r;
        storage = s;
        SSD = t;
    }


    //This returns a String representation
    public String toString() {
        String type;
        if (SSD){
            type = "SSD";
        }else{
            type = "HDD";
        }

        return "Desktop PC with " + cpuSpeed + "ghz CPU, " + ram + "GB RAM, " + storage + "GB " + type +" drive." ;
    }


}
