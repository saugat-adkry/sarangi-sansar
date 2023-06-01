public class Instrument {
    private static int InstrumentID;
    private String InstrumentName;
    private String CustomerName;
    private String CustomerMobileNum;
    private int PAN;

    Instrument(String InstrumentName) {
        this.InstrumentName = InstrumentName;
        InstrumentID++; //instrument ID is set to auto increase by one 
        this.CustomerName = "";
        this.CustomerMobileNum = "";
        this.PAN = 0;
    }
// this is the setter method or mutator method
    public void SetInstrumentId(int InstrumentID) {
        Instrument.InstrumentID = InstrumentID;

    }
// this is the getter method
    public int GetInstrumentId() {
        return Instrument.InstrumentID;
    }

// this is the setter method
    public void SetInstrumentName(String InstrumentName) {
        this.InstrumentName = InstrumentName;
    }

// this is the getter method
    public String GetInstrumentName() {
        return this.InstrumentName;
    }

// this is the setter method
    public void SetCustomerName(String CustomerName) {
        this.CustomerName = CustomerName;
    }

// this is the getter method
    public String GetCustomerName() {
        return this.CustomerName;
    }

// this is the setter method
    public void SetCustomerMobileNum(String CustomerMobileNum) {
        this.CustomerMobileNum = CustomerMobileNum;
    }

// this is the getter method
    public String GetCustomerMobileNum() {
        return CustomerMobileNum;
    }

// this is the setter method
    public void SetPAN(int PAN) {
        this.PAN = PAN;
    }

// this is the getter method
    public int GetPAN() {
        return PAN;
    }

//this is the display method which will display the output
    void Display() {
        System.out.print("we currently have  "+ this.GetInstrumentName()+" in our stock." );
        if (this.CustomerName != "" && this.CustomerMobileNum != "" && this.PAN != 0) {
            System.out.println("The details of our customer is listed below : ");
            System.out.println("ID of the instrument :  " + this.GetInstrumentId() + "\n" + "Name of the instrument :  "
                    + this.GetInstrumentName() + "\n" + "Customer's Name : " + this.GetCustomerName()
                    + "\n" + "Customer's contact No. : " + this.GetCustomerMobileNum() + "\n"
                    + "Customer's PAN no. : " + this.GetPAN());
        } else {
            System.out.println(" The details of the instrument are listed below : ");
            System.out.println("ID of the instrument : " + this.GetInstrumentId() + "\n" + "Name of the instrument : "
                    + this.GetInstrumentName());
        }
    }

}