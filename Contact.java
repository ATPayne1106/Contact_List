
/**
 * Abstract class search - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Contact
{
    protected String name;
    protected String address;
    protected String number;
    protected String occupation;
    public static int numContacts = 0;
    
    public Contact(){
        this("none");
    }
    
    public Contact(String name){
        this(name, "none");
    }
    
    public Contact(String name, String address){
        this(name, address, "none");
    }
    
    public Contact(String name, String address, String number){
        this(name, address, number, "none");
    }
    
    public Contact(String name, String address, String number, String occupation){
        this.name = name;
        this.address = address;
        this.number = number;
        this.occupation = occupation;
        numContacts++;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setAddress(String address){
        this.address = address;
    }
    
    public String getAddress() {
        return this.address;
    }
    
    public void setNumber(String number){
        this.number = number;
    }
    
    public String getNumber() {
        return this.number;
    }
    
    public void setOccupation(String occupation){
        this.occupation = occupation;
    }
    
    public String getOccupation() {
        return this.occupation;
    }
    
    @Override
    public String toString(){
        return this.name+": "+this.address+": "+this.number+": "+this.occupation;
    }
    /**
    public abstract String eat();
    
    public abstract String makeNoise();
    
    public abstract String play();
    **/
}