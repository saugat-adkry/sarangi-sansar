
public class InstrumentToRent extends Instrument {
    private int ChargePerDay;
    private String DateOfRent;
    private String DateOfReturn;
    private int NumberOfDays;
    private boolean IsRented;

    public InstrumentToRent(String InstrumentName, int ChargePerDay) {
        super(InstrumentName);
        this.ChargePerDay = ChargePerDay;
        this.DateOfRent = "";
        this.DateOfReturn = "";
        this.NumberOfDays = 0;
        this.IsRented = false;
    }

    // getter and setters

//This is the setter method
    public void SetChargePerDAY(int ChargePerDay) {
        this.ChargePerDay= ChargePerDay;
    }

//This is the getter method
    public int GetChargePerDAY() {
        return this.ChargePerDay;
    }

//This is the setter method
    public void SetDateOfRENT(String DateOfRent) {
       this.DateOfRent= DateOfRent;
    }

//This is the getter method
    public String GetDateOfRENT() {
        return this.DateOfRent;
    }

//This is the setter method
    public void SetDateOfRETURN(String DateOfReturn) {
       this.DateOfReturn= DateOfReturn;
    }

//This is the getter method
    public String GetDateOfRETURN() {
        return this.DateOfReturn;
    }

//This is the setter method
    public void SetNoOfDAYS(int NumberOfDays) {
       this.NumberOfDays=NumberOfDays;
    }

//This is the getter method
    public int GetNoOfDAYS() {
        return this.NumberOfDays;
    }

//This is the setter method
    public void SetIsRENTED(boolean IsRented) {
       this.IsRented= IsRented;
    }

//This is the getter method
    public boolean GetIsRENTED() {
        return this.IsRented;
    }

    // this is the renting method
    public void RENT(String CustomerName, String Phone, int PAN, String DateOfRent, String DateOfReturn, int NumberOfDays) {
        if (IsRented == true) {
            System.out.println("This Instrument is already rented.");
            System.out.println("Details of the customer is listed below : ");
            System.out.println("Customer's Name : " + CustomerName);
            System.out.println("Customer's Contact Number : " + Phone);
            System.out.println("Rented Date : " + DateOfReturn);
        } else {
            super.SetCustomerName(CustomerName);
            super.SetCustomerMobileNum(Phone);
            super.SetPAN(PAN);
            this.DateOfRent = DateOfRent;
            this.DateOfReturn = DateOfReturn;
            this.NumberOfDays = NumberOfDays;
            this.IsRented = true;
            System.out.println("CONGRATULATIONS ! The instrument is successfully rented. ");
            System.out.println("The Details of the Customer are listed below: ");
            System.out.println("Customer's Name : " + super.GetCustomerName());
            System.out.println("Customer's Contact Number : " + super.GetCustomerMobileNum());
            System.out.println("Rented Date : " + this.DateOfRent);
            System.out.println("Days left to Return : " + this.NumberOfDays);
            System.out.println("Return Date : " + this.DateOfReturn);
            System.out.println("Total charge : " + this.NumberOfDays * this.ChargePerDay); /*it displays total charge by multiplying number of days left
            to return  and  charge per day */
        }
    }

//this is the instrument returning function
    public void ReturnInstrument(){
        if(IsRented==true){
            super.SetCustomerName("");//calling setter method from super class
            super.SetCustomerMobileNum("");//calling setter method from super class
            super.SetPAN(0);//calling setter method from super class
            this.DateOfRent = "";
            this.DateOfReturn = "";
            this.NumberOfDays = 0;
            this.IsRented = false; 
        }else{
            System.out.println("Currently this instrument is not in our rental list !");
        }
    }

//this is the display method
    public void DISPLAY() {
        super.Display();//calling display method from super class
        if (IsRented == true) {
            System.out.println("Rented Date : " + super.GetCustomerName());
            System.out.println("Customer's Contact Number : " + super.GetCustomerMobileNum());
            System.out.println("Rented Date : " + this.DateOfRent);
            System.out.println("Days left to Return : " + this.NumberOfDays);
            System.out.println("Return Date : " + this.DateOfReturn);
        }
    }
}
