import java.util.ArrayList;

public class InheritanceDemo {

    public static void main(String[] args) {

        /**
        Hourly Workers
         */

        Worker worker1 = new Worker("000001", "Jared", "McLean", "Mr.", 2002, 10.75);
        Worker worker2 = new Worker("000002", "Zach", "Bahri", "Mr.", 2001, 18.50);
        Worker worker3 = new Worker("000003", "Prince", "Kalala", "Mr.", 2001, 22.75);

        /* Salary workers
         */
        SalaryWorker salWorker1 = new SalaryWorker("000004", "Reghan", "Buie", "Mrs.", 2001, 24.00, 49920);
        SalaryWorker salWorker2 = new SalaryWorker("000005", "Sarah", "Whiteside", "Mrs.", 2002, 30.00, 624000);
        SalaryWorker salWorker3 = new SalaryWorker("000006", "Sophie", "Newman", "Mrs.", 1999, 32.50, 72500);

        /* New ArrayList and add workers */
        ArrayList<Worker> workers = new ArrayList<>();

        workers.add(worker1);
        workers.add(worker2);
        workers.add(worker3);
        workers.add(salWorker1);
        workers.add(salWorker2);
        workers.add(salWorker3);

        /* table and loop that simulates 3 weekly pay periods */

        System.out.println("-------------------------------------------------------------------------------------");
        for(int i = 0; i < workers.size(); i++){

            Worker worker = (Worker) workers.get(i);
            System.out.printf("%-30s", worker.formalName());
            System.out.printf("%-20s", "Week One");
            System.out.printf("%-20s", "Week Two");
            System.out.print("Week Three");
            System.out.println();
            System.out.print("ID #: " + worker.getID());
            System.out.printf("%-18s", " ");
            System.out.printf("$" + worker.displayWeeklyPay(40));
            System.out.printf("%-13s", " ");
            System.out.print("$" + worker.displayWeeklyPay(50));
            System.out.printf("%-13s", " ");
            System.out.print("$" + worker.displayWeeklyPay(40));
            System.out.println();
            System.out.println("-------------------------------------------------------------------------------------");
        }
    }
}