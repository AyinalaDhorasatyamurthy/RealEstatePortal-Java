package first;
import java.util.Scanner;

abstract class FinanceTool {
    public abstract void useTool();

    
}

class MortgageCalculator extends FinanceTool {
    

    private double principal;
	private double annualInterestRate;
	private int loanTermInYears;
	private double downPayment;
	private double annualPropertyTax;
	private double annualInsurance;

	public MortgageCalculator(double principal, double annualInterestRate, int loanTermInYears,
                              double downPayment, double annualPropertyTax, double annualInsurance) {
        this.principal = principal;
        this.annualInterestRate = annualInterestRate;
        this.loanTermInYears = loanTermInYears;
        this.downPayment = downPayment;
        this.annualPropertyTax = annualPropertyTax;
        this.annualInsurance = annualInsurance;
    }


    @Override
    public void useTool() {
        System.out.println("Using Mortgage Calculator...");

        
       
        
        double monthlyInterestRate = annualInterestRate / 100 / 12;
        double loanAmount = principal - downPayment;
        int numberOfPayments = loanTermInYears * 12;

        double monthlyPayment = (loanAmount * monthlyInterestRate) /
                (1 - Math.pow(1 + monthlyInterestRate, -numberOfPayments));

        monthlyPayment += (annualPropertyTax + annualInsurance) / 12;

        System.out.println("Mortgage Calculation Results:");
        System.out.printf("Monthly Payment: %.2f%n", monthlyPayment);
    }
}

class InvestmentAnalysis extends FinanceTool {
    private double initialInvestment;
    private double annualCashInflows;
    private int holdingPeriod;

    public InvestmentAnalysis(double initialInvestment, double annualCashInflows, int holdingPeriod) {
        this.initialInvestment = initialInvestment;
        this.annualCashInflows = annualCashInflows;
        this.holdingPeriod = holdingPeriod;
    }


    @Override
    public void useTool() {
    	  double totalCashInflows = annualCashInflows * holdingPeriod;
          double roi = (totalCashInflows - initialInvestment) / initialInvestment * 100;

          System.out.println("Investment Analysis Results:");
          System.out.printf("Initial Investment: $%.2f%n", initialInvestment);
          System.out.printf("Total Cash Inflows: $%.2f%n", totalCashInflows);
          System.out.printf("Return on Investment (ROI): %.2f%n", roi);
      
    }
}

class BudgetPlanner extends FinanceTool {
    private double monthlyIncome;
    private double mortgagePayment;
    private double propertyTaxes;
    private double homeownersInsurance;
    private double utilitiesCost;
    private double transportationExpenses;
    private double groceriesCost;
    private double otherInsuranceCost;
    private double entertainmentExpenses;

    public BudgetPlanner(double monthlyIncome, double mortgagePayment,
                         double propertyTaxes, double homeownersInsurance,
                         double utilitiesCost, double transportationExpenses,
                         double groceriesCost, double otherInsuranceCost,
                         double entertainmentExpenses) {
        this.monthlyIncome = monthlyIncome;
        this.mortgagePayment = mortgagePayment;
        this.propertyTaxes = propertyTaxes;
        this.homeownersInsurance = homeownersInsurance;
        this.utilitiesCost = utilitiesCost;
        this.transportationExpenses = transportationExpenses;
        this.groceriesCost = groceriesCost;
        this.otherInsuranceCost = otherInsuranceCost;
        this.entertainmentExpenses = entertainmentExpenses;
    }


    @Override
    public void useTool() {
        
        
        double remainingBudget = calculateRemainingBudget();

        System.out.println("\nBudget Planner Results:");
        System.out.printf("Monthly Income: $%.2f%n", monthlyIncome);
        System.out.printf("Mortgage Payment: $%.2f%n", mortgagePayment);
        System.out.printf("Property Taxes: $%.2f%n", propertyTaxes);
        System.out.printf("Homeowners Insurance: $%.2f%n", homeownersInsurance);
        System.out.printf("Utilities Cost: $%.2f%n", utilitiesCost);
        System.out.printf("Transportation Expenses: $%.2f%n", transportationExpenses);
        System.out.printf("Groceries Cost: $%.2f%n", groceriesCost);
        System.out.printf("Insurance (health, life, etc.) Cost: $%.2f%n", otherInsuranceCost);
        System.out.printf("Entertainment and Miscellaneous Expenses: $%.2f%n", entertainmentExpenses);
        System.out.printf("Remaining Budget: $%.2f%n", remainingBudget);
    }

