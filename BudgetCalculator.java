public class BudgetCalculator {
    
    //Constant Variables
    public static final double SALARY = 3000.0;
    public static final double SAVINGS_PERCENT = 0.20;
    public static final double RENT_PERCENT = 0.30;
    public static final double GROCERIES_PERCENT = 0.15;
    public static final double ENTERTAINMENT_PERCENT = 0.10;

    public static void main(String[] args) { //Main Function Start
        
        //Regular variable Declarations
        double monthlySalary = SALARY;
        double savedAmount;
        double rentAmount;
        double groceriesAmount;
        double entertainmentAmount;
        double totalExpenses;
        double remainingBalance;

        //Calculations
        savedAmount = monthlySalary * SAVINGS_PERCENT; // Calculates amount needed to be saved
        rentAmount = monthlySalary * RENT_PERCENT; // Calculates Rent money saved
        groceriesAmount = monthlySalary * GROCERIES_PERCENT;// Calculates Grocery Money Saved
        entertainmentAmount = monthlySalary * ENTERTAINMENT_PERCENT; // Calculates Money spent on Entertainment

        totalExpenses = rentAmount + groceriesAmount + entertainmentAmount; // Calculates total amount of money spent
        remainingBalance = monthlySalary - totalExpenses; // Calculates the remaining money from your paycheck

        // User Display
        System.out.println("===== Monthly Budget Summary =====");// Title: Monthly Budget Summary
        System.out.println("Monthly Salary: $" + monthlySalary); // Displays Monthly Salary
        System.out.println("Amount Saved: $" + savedAmount); // Displays Amount Saved
        System.out.println("Rent Expense: $" + rentAmount); // Displays Rent Expenses
        System.out.println("Groceries Expense: $" + groceriesAmount); // Displays Grocery Expenses
        System.out.println("Entertainment Expense: $" + entertainmentAmount); // Display Entertainment Expenses
        System.out.println("Total Expenses: $" + totalExpenses); // Displays Total Expenses
        System.out.println("Remaining Balance: $" + remainingBalance); // Displays Remaining Balance
    } // Main Function end
}

