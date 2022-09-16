public class Main {
    public static void main(String[] args) {
/*        System.out.println("Hello world!");
        Employee employee=new Employee("Suleyman Durmaz","polis",5000);
employee.showİnfos();*/
        Manager manager=new Manager("nurgul","ögretmen",6000,10);
        manager.showİnfos();
        manager.raiseSalary(100);
    }
}