public class Employee {
    private String name;
    private String departman;
    private int salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartman() {
        return departman;
    }

    public void setDepartman(String departman) {
        this.departman = departman;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Employee(String name, String departman, int salary) {
        this.name = name;
        this.departman = departman;
        this.salary = salary;
    }

   public void  showİnfos(){
       System.out.println("bilgiler.....");
       System.out.println("İsim="+this.name);
       System.out.println("Departman="+this.departman);
       System.out.println("Maas="+this.salary);

    }
}

