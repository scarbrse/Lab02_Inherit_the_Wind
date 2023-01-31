public class Worker extends Person
{

    private double hourlyPayRate;

    public Worker(String ID, String firstName, String lastName, String title, int yob, double hourlyPayRate) {
        super(ID, firstName, lastName, title, yob);
        this.hourlyPayRate = hourlyPayRate;
    }

    public double getHourlyPayRate() {
        return hourlyPayRate;
    }

    /**
     * Calculate worker's weekly pay
     */

    public double calculateWeeklyPay(double hoursWorked){
        double totalPay = hourlyPayRate * hoursWorked;

        if (hoursWorked > 40) {
            totalPay = hourlyPayRate * 40 + (hourlyPayRate * 1.5) * (hoursWorked - 40);
        } else {
            totalPay = hourlyPayRate * hoursWorked;
        } return totalPay;

    }

    /**
     * Display worker's hours/pay
     */

    public String displayWeeklyPay(double hoursWorked){
        double regularHours;
        double regularPay;
        double overtimeHours;
        double overtimePay;
        double totalPay;
        String weeklyPay;

        if (hoursWorked >= 40){
            regularHours = 40;
            overtimeHours = hoursWorked - 40;
        } else {
            regularHours = hoursWorked;
            overtimeHours = 0;
        }

        overtimePay = overtimeHours * (hourlyPayRate * 1.5);
        regularPay = regularHours * hourlyPayRate;
        totalPay = overtimePay + regularPay;
        weeklyPay = "Regular pay hours: " + regularHours + "\nRegular pay: " + regularPay + "\nOvertime hours: " + overtimeHours + "\nOvertime pay: " + overtimePay + "\nTotal pay: " + totalPay;

        String totalPayOutput = String.format("%.2f", totalPay);

        return totalPayOutput;
    }
}
