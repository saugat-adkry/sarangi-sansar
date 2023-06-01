public class InstrumentToSell extends Instrument {
    int Price;
    String SellDate;
    int DiscountPercent;
    boolean IsSold;

    InstrumentToSell(String InstrumentName, int Price) {
        super(InstrumentName);
        this.Price = Price;
        this.SellDate = "";
        this.DiscountPercent = 0;
        this.IsSold = false;
    }

// this is the setter method 
    public void SetPRICE(int Price) {
        if (this.IsSold == false) {
            this.Price = Price;
        } else {
            System.out.println("It is not possible to change the price !");
        }
    }

 // this is the getter method 
    public int GetPRICE() {
        return this.Price;
    }

// this is the setter method 
    public void SetSellDATE(String SellDate) {
        this.SellDate = SellDate;
    }

 // this is the getter method 
    public String GetSellDATE() {
        return this.SellDate;
    }

// this is the setter method 
    public void SetDiscountPERCENT(int DiscountPercent) {
        this.DiscountPercent = DiscountPercent;
    }

 // this is the getter method 
    public int GetDiscountPERCENT() {
        return this.DiscountPercent;
    }

// this is the setter method 
    public void SetIsSOLD(boolean IsSold) {
        this.IsSold = IsSold;
    }

 // this is the getter method 
    public boolean GetIsSOLD() {
        return this.IsSold;
    }

    public void SELL(String customerName, String customerPhoneNumber, int PAN, String SellDate,
            int DiscountPercent) {
        if (IsSold == true) {
            System.out.println("This item is already sold.");
            System.out.println("Details of the customer is listed below : ");
            System.out.println("Customer's Name : " + customerName);
            System.out.println("Customer's Contact Number : " + customerPhoneNumber);
            System.out.println("Purchase Date of Product : " + SellDate);
            System.out.println("Customer's PAN number : " + PAN);
        } else {
            this.DiscountPercent = DiscountPercent;
            this.SellDate = SellDate;
            this.IsSold = true;
            super.SetCustomerName(customerName);//calling setter method from super class
            super.SetCustomerMobileNum(customerPhoneNumber);//calling setter method from super class
            super.SetPAN(PAN);//calling setter method from super class
        }
    }

//this is the display method 
    public void DISPLAY() {
        super.Display();
        if (IsSold == true) {
            double discountPercent =this.DiscountPercent; // int to double
            double priceWithoutDiscount = this.Price; // int to double
            // formulae of discount amount
            double discountAmount = (priceWithoutDiscount * discountPercent) / 100;
            // total price of instrument with discount
            double PriceWithDiscount = priceWithoutDiscount - discountAmount;
            // calling the getter method from super class or parent class -> getCustomerName
            System.out.println("The customer's name is " + super.GetCustomerName());
            
            System.out.println("Purchase Date of Product : " + this.SellDate);
            System.out.println("Instrument's Price : " + PriceWithDiscount);
        }
    }
}
