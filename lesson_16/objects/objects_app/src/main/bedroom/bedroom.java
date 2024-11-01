public class bedroom {
    //enum for bed sizes
       enum MattressSize { 
        TWIN, QUEEN, KING
    }


    // Member variables
    private int numberOfWalls;
    private int numberOfWindows;
    private String colorOfWall;
    private boolean isOutletWorking;
    private MattressSize bedSize;


 
   // HashMap<String,String>drawers; 
    //code 14 to 17 put lines

    // drawers.put("Drawer1", "Shirts");
    // drawers.put("Drawer2", "Socks"); 
    // drawers.put("Drawer3", "PJs");
    // drawers.put("Drawer4", "Underwear");

//Constructor
    public Bedroom(int numberOfWalls, int numberOfWindows, String colorOfWall, boolean isOutletWorking, MattressSize bedSize) {
        this.numberOfWalls = numberOfWalls;
        this.numberOfWindows = numberOfWindows;
        this.colorOfWall = colorOfWall;
        this.isOutletWorking = isOutletWorking;
        this.bedSize = bedSize;
    }
    
//Getters and Setters for each member variable
    public int getNumberOfWalls() {
         return numberOfWalls;
    }
    public void setNumberOfWalls(int numberOfWalls) { 
        this.numberOfWalls=numberOfWalls;
    }
    public int getNumberOfWindows() { 
        return numberOfWindows;
    }
    public void setNumberOfWindows(int numberOfWindows) { 
        this.numberOfWindows=numberOfWindows;
    }
    public String getColorOfWall() { 
        return ColorOfWall; 
    }
    public void setColorOfWall(String colorOfWall) { 
        this.colorOfWall=colorOfWall;
    }
    public boolean isOutletWorking() { 
        return isOutletWorking;
    }
    public void setOutletWorking(boolean outletWorking) { 
        isOutletWorking=outletWorking;
    }
    public MattressSize getBedSize() {
        return bedSize;
    }
    public void setBedSize(MattressSize bedSize) { 
        this.bedSize=bedSize;
    }

} 
}
