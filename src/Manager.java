public class Manager extends Employee{
    private int num_Of_Employees;

    public int getNum_Of_Employees() {
        return num_Of_Employees;
    }

    public void setNum_Of_Employees(int num_Of_Employees) {
        this.num_Of_Employees = num_Of_Employees;
    }

    public  Manager(String name, String departman, int salary, int num_Of_Employees) {
        super(name, departman, salary);
        this.num_Of_Employees=num_Of_Employees;

    }

    @Override
    public void showİnfos() {
        super.showİnfos();
        System.out.println( "sorumlu kısı sayısı="+this.num_Of_Employees);


    }

    public void  raiseSalary(int emount){
        System.out.println("calısanlara"+emount+"tl zam yapıldı....");
    }
}
