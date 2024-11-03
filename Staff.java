package deguzman_employee;


public class Staff {
    StaffMember[] staffList;
    
    public Staff (){
        
        System.out.println("*********************************************************");
    System.out.println("Paragon Experts Payroll Report for Logistics Department");
    System.out.println("*********************************************************");
      
      staffList = new StaffMember[6];
      
        staffList[0] = new Executive("Mr.Sam De Monteverde", "123 Makati City", "0925-123-4560", "123-45-6789", 24550.05);
        staffList[1] = new Employee("Ms. Carla Asuncion", "456 Taguig City", "0917-456-1223", "987-65-4321", 18746.15);
        staffList[2] = new Employee("Ms.Evangeline Pascual", "789 Off Shore Mandaluyong", "0977-788-7091", "010-20-3040", 17869.23);
        staffList[3] = new Hourly("Ms. Diane Rivera", "678 Fifth Ave. Quezon City", "0991-092-4589", "958-47-3625", 205.55);
        staffList[4] = new Volunteer("Mr. Norman Canlaon", "987 Suds Blvd.Pasay City", "0908-890-5046");
        staffList[5] = new Volunteer("Mr. Cliff Estevez", "321 Remedios Ave. Manila", "0915-890-0123");

        // Additional setup for specific staff members
        ((Executive)staffList[0]).awardBonus(1500.00);
        ((Hourly)staffList[3]).addHours(40);
      
    }
    
    public void payday(){
        double amount;
        for (StaffMember staffList1 : staffList){
            
            System.out.println(staffList1);
            amount = staffList1.pay();
            if (amount == 0.0){
                
                System.out.println("Thank you for your hardwork!");
            }else{
                
                System.out.println("Total Salary Wage: " + amount);
                System.out.println("--------------------------------");
            }
                
            
        }
        
    }

}