    private double calculateRemainingBudget() {
        return monthlyIncome - mortgagePayment - propertyTaxes - homeownersInsurance -
                utilitiesCost - transportationExpenses - groceriesCost - otherInsuranceCost -
                entertainmentExpenses;
    }
        
        
        }

class TaxCalculator extends FinanceTool {
    private double propertyValue;
    private String propertyType;
    private String location;

    public TaxCalculator(double propertyValue, String propertyType, String location) {
        this.propertyValue = propertyValue;
        this.propertyType = propertyType;
        this.location = location;
    }


    @Override
    public void useTool() {
    	double taxRate = 0.02;

        if (propertyType.equalsIgnoreCase("commercial")) {
            taxRate = 0.03;
        }

        if (location.equalsIgnoreCase("city")) {
            taxRate += 0.01;
        }

        double exemptions = 0.0;

        if (propertyType.equalsIgnoreCase("residential") && location.equalsIgnoreCase("suburb")) {
            exemptions = 1000.0;
        }

        double taxableValue = propertyValue - exemptions;
        if (taxableValue < 0) {
            taxableValue = 0.0;
        }

        double propertyTax = taxableValue * taxRate;

        System.out.printf("Property Tax: %.2f%n", propertyTax);
        
    }
}

class FinancialReports extends FinanceTool {
    private double propertyValue;
    private double loanAmount;
    private double annualInterestRate;
    private int loanTermYears;
    private double downPayment;
    private double propertyTaxRate;
    private double insuranceCost;
    private double otherExpenses;

    public FinancialReports(double propertyValue, double loanAmount, double annualInterestRate,
                            int loanTermYears, double downPayment, double propertyTaxRate,
                            double insuranceCost, double otherExpenses) {
        this.propertyValue = propertyValue;
        this.loanAmount = loanAmount;
        this.annualInterestRate = annualInterestRate;
        this.loanTermYears = loanTermYears;
        this.downPayment = downPayment;
        this.propertyTaxRate = propertyTaxRate;
        this.insuranceCost = insuranceCost;
        this.otherExpenses = otherExpenses;
    }


    
    @Override
    public void useTool() {
    	
  
    	double monthlyPayment = calculateMonthlyPayment(loanAmount, annualInterestRate, loanTermYears);
        double totalInterestPaid = calculateTotalInterestPaid(loanAmount, annualInterestRate, loanTermYears);
        double totalLoanCost = calculateTotalLoanCost(loanAmount, totalInterestPaid);
        double monthlyPropertyTax = calculateMonthlyPropertyTax(propertyValue, propertyTaxRate);
        double monthlyInsuranceCost = insuranceCost / 12;
        double totalMonthlyExpenses = monthlyPayment + monthlyPropertyTax + monthlyInsuranceCost + otherExpenses;

        System.out.println("Financial Report:");
        System.out.println("Monthly Mortgage Payment: $" + monthlyPayment);
        System.out.println("Total Interest Paid: $" + totalInterestPaid);
        System.out.println("Total Loan Cost: $" + totalLoanCost);
        System.out.println("Monthly Property Tax: $" + monthlyPropertyTax);
        System.out.println("Monthly Insurance Cost: $" + monthlyInsuranceCost);
        System.out.println("Other Monthly Expenses: $" + otherExpenses);
        System.out.println("Total Monthly Expenses: $" + totalMonthlyExpenses);
        System.out.println("downPayment  : $" + downPayment);

     
    }
    
    
    

	private static double calculateMonthlyPayment(double loanAmount, double annualInterestRate, int loanTermYears) {
        double monthlyInterestRate = annualInterestRate / 12 / 100;
        int totalPayments = loanTermYears * 12;
        return loanAmount * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, totalPayments))
                / (Math.pow(1 + monthlyInterestRate, totalPayments) - 1);
    }

    private static double calculateTotalInterestPaid(double loanAmount, double annualInterestRate, int loanTermYears) {
        double monthlyPayment = calculateMonthlyPayment(loanAmount, annualInterestRate, loanTermYears);
        int totalPayments = loanTermYears * 12;
        return (monthlyPayment * totalPayments) - loanAmount;
    }

    private static double calculateTotalLoanCost(double loanAmount, double totalInterestPaid) {
        return loanAmount + totalInterestPaid;
    }

    private static double calculateMonthlyPropertyTax(double propertyValue, double propertyTaxRate) {
        return (propertyValue * propertyTaxRate) / 12 / 100;
    }

}

// Similar modifications for other financial tools
public class RealEstate1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Finance financeTools = new Finance();
    
        financeTools.displayDashboard();

            // Ask whether to continue
        scanner.close();
    }
}

