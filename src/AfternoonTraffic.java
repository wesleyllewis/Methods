/**
 * Afternoon Traffic
 */
public class AfternoonTraffic {                                     //class for AfternoonTraffic

    private boolean activeConstruction;
    private int numberMiles;
    private boolean isTrafficJammed;
    private int[] interstates = {24, 40, 65};

    public AfternoonTraffic(){

    }
    public AfternoonTraffic(boolean activeConstruction, int numberMiles, boolean isTrafficJammed, int[] interstates){
        this.activeConstruction = activeConstruction;               //constructor for AfternoonTraffic
        this.numberMiles = numberMiles;
        this.isTrafficJammed = isTrafficJammed;
        this.interstates = interstates;
    }
    public void setActiveConstruction(boolean activeConstruction){  //setter for activeConstruction

        this.activeConstruction = activeConstruction;
    }
    public boolean getActiveConstruction(){                         //getter for activeConstruction

        return activeConstruction;
    }
    public void setNumberMiles(int numberMiles){                    //setter for numberMiles

        this.numberMiles = numberMiles;
    }
    public int getNumberMiles(){                                    //getter for numberMiles

        return numberMiles;
    }
    public void setIsTrafficJammed(boolean isTrafficJammed){        //setter with constraints for isTrafficJammed
        this.isTrafficJammed = isTrafficJammed;
        if(activeConstruction){
            isTrafficJammed = true;
        }
    }
    public boolean getIsTrafficJammed(){                             //getter for isTrafficJammed

        return isTrafficJammed;
    }
    public void setInterstates(int[] interstates){                   //setter for interstates

        this.interstates = interstates;
    }
    public int[] getInterstates(){                                   //getter for interstates

        return interstates;
    }
}
