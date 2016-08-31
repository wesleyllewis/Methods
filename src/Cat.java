/**
 * Qualities of being a cat
 */
public class Cat {                              //class for some of the qualities of cats

    private String color;
    private int ageYears;
    private String name;
    private boolean isFluffy;

    public Cat(){

    }
    public Cat(String color, int ageYears, String name, boolean isFluffy){
        this.color = color;                     //constructor for qualities of cats
        this.ageYears = ageYears;
        this.name = name;
        this.isFluffy = isFluffy;
    }
    public void setColor(String color){         //setter for color

        this.color = color;
    }
    public String getColor(){                   //getter for color

        return color;
    }
    public void setAgeYears(int ageYears){      //setter with constraints for ageYears
        if(ageYears < 0 ){
            this.ageYears = ageYears;
        }
    }
    public int getAgeYears(){                   //getter for ageYears

        return ageYears;
    }
    public void getName(String name){           //setter for name

        this.name = name;
    }
    public String getName(){                    //setter for name

        return name;
    }
    public void setIsFluffy(boolean isFluffy){  //setter for isFluffy

        this.isFluffy = isFluffy;
    }
    public boolean getIsFluffy(){               //getter for isFluffy

        return isFluffy;
    }

}