class Report {
    public String generateReport(int toolSelection) {
        // Simulate generating a report based on the report type
        FinanceTool tool;

        switch (toolSelection) {
            case 1:
            	
                Scanner ri = new Scanner(System.in);

                System.out.print("Enter loan amount (principal): ");
                double principal = ri.nextDouble();

                System.out.print("Enter annual interest rate (in percentage): ");
                double annualInterestRate = ri.nextDouble();

                System.out.print("Enter loan term in years: ");
                int loanTermInYears = ri.nextInt();

                System.out.print("Enter down payment (if any): ");
                double downPayment = ri.nextDouble();

                System.out.print("Enter annual property tax (if any): ");
                double annualPropertyTax = ri.nextDouble();

                System.out.print("Enter annual homeowners insurance (if any): ");
                double annualInsurance = ri.nextDouble();

                tool = new MortgageCalculator(principal,annualInterestRate,loanTermInYears,downPayment,annualPropertyTax,annualInsurance);
                tool.useTool();
                System.out.print("\nDo you want to continue? (yes/no): ");
                if(ri.next().equalsIgnoreCase("yes"))
                {
                    Finance financeTools = new Finance();

                    financeTools.displayDashboard();

                }
                else
                {
                    System.out.println("Thank you for using the Finance Tools.");

                }
                ri.close();

                break;
            case 2:
            	 System.out.println("Using Investment Analysis...");

                 Scanner c = new Scanner(System.in);

                 System.out.print("Enter Initial Investment: $");
                 double initialInvestment = c.nextDouble();

                 System.out.print("Enter Annual Cash Inflows: $");
                 double annualCashInflows = c.nextDouble();

                 System.out.print("Enter Holding Period (in years): ");
                 int holdingPeriod = c.nextInt();
               


                tool = new InvestmentAnalysis(initialInvestment,annualCashInflows,holdingPeriod);
                tool.useTool();
                System.out.print("\nDo you want to continue? (yes/no): ");

                if(c.next().equalsIgnoreCase("yes"))
                {
                    Finance financeTools = new Finance();

                    financeTools.displayDashboard();

                }
                else
                {
                    System.out.println("Thank you for using the Finance Tools.");

                }


                c.close();


                break;

            case 3:
                System.out.println("Using BudgetPlanner...");

            	Scanner scanner = new Scanner(System.in);

                System.out.print("Enter your monthly income: $");
                double monthlyIncome = scanner.nextDouble();

                System.out.print("Enter your estimated mortgage payment: $");
                double mortgagePayment = scanner.nextDouble();

                System.out.print("Enter your estimated property taxes: $");
                double propertyTaxes = scanner.nextDouble();

                System.out.print("Enter your estimated homeowners insurance cost: $");
                double homeownersInsurance = scanner.nextDouble();

                System.out.print("Enter your estimated utilities cost: $");
                double utilitiesCost = scanner.nextDouble();

                System.out.print("Enter your estimated transportation expenses: $");
                double transportationExpenses = scanner.nextDouble();

                System.out.print("Enter your estimated groceries cost: $");
                double groceriesCost = scanner.nextDouble();

                System.out.print("Enter your estimated insurance (health, life, etc.) cost: $");
                double otherInsuranceCost = scanner.nextDouble();

                System.out.print("Enter your estimated entertainment and miscellaneous expenses: $");
                double entertainmentExpenses = scanner.nextDouble();



                tool = new BudgetPlanner (monthlyIncome,mortgagePayment,propertyTaxes,homeownersInsurance,utilitiesCost,transportationExpenses,groceriesCost,otherInsuranceCost,entertainmentExpenses);
                tool.useTool();
                System.out.print("\nDo you want to continue? (yes/no): ");
                if(scanner.next().equalsIgnoreCase("yes"))
                {
                    Finance financeTools = new Finance();

                    financeTools.displayDashboard();

                }
                else
                {
                    System.out.println("Thank you for using the Finance Tools.");

                }
                scanner.close();
              
                break;

            case 4:
            	System.out.println("Using TaxCalculator...");
                Scanner scan = new Scanner(System.in);

                System.out.print("Enter property value: ");
                double propertyValue1 = scan.nextDouble();

                System.out.print("Enter property type (residential/commercial): ");
                String propertyType = scan.next();

                System.out.print("Enter property location (city/suburb): ");
                String location = scan.next();
                tool = new TaxCalculator(propertyValue1,propertyType,location);
                tool.useTool();
                System.out.print("\nDo you want to continue? (yes/no): ");
                if(scan.next().equalsIgnoreCase("yes"))
                {
                    Finance financeTools = new Finance();

                    financeTools.displayDashboard();

                }
                else
                {
                    System.out.println("Thank you for using the Finance Tools.");

                }
                scan.close();
                break;

            case 5:
            	 System.out.println("Using Financial Reports...");
                 Scanner scanner1 = new Scanner(System.in);

                 System.out.print("Enter property value: ");
                 double propertyValue = scanner1.nextDouble();

                 System.out.print("Enter loan amount: ");
                 double loanAmount = scanner1.nextDouble();

                 System.out.print("Enter annual interest rate: ");
                 double annualInterestRate1 = scanner1.nextDouble();

                 System.out.print("Enter loan term in years: ");
                 int loanTermYears = scanner1.nextInt();

                 System.out.print("Enter down payment: ");
                 double downPayment1 = scanner1.nextDouble();

                 System.out.print("Enter property tax rate: ");
                 double propertyTaxRate = scanner1.nextDouble();

                 System.out.print("Enter annual insurance cost: ");
                 double insuranceCost = scanner1.nextDouble();

                 System.out.print("Enter other monthly expenses: ");
                 double otherExpenses = scanner1.nextDouble();
                 
                tool = new FinancialReports(propertyValue,loanAmount,annualInterestRate1,loanTermYears,downPayment1,propertyTaxRate,insuranceCost,otherExpenses);
                tool.useTool();
                System.out.print("\nDo you want to continue? (yes/no): ");
                if(scanner1.next().equalsIgnoreCase("yes"))
                {
                    Finance financeTools = new Finance();

                    financeTools.displayDashboard();

                }
                else
                {
                    System.out.println("Thank you for using the Finance Tools.");

                }
                scanner1.close();
                break;

            case 6:
                Scanner s = new Scanner(System.in);

                help h = new help();
                String dis = h.displayHelp();
                System.out.printf(dis);
                System.out.print("\nDo you want to continue? (yes/no): ");
                if(s.next().equalsIgnoreCase("yes"))
                {
                    Finance financeTools = new Finance();

                    financeTools.displayDashboard();

                }
                else
                {
                    System.out.println("Thank you for using the Finance Tools.");

                }
                s.close();
                break;

            case 7:
                System.out.println("Thank you for using the Finance Tools.");
                System.exit(0);

            default:
                return "Invalid report type";
        }
        return "0";
    }
}

