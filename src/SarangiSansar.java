import javax.swing.*;
import javax.swing.border.TitledBorder;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class SarangiSansar {

    ArrayList<Instrument> instrumentList = new ArrayList<>();

    final static int EMPTY = -1;
    final static int INVALID = -2;
    int checkNegative = 1;
    String checkValidity = "valid";

    private JFrame frame;

    private JLabel sarangiSansar, instrumentName1, chargePerDay, instrumentName2, price, costumerName,
            rentInstrumentName, costumerPhoneNum, costumerPAN, dateOfRent, dateOfReturn, rentingDays, instrumentName3,
            costumerName2,
            costumerPhoneNum2, costumerPAN2, sellingDate, discountPercent, returnInstrument;


    private JPanel  addInstruments, instrumentToRentPanel, instrumentToSellPanel, returnInstrumetnPanel;

    private JTextField instrumentNameTf1, chargePerDayTf, instrumentNameTf2, priceTf, costumerNameTf,
            rentInstrumentNameTf, costumerPhoneNumTf, costumerPANTf, rentingDaysTf, sellInstrumentNameTf,
            costumerNameTf2,
            costumerPhoneNumTf2, costumerPANTf2, discountPercentTf, returnInstrumentTf;

    private JButton addForRent, addForSale, rent, display, sell, display2, returnIns, clear;

    private JComboBox<String> dayRent, monthRent, yearRent, daySell, monthSell, yearSell, rDay, rMonth, rYear;

    // making constructor of class SarangiSansar
    public SarangiSansar() {

        // dates
        String days[] = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17",
                "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" };
        String months[] = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "July", "Aug", "Sep", "Oct", "Nov", "Dec" };
        String years[] = { "2022", "2023", "2024", "2025" ,"2026","2027","2028","2029","2030"};

        // color
        Color color1 = new Color(252, 82, 63);

        // making frame
        frame = new JFrame();
        frame.setTitle("Sarangi Sansar ");
        Image icon = Toolkit.getDefaultToolkit().getImage(".\\images\\sarangiIcon.png");
        frame.setIconImage(icon);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        

        // adding Label Sarangi Sansar
        sarangiSansar = new JLabel("Sarangi Sansar 🎻");
        sarangiSansar.setSize(180, 25);
        sarangiSansar.setLocation(635, 5);
        sarangiSansar.setFont(new Font("SANS_SERIF", Font.BOLD, 19));
        frame.add(sarangiSansar);

        // adding clear button
        clear = new JButton("clear");
        clear.setBounds(985, 625, 100, 30);
        clear.setFocusPainted(false);
        clear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                clear();
            }
        });
        frame.add(clear);

        // adding add instruments panel
        addInstruments = new JPanel();
        addInstruments.setBounds(270, 40, 830, 120);
        addInstruments.setBackground(color1);
        addInstruments.setLayout(null);

        TitledBorder addInstrumentsTb = BorderFactory.createTitledBorder(
                "Add Instruments for Rent or Sell");
        addInstrumentsTb.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        addInstrumentsTb.setTitleJustification(TitledBorder.CENTER);
        addInstruments.setBorder(addInstrumentsTb);
        frame.add(addInstruments);

        // adding instrumentName1 lable and text field
        instrumentName1 = new JLabel(" Instrument Name");
        instrumentName1.setBounds(30, 20, 150, 30);
        addInstruments.add(instrumentName1);

        instrumentNameTf1 = new JTextField();
        instrumentNameTf1.setBounds(180, 20, 150, 30);
        addInstruments.add(instrumentNameTf1);

        // adding charge per day lable and text field
        chargePerDay = new JLabel(" Charge per day");
        chargePerDay.setBounds(360, 20, 150, 30);
        addInstruments.add(chargePerDay);

        chargePerDayTf = new JTextField();
        chargePerDayTf.setBounds(510, 20, 150, 30);
        addInstruments.add(chargePerDayTf);

        // adding Add for rent button
        addForRent = new JButton("add for rent");
        
        addForRent.setBounds(690, 20, 100, 30);
        addForRent.setFocusPainted(false);
        addForRent.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addForRentHandler();
            }
        });
        addInstruments.add(addForRent);

        // adding second instrument Name lable and text field
        instrumentName2 = new JLabel(" Instrument Name ");
        instrumentName2.setBounds(30, 70, 150, 30);
        addInstruments.add(instrumentName2);

        instrumentNameTf2 = new JTextField();
        instrumentNameTf2.setBounds(180, 70, 150, 30);
        addInstruments.add(instrumentNameTf2);

        // adding price lable and text field
        price = new JLabel(" Price");
        price.setBounds(360, 70, 150, 30);
        addInstruments.add(price);

        priceTf = new JTextField();
        priceTf.setBounds(510, 70, 150, 30);
        addInstruments.add(priceTf);

        // adding Add for sell button
        addForSale = new JButton("add for sell");
        addForSale.setBounds(690, 70, 100, 30);
        addForSale.setFocusPainted(false);
        addForSale.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addForSellHandler();
            }
        });
        addInstruments.add(addForSale);

        // adding instrument to rent panel
        instrumentToRentPanel = new JPanel();
        instrumentToRentPanel.setBounds(270, 170, 400, 420);
        instrumentToRentPanel.setBackground(color1);
        // adding titled border around panel
        TitledBorder rentInstruments = BorderFactory.createTitledBorder(
                "Rent Instruments");
        rentInstruments.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        rentInstruments.setTitleJustification(TitledBorder.CENTER);
        instrumentToRentPanel.setBorder(rentInstruments);
        instrumentToRentPanel.setLayout(null);
        frame.add(instrumentToRentPanel);

        // adding instrument name label and text field
        rentInstrumentName = new JLabel(" Instrument Name");
        rentInstrumentName.setBounds(30, 20, 150, 30);
        instrumentToRentPanel.add(rentInstrumentName);

        rentInstrumentNameTf = new JTextField();
        rentInstrumentNameTf.setBounds(200, 20, 170, 30);
        instrumentToRentPanel.add(rentInstrumentNameTf);

        // adding costumer name label and text field
        costumerName = new JLabel(" Costumer Name ");
        costumerName.setBounds(30, 70, 150, 30);
        instrumentToRentPanel.add(costumerName);

        costumerNameTf = new JTextField();
        costumerNameTf.setBounds(200, 70, 170, 30);
        instrumentToRentPanel.add(costumerNameTf);

        // adding costumer phone number label and text field
        costumerPhoneNum = new JLabel(" Phone Number");
        costumerPhoneNum.setBounds(30, 120, 150, 30);
        instrumentToRentPanel.add(costumerPhoneNum);

        costumerPhoneNumTf = new JTextField();
        costumerPhoneNumTf.setBounds(200, 120, 170, 30);
        instrumentToRentPanel.add(costumerPhoneNumTf);

        // adding costumer PAN label and text field
        costumerPAN = new JLabel(" Costumer's PAN ");
        costumerPAN.setBounds(30, 170, 150, 30);
        instrumentToRentPanel.add(costumerPAN);

        costumerPANTf = new JTextField();
        costumerPANTf.setBounds(200, 170, 170, 30);
        instrumentToRentPanel.add(costumerPANTf);

        // adding Date of rent label
        dateOfRent = new JLabel(" Date of rent");
        dateOfRent.setBounds(30, 220, 150, 30);
        instrumentToRentPanel.add(dateOfRent);

        // adding Combo Boxes for date of rent
        dayRent = new JComboBox<>(days);
        monthRent = new JComboBox<>(months);
        yearRent = new JComboBox<>(years);

        dayRent.setBounds(200, 220, 40, 30);
        monthRent.setBounds(250, 220, 50, 30);
        yearRent.setBounds(310, 220, 60, 30);

        instrumentToRentPanel.add(dayRent);
        instrumentToRentPanel.add(monthRent);
        instrumentToRentPanel.add(yearRent);

        // adding Date of return label
        dateOfReturn = new JLabel(" Date of return");
        dateOfReturn.setBounds(30, 270, 150, 30);
        instrumentToRentPanel.add(dateOfReturn);

        // adding JComBoxes for date of return
        rDay = new JComboBox<>(days);
        rMonth = new JComboBox<>(months);
        rYear = new JComboBox<>(years);

        rDay.setBounds(200, 270, 40, 30);
        rMonth.setBounds(250, 270, 50, 30);
        rYear.setBounds(310, 270, 60, 30);

        instrumentToRentPanel.add(rDay);
        instrumentToRentPanel.add(rMonth);
        instrumentToRentPanel.add(rYear);

        // adding Renting Days label and text field
        rentingDays = new JLabel(" Total Renting Days");
        rentingDays.setBounds(30, 320, 150, 30);
        instrumentToRentPanel.add(rentingDays);

        rentingDaysTf = new JTextField();
        rentingDaysTf.setBounds(200, 320, 75, 30);
        instrumentToRentPanel.add(rentingDaysTf);

        // adding rent instrument button
        rent = new JButton("Rent");
        rent.setBounds(295, 370, 75, 30);
        rent.setFocusPainted(false);
        rent.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                rentInstrumentHandler();
            }
        });
        instrumentToRentPanel.add(rent);

        // adding display button
        display = new JButton("Display");
        display.setBounds(30, 370, 75, 30);
        display.setFocusPainted(false);
        display.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (instrumentList.size() > 0) {
                    for (int i = 0; i < instrumentList.size(); i++) {
                        if (instrumentList.get(i) instanceof InstrumentToRent) {
                            InstrumentToRent obj = (InstrumentToRent) instrumentList.get(i);
                            obj.DISPLAY();
                        }
                    }
                } else {
                    System.out
                            .println("the instrument is either not rented or not added for renting");
                }
            }
        });
        instrumentToRentPanel.add(display);

        // adding instrument to sell panel
        instrumentToSellPanel = new JPanel();
        instrumentToSellPanel.setBounds(700, 170, 400, 420);
        instrumentToSellPanel.setBackground(color1);
        // adding titled border around panel
        TitledBorder sellInstruments = BorderFactory.createTitledBorder(
                "Sell Instruments");
        sellInstruments.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        sellInstruments.setTitleJustification(TitledBorder.CENTER);
        instrumentToSellPanel.setBorder(sellInstruments);
        instrumentToSellPanel.setLayout(null);
        frame.add(instrumentToSellPanel);

        // adding instrument name label and text field
        instrumentName3 = new JLabel(" Instrument Name");
        instrumentName3.setBounds(30, 20, 150, 30);
        instrumentToSellPanel.add(instrumentName3);

        sellInstrumentNameTf = new JTextField();
        sellInstrumentNameTf.setBounds(200, 20, 170, 30);
        instrumentToSellPanel.add(sellInstrumentNameTf);

        // addign costumer name label and text field
        costumerName2 = new JLabel(" Costumer Name ");
        costumerName2.setBounds(30, 70, 150, 30);
        instrumentToSellPanel.add(costumerName2);

        costumerNameTf2 = new JTextField();
        costumerNameTf2.setBounds(200, 70, 170, 30);
        instrumentToSellPanel.add(costumerNameTf2);

        // adding costumer phone number label and text field
        costumerPhoneNum2 = new JLabel(" Phone Number");
        costumerPhoneNum2.setBounds(30, 120, 150, 30);
        instrumentToSellPanel.add(costumerPhoneNum2);

        costumerPhoneNumTf2 = new JTextField();
        costumerPhoneNumTf2.setBounds(200, 120, 170, 30);
        instrumentToSellPanel.add(costumerPhoneNumTf2);

        // adding costumer PAN label and text field
        costumerPAN2 = new JLabel(" Costumer's PAN ");
        costumerPAN2.setBounds(30, 170, 150, 30);
        instrumentToSellPanel.add(costumerPAN2);

        costumerPANTf2 = new JTextField();
        costumerPANTf2.setBounds(200, 170, 170, 30);
        instrumentToSellPanel.add(costumerPANTf2);

        // adding selling Date label
        sellingDate = new JLabel(" Sell Date");
        sellingDate.setBounds(30, 220, 150, 30);
        instrumentToSellPanel.add(sellingDate);

        // adding Combo Boxes for selling date
        daySell = new JComboBox<>(days);
        monthSell = new JComboBox<>(months);
        yearSell = new JComboBox<>(years);

        daySell.setBounds(200, 220, 40, 30);
        monthSell.setBounds(250, 220, 50, 30);
        yearSell.setBounds(310, 220, 60, 30);

        instrumentToSellPanel.add(daySell);
        instrumentToSellPanel.add(monthSell);
        instrumentToSellPanel.add(yearSell);

        // adding Discount Percentage label and text field
        discountPercent = new JLabel(" Discount percent");
        discountPercent.setBounds(30, 270, 150, 30);
        instrumentToSellPanel.add(discountPercent);

        discountPercentTf = new JTextField();
        discountPercentTf.setBounds(200, 270, 75, 30);
        instrumentToSellPanel.add(discountPercentTf);

        // adding sell instrument button
        sell = new JButton("Sell");
        sell.setBounds(295, 370, 75, 30);
        sell.setFocusPainted(false);
        sell.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                sellInstrumentHandler();
            }
        });
        instrumentToSellPanel.add(sell);

        // adding display button
        display2 = new JButton("Display");
        display2.setBounds(30, 370, 75, 30);
        display2.setFocusPainted(false);
        display2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (instrumentList.size() > 0) {
                    for (int i = 0; i < instrumentList.size(); i++) {
                        if (instrumentList.get(i) instanceof InstrumentToSell) {
                            InstrumentToSell obj2 = (InstrumentToSell) instrumentList.get(i);
                            obj2.DISPLAY();
                        }
                    }
                } else {
                    System.out.println("the instrument is either not sold or not in stock");
                }
            }
        });
        instrumentToSellPanel.add(display2);

        // adding return instrument panel
        returnInstrumetnPanel = new JPanel();
        returnInstrumetnPanel.setBounds(270, 600, 630, 80);
        returnInstrumetnPanel.setBackground(color1);
        returnInstrumetnPanel.setLayout(null);

        TitledBorder returnInstrumentTb = BorderFactory.createTitledBorder(
                "Return Instruments");
        returnInstrumentTb.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        returnInstrumentTb.setTitleJustification(TitledBorder.CENTER);
        returnInstrumetnPanel.setBorder(returnInstrumentTb);
        frame.add(returnInstrumetnPanel);

        // adding return instrument label and text field
        returnInstrument = new JLabel("Instrument Name ");
        returnInstrument.setBounds(30, 25, 150, 30);
        returnInstrumetnPanel.add(returnInstrument);

        returnInstrumentTf = new JTextField();
        returnInstrumentTf.setBounds(180, 25, 150, 30);
        returnInstrumetnPanel.add(returnInstrumentTf);

        // adding return button
        returnIns = new JButton("return ");
        returnIns.setBounds(445, 25, 100, 30);
        returnIns.setFocusPainted(false);
        returnIns.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                returnInstrumentHandler();
            }
        });
        returnInstrumetnPanel.add(returnIns);

        frame.setVisible(true);

    }

    // main method
    public static void main(String[] args) {
        new SarangiSansar();
    }

    // validation for add for rent
    // add for rent handler
    public void addForRentHandler() {
        String nameOfIns = getNameOfRentIns();
        int rentChargePerDay = getRentChargePerDay();
        boolean isUnique = true;

        // checking if the entered value is negative
        if (checkNegative == 2) {
            checkNegative = 1;
            return;
        }

        // cehcking if the entered data is valid
        if (checkValidity == "invalid") {
            checkValidity = "valid";
            return;
        }

        if (nameOfIns.isEmpty() || rentChargePerDay == EMPTY) {
            JOptionPane.showMessageDialog(frame, "All the fields must be filled", "WARNING",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }

        for (int i = 0; i < instrumentList.size(); i++) {
            if (instrumentList.get(i).GetInstrumentName().toLowerCase().equals(nameOfIns.toLowerCase())) {
                isUnique = false;
                JOptionPane.showMessageDialog(frame,
                        "Unique Instrument Name required " + "\'" + nameOfIns + "\'" + " is not unique", "ERROR",
                        JOptionPane.ERROR_MESSAGE);
                break;
            }
        }

        if (isUnique && rentChargePerDay != INVALID) {

            instrumentList.add(new InstrumentToRent(nameOfIns, rentChargePerDay));
            JOptionPane.showMessageDialog(frame, "\'" + nameOfIns + "\'" + " successfully added for renting "
                    + "with charge of Rs." + rentChargePerDay + " per day");
        }

    }

    // extracting instrument name from rent instrument panel
    public String getNameOfRentIns() {
        return instrumentNameTf1.getText().trim();
    }

    // charge per day validation
    // extracting charge per day from add for rent or sell panel
    public int getRentChargePerDay() {
        String chargePerDayText = chargePerDayTf.getText().trim();
        int rentChargePerDay = INVALID;

        if (chargePerDayText.isEmpty()) {
            rentChargePerDay = EMPTY;
            return rentChargePerDay;
        }

        try {
            rentChargePerDay = Integer.parseInt(chargePerDayText);
            if (rentChargePerDay <= 0) {
                JOptionPane.showMessageDialog(frame, "Charge Per day must be greater than 0", "WARNING",
                        JOptionPane.WARNING_MESSAGE);
                rentChargePerDay = INVALID;
                checkNegative = 2;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(frame,
                    "invalid Charge per day", "Error",
                    JOptionPane.ERROR_MESSAGE);
            checkValidity = "invalid";
        }
        return rentChargePerDay;

    }

    // validation for add for sell
    // add for sell handler
    public void addForSellHandler() {
        String nameOfIns2 = instrumentNameTf2.getText().trim();
        int cost = getCost();
        boolean isUnique = true;

        // checking if the entered value is negative
        if (checkNegative == 2) {
            checkNegative = 1;
            return;
        }

        // cehcking if the entered data is valid
        if (checkValidity == "invalid") {
            checkValidity = "valid";
            return;
        }

        if (nameOfIns2.isEmpty() || cost == EMPTY) {
            JOptionPane.showMessageDialog(frame, "All the fields must be filled", "WARNING",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }

        for (int i = 0; i < instrumentList.size(); i++) {
            if (instrumentList.get(i).GetInstrumentName().toLowerCase().equals(nameOfIns2.toLowerCase())) {
                isUnique = false;
                JOptionPane.showMessageDialog(frame,
                        "Unique Instrument Name required " + "\'" + nameOfIns2 + "\'" + " is not unique",
                        "ERROR",
                        JOptionPane.ERROR_MESSAGE);
                break;
            }
        }

        if (isUnique && cost != INVALID) {
            instrumentList.add(new InstrumentToSell(nameOfIns2, cost));
            JOptionPane.showMessageDialog(frame,
                    "\'" + nameOfIns2 + "\'" + " successfully added for selling" + " with price of Rs." + cost);
        }

    }

    // selling price validation
    // extracting price from add instrument to rent or sell panel
    public int getCost() {
        String priceText = priceTf.getText().trim();
        int cost = INVALID;

        if (priceText.isEmpty()) {
            cost = EMPTY;
            return cost;
        }

        try {
            cost = Integer.parseInt(priceText);
            if (cost <= 0) {
                JOptionPane.showMessageDialog(frame, "Price must be greater than 0",
                        "WARNING",
                        JOptionPane.WARNING_MESSAGE);
                cost = INVALID;
                checkNegative = 2;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(frame,
                    "Entered Price is Invalid ", "Error",
                    JOptionPane.ERROR_MESSAGE);
            checkValidity = "invalid";
        }
        return cost;
    }

    // validation for rent Instrument
    // rent instrument Handler
    public void rentInstrumentHandler() {
        String insToRentText = rentInstrumentNameTf.getText().trim();
        String nameOfCostumerText = costumerNameTf.getText().trim();
        String phoneText = costumerPhoneNumTf.getText().trim();
        int panText = getRentPan();
        String rentingDate = dayRent.getSelectedItem().toString() + " " +
                monthRent.getSelectedItem().toString() + " "
                + yearRent.getSelectedItem().toString();
        String returningDate = rDay.getSelectedItem().toString() + " " +
                rMonth.getSelectedItem().toString() + " "
                + rYear.getSelectedItem().toString();
        int noOfDaysText = getTotalRentingDays();
        boolean isUnique = true;

        if (insToRentText.isEmpty() || panText == EMPTY || noOfDaysText == EMPTY || nameOfCostumerText.isEmpty()
                || phoneText.isEmpty()) {
            JOptionPane.showMessageDialog(frame, "All the fields must be filled", "WARNING",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }

        // checking if the entered value is negative
        if (checkNegative == 2) {
            checkNegative = 1;
            return;
        }

        // cehcking if the entered data is valid
        if (checkValidity == "invalid") {
            checkValidity = "valid";
            return;
        }

        if (instrumentList.size() > 0) {
            for (int i = 0; i < instrumentList.size(); i++) {
                if (instrumentList.get(i).GetInstrumentName().toLowerCase()
                        .equals(insToRentText.toLowerCase())) {
                    if (instrumentList.get(i) instanceof InstrumentToRent) {
                        InstrumentToRent obj = (InstrumentToRent) instrumentList.get(i);
                        if (obj.GetIsRENTED()) {
                            isUnique = false;
                            JOptionPane.showMessageDialog(frame, "\'" + insToRentText + "\'" + " is already rented",
                                    "WARNING",
                                    JOptionPane.WARNING_MESSAGE);
                            return;
                        }
                        obj.RENT(nameOfCostumerText, phoneText, panText, rentingDate,
                                returningDate,
                                noOfDaysText);

                        isUnique = false;
                        obj.SetIsRENTED(true);
                        JOptionPane.showMessageDialog(frame, "\'" + insToRentText + "\'" + " successfully rented");

                        int totalCost = getRentChargePerDay() * noOfDaysText;
                        JOptionPane.showMessageDialog(frame,
                                "Charge Per day: Rs." + getRentChargePerDay() + " \n Total charge for " + noOfDaysText + " days : Rs." + totalCost);
                        break;

                    }
                }
            }
        }

        if (isUnique == true) {
            JOptionPane.showMessageDialog(frame, "\'" + insToRentText + "\'" + " is not found in stock", "ERROR",
                    JOptionPane.ERROR_MESSAGE);
        }

    }

    // get PAN for renting instrument
    public int getRentPan() {
        String panText = costumerPANTf.getText().trim();
        int rentPanNo = INVALID;

        if (panText.isEmpty()) {
            rentPanNo = EMPTY;
            return rentPanNo;
        }

        try {
            rentPanNo = Integer.parseInt(panText);
            if (rentPanNo <= 0) {
                JOptionPane.showMessageDialog(frame, "PAN must be greater than 0",
                        "WARNING",
                        JOptionPane.WARNING_MESSAGE);
                rentPanNo = INVALID;
                checkNegative = 2;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(frame,
                    "Entered PAN is invalid", "Error",
                    JOptionPane.ERROR_MESSAGE);
            checkValidity = "invalid";

        }
        return rentPanNo;

    }

    // get total renting days for renting instrument
    public int getTotalRentingDays() {
        String noOfDaysText = rentingDaysTf.getText().trim();
        int noOfDays = INVALID;

        if (noOfDaysText.isEmpty()) {
            noOfDays = EMPTY;
            return noOfDays;
        }

        try {
            noOfDays = Integer.parseInt(noOfDaysText);
            if (noOfDays < 0) {
                JOptionPane.showMessageDialog(frame, "Renting Days can not be negative",
                        "WARNING",
                        JOptionPane.WARNING_MESSAGE);
                noOfDays = INVALID;
                checkNegative = 2;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(frame,
                    "Entered renting Days is invalid", "Error",
                    JOptionPane.ERROR_MESSAGE);
            checkValidity = "invalid";

        }
        return noOfDays;

    }

    // return instrument
    public void returnInstrumentHandler() {
            String nameOfIns = returnInstrumentTf.getText().trim();
            boolean greaterThanZero = false;

        if (nameOfIns.isEmpty()) {
            JOptionPane.showMessageDialog(frame, "All the fields must be filled", "WARNING",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (instrumentList.size() > 0) {

            for (int i = 0; i < instrumentList.size(); i++) {
                if (instrumentList.get(i).GetInstrumentName().toLowerCase().equals(nameOfIns.toLowerCase())) {
                    if (instrumentList.get(i) instanceof InstrumentToRent) {
                        InstrumentToRent obj = (InstrumentToRent) instrumentList.get(i);
                        if (obj.GetIsRENTED() == false) {
                            JOptionPane.showMessageDialog(frame, "\'" + nameOfIns + "\'" + " was not rented by us",
                                    "ERROR",
                                    JOptionPane.ERROR_MESSAGE);
                            greaterThanZero = true;
                            return;
                        }
                        obj.ReturnInstrument();
                        JOptionPane.showMessageDialog(frame, "\'" + nameOfIns + "\'" + " returned successfully");
                        obj.SetIsRENTED(false);
                        greaterThanZero = true;
                        break;
                    }
                }
            }

        }

        if (greaterThanZero == false) {
            JOptionPane.showMessageDialog(frame, "\'" + nameOfIns + "\'" + " is not in stock and we didn't rent it out",
                    "ERROR",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    // sell instrument Handler
    public void sellInstrumentHandler() {
        String instrumentToSellText = sellInstrumentNameTf.getText().trim();
        String customerNameSellText = costumerNameTf2.getText().trim();
        String customerPhoneText = costumerPhoneNumTf2.getText().trim();
        int customerPanText = getSellPan();
        String dateOfSell = daySell.getSelectedItem().toString() + " " +
                monthSell.getSelectedItem().toString() + " "
                + yearSell.getSelectedItem().toString();
        int discountPercent = getDiscountPercent();
        boolean isUnique = true;

        if (instrumentToSellText.isEmpty() || customerPanText == EMPTY ||
                discountPercent == EMPTY
                || customerNameSellText.isEmpty()
                || customerPhoneText.isEmpty()) {
            JOptionPane.showMessageDialog(frame, "All the fields must be filled", "WARNING",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }

        // checking if the entered value is negative
        if (checkNegative == 2) {
            checkNegative = 1;
            return;
        }

        // cehcking if the entered data is valid
        if (checkValidity == "invalid") {
            checkValidity = "valid";
            return;
        }

        if (instrumentList.size() > 0) {
            for (int i = 0; i < instrumentList.size(); i++) {
                if (instrumentList.get(i).GetInstrumentName().toLowerCase()
                        .equals(instrumentToSellText.toLowerCase())) {
                    if (instrumentList.get(i) instanceof InstrumentToSell) {
                        InstrumentToSell obj2 = (InstrumentToSell) instrumentList.get(i);
                        if (obj2.GetIsSOLD() == true) {
                            isUnique = false;
                            JOptionPane.showMessageDialog(frame, "\'" + instrumentToSellText + "\'" + " is already sold",
                                    "WARNING",
                                    JOptionPane.WARNING_MESSAGE);
                            return;
                        }
                        isUnique = false;
                        obj2.SELL(customerNameSellText, customerPhoneText,
                                customerPanText,
                                dateOfSell,
                                discountPercent);
                        obj2.SetIsSOLD(true);
                        JOptionPane.showMessageDialog(frame, "\'" + instrumentToSellText + "\'" + "  sold successfully");
                        double dscAmount = (getCost() * discountPercent) / 100;
                        double priceWithDsc = getCost() - dscAmount;
                        JOptionPane.showMessageDialog(frame, " Discount percentage : " + discountPercent
                                + "% \n Price with Discount : Rs." + priceWithDsc);

                    }

                    break;
                }

            }
        }
        if (isUnique == true) {
            JOptionPane.showMessageDialog(frame, "\'" + instrumentToSellText + "\'" + " is not in stock", "ERROR",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    // gettin PAN form sell instrument panel
    public int getSellPan() {
        String SellPanText = costumerPANTf2.getText().trim();
        int SellPan = INVALID;

        if (SellPanText.isEmpty()) {
            SellPan = EMPTY;
            return SellPan;
        }

        try {
            SellPan = Integer.parseInt(SellPanText);
            if (SellPan <= 0) {
                JOptionPane.showMessageDialog(frame, "PAN must be greater than 0",
                        "WARNING",
                        JOptionPane.WARNING_MESSAGE);
                SellPan = INVALID;
                checkNegative = 2;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(frame,
                    "Invalid PAN", "Error",
                    JOptionPane.ERROR_MESSAGE);
            checkValidity = "invalid";
        }
        return SellPan;
    }

    // discount percent --> sell
    public int getDiscountPercent() {
        String dscntPercentTxt = discountPercentTf.getText().trim();
        int dscPercent = INVALID;

        if (dscntPercentTxt.isEmpty()) {
            dscPercent = EMPTY;
            return dscPercent;
        }

        try {
            dscPercent = Integer.parseInt(dscntPercentTxt);
            if (dscPercent <= 0) {
                JOptionPane.showMessageDialog(frame, "Discount percent must be greater than 0", "WARNING",
                        JOptionPane.WARNING_MESSAGE);
                dscPercent = INVALID;
                checkNegative = 2;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(frame,
                    "Entered Discount Percent is invalid", "Error",
                    JOptionPane.ERROR_MESSAGE);
            checkValidity = "invalid";
        }
        return dscPercent;
    }

    // clear handler
    public void clear() {
        instrumentNameTf1.setText("");
        chargePerDayTf.setText("");
        instrumentNameTf2.setText("");
        priceTf.setText("");
        rentInstrumentNameTf.setText("");
        costumerNameTf.setText("");
        costumerPhoneNumTf.setText("");
        costumerPANTf.setText("");
        rentingDaysTf.setText("");
        sellInstrumentNameTf.setText("");
        costumerNameTf2.setText("");
        costumerPhoneNumTf2.setText("");
        costumerPANTf2.setText("");
        discountPercentTf.setText("");
        returnInstrumentTf.setText("");

    }

}
