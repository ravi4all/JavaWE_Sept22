public class EmpCaller {

    public static void main(String[] args) {
//        EmpSalarySlip ram = new EmpSalarySlip(101, "Ram", 45000.00);
        EmpSalarySlip ram = new EmpSalarySlip();
        ram.takeInput();
        ram.showEmpDetails();
        //System.out.println("Basic Salary : " + ram.basicSalary);
        double netSal = ram.netSalary();
        System.out.println("Net Salary is : " + netSal);
    }

}
