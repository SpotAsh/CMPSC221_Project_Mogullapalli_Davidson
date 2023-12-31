// people superclass which implements the payable interface
public abstract class People implements Payable {
    // variables
    //name
    private String f_name;
    private String m_name;
    private String l_name;

    private String ID;
    private int phone_number;
    private String email;

    //address
    private String street_number;
    private String city;
    private String state;
    private int zipcode;

    //constructor
    public People(String f_name, String m_name, String l_name, String ID, int phone_number, String email,
                  String street_number, String city, String state, int zipcode){
        this.f_name = f_name;
        this.m_name = m_name;
        this.l_name = l_name;
        this.ID = ID;
        this.phone_number = phone_number;
        this.email = email;
        this.street_number = street_number;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
    }

    //setters and getters
    public void setFName(String fName) { this.f_name = fName; }
    public void setMName(String mName) { this.m_name = mName; }
    public void setLName(String lName) { this.l_name = lName; }
    public void setID(String ID) { this.ID = ID; }
    public void setPhoneNumber(int phoneNumber) { this.phone_number = phoneNumber; }
    public void setEmail(String email) { this.email = email; }
    public void setStreetNumber(String streetNumber) { this.street_number = streetNumber; }
    public void setCity(String city) { this.city = city; }
    public void setState(String state) { this.state = state; }
    public void setZipcode(int zipcode) { this.zipcode = zipcode; }

    public String getFName() { return f_name; }
    public String getMName() { return m_name; }
    public String getLName() { return l_name; }
    public String getID() { return ID; }
    public int getPhoneNumber() { return phone_number; }
    public String getEmail() { return email; }
    public String getStreetNumber() { return street_number; }
    public String getCity() { return city; }
    public String getState() { return state; }
    public int getZipcode() { return zipcode; }

    // implementing payable interface
    @Override
    public void Payment(){
        System.out.println("Payment: ");
    }

    //abstract display method
    public abstract void display();

}
