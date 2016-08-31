/**
 *A basic resume.
 */
public class Resume {  //Class for a basic resume

    private String name;
    private String address;
    private String phone;
    private String workHistory;
    private String workDateRange;
    private String referenceName;
    private String referencePhone;

    public Resume(){

    }
    public Resume(String name, String address, String phone, String workHistory, String workDateRange, String referenceName, String referencePhone){
        this.name = name;
        this.address = address;             //constructor for a very Basic Resume
        this.phone = phone;
        this.workHistory = workHistory;
        this.workDateRange = workDateRange;
        this.referenceName = referenceName;
        this.referencePhone = referencePhone;
    }
    public void setName(String name){       //setter for Name
        if(fullName(name)){
            this.name = name;
        }
    }
    public boolean fullName(String a){
        return (a.contains(" "));           //refatctored from setName
    }
    public String getName(){                //getter for NaME
        return name;
    }
    public void setAddress(String address){ //Setter for name

        this.address = address;
    }
    public String getAddress(){             //getter for name

        return address;
    }
    public void setPhone(String phone){     //setter for phone

        this.phone = phone;
    }
    public String getPhone(){               //getter for phone

        return phone;
    }
    public void setWorkHistory(String workHistory){//setter for workHistoty

        this.workHistory = workHistory;
    }
    public String getWorkHistory(){         //getter for workHistory

        return workHistory;
    }
    public void setWorkDateRange(String workDateRange){//setter for workDateRange

        this.workDateRange = workDateRange;
    }
    public String getWorkDateRange(){       //getter for workDateRane
        return
                workDateRange;
    }
    public void setReferenceName(String referenceName){//setter for referenceName

        this.referenceName = referenceName;
    }
    public String getReferenceName(){      //getter for referenceName

        return referenceName;
    }
    public void setReferencePhone(String referencePhone){//setter for referencePhone

        this.referencePhone = referencePhone;
    }
    public String getReferencePhone(){      //getter for referencePhone

        return referencePhone;
    }

}
