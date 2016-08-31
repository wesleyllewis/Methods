/**
 * Created by WesleyLewis on 8/29/16.
 */
public class Gizmo {                                    //the qualities of a gizmo from gremlins

    private boolean isCute;
    private boolean doFeedAfterMidnight;
    private boolean isGremlin;
    private boolean isMogwai;

    public Gizmo(){

    }
    public Gizmo(boolean isCute, boolean doFeedAfterMidnight, boolean isGremlin, boolean isMogwai){
        this.isCute = isCute;
        this.doFeedAfterMidnight = doFeedAfterMidnight; //a constructor for the qualities of gizmo the mogwai
        this.isGremlin = isGremlin;
        this.isMogwai = isMogwai;
    }

    public void setIsCute(boolean isCute){              //setter for isCute

        this.isCute = isCute;
    }
    public boolean getIsCute(){                         //getter for isCute

        return isCute;
    }
    public void setDoFeedAfterMidnight(boolean doFeedAfterMidnight){//setter for doFeedAfterMidnight

        this.doFeedAfterMidnight = doFeedAfterMidnight;
    }
    public boolean getDoFeedAfterMidnight(){            //getter for doFeedAfterMidnight

        return doFeedAfterMidnight;
    }
    public void setIsGremlin(boolean isGremlin){        //setter for isGremlin

        this.isGremlin = isGremlin;
    }
    public boolean getIsGremlin(){                      //getter for isGremlin

        return isGremlin;
    }
    public void setIsMogwai(boolean isMogwai){          //setter with constraints for isMogwai
        this.isMogwai = isMogwai;

        if(isGremlin){
            isMogwai = false;
        }
    }
    public boolean getIsMogwai(){                       //getter for isMogwai

        return isMogwai;
    }
}
