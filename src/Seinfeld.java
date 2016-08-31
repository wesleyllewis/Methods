/**
 * Determines whether or not TV is worth watching.
 */
public class Seinfeld {                                   //class for a show about nothing

    private boolean onAir;
    private double whatTime;
    private boolean isWorthWatching;
    private String whatChannel;

    public Seinfeld(){

    }
    public Seinfeld(boolean onAir, double whatTime, boolean isWorthWatching, String whatChannel){
        this.onAir = onAir;
        this.whatTime = whatTime;
        this.isWorthWatching = isWorthWatching;             //a constructor for Seinfeld
        this.whatChannel = whatChannel;
    }
    public void setOnAir(boolean onAir){                    //setter for onAir

        this.onAir = onAir;
    }
    public boolean getOnAir(){                              //getter for onAir

        return onAir;
    }
    public void setWhatTime(double whatTime){               //setter with constraints for whatTime

        if(whatTime != 3.00){
            this.whatTime = whatTime;
        }
    }
    public double getWhatTime(){                            //getter for whatTime

        return whatTime;
    }
    public void setIsWorthWatching(boolean isWorthWatching){//setter for isWorthWatching

        this.isWorthWatching = isWorthWatching;
    }
    public boolean getIsWorthWatching(){                    //getter for isWorthWatching
        return
                isWorthWatching;
    }
    public void setWhatChannel(String whatChannel){         //setter for whatChannel

        this.whatChannel = whatChannel;
    }
    public String getWhatChannel(){                         //getter for whatChannel

        return whatChannel;
    }
}