class Finance {
    public void displayDashboard() {
        System.out.println("\nFinance Tools Dashboard:");
        System.out.println("1. Mortgage Calculator");
        System.out.println("2. Investment Analysis");
        System.out.println("3. Budget Planner");
        System.out.println("4. Tax Calculator");
        System.out.println("5. Financial Reports");
        System.out.println("6. HELP");
        System.out.println("7. Exit");

        System.out.print("Enter your choice: ");
        Scanner s = new Scanner(System.in);
        int toolSelection = s.nextInt();

        if (toolSelection >= 1 && toolSelection <= 6) {
            Report r = new Report();
            r.generateReport(toolSelection);
        } else if (toolSelection == 7) {
            System.out.println("Exiting Finance Tools.");
        } else {
            System.out.println("NOT EXISTS");
        }
        
        
        s.close();
    }
}

class help {
    public String displayHelp() {
        return "Finance Tools Help:\n" +
                "1. Mortgage Calculator: Calculate monthly mortgage payments.\n" +
                "\tFormula: M = P * (r * (1 + r)^n) / ((1 + r)^n - 1)\n" +
                "\tInputs:\n" +
                "\t- Loan Amount (Principal)\n" +
                "\t- Annual Interest Rate\n" +
                "\t- Loan Term (in years)\n" +
                "\t- (Optional) Down Payment\n" +
                "\t- (Optional) Property Taxes\n" +
                "\t- (Optional) Homeowners Insurance\n" +
                "\t- (Optional) Private Mortgage Insurance (PMI)\n" +
                "\t- (Optional) Other Costs/Expenses\n\n" +
                "2. Investment Analysis: Analyze potential investments.\n" +
                "\t(Include specific details about your investment analysis tool)\n\n" +
                "3. Budget Planner: Plan and manage your budget.\n" +
                "\t(Include specific details about your budget planner tool)\n\n" +
                "4. Tax Calculator: Estimate your tax liabilities.\n" +
                "\t(Include specific details about your tax calculator tool)\n\n" +
                "5. Financial Reports: Generate detailed financial reports.\n" +
                "\t(Include specific details about your financial reports tool)\n\n" +
                "6. HELP: Display information about each tool and its usage.\n" +
                "\t- You are currently viewing the help section.\n\n" +
                "7. Exit: Close the Finance Tools.\n" +
                "\t- Exit the Finance Tools application.\n\n" +
                "Note: This Finance Tools application is part of a hypothetical real estate portal.";
    }
}
