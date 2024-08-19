public class Employee{
    String name;
    String designation;
    int empid;
    double salary;



    public Employee(String name, String designation, int empid, double salary) {
        this.name = name;
        this.designation = designation;
        this.empid = empid;
        this.salary = salary;
    }
    


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return this.designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getEmpid() {
        return this.empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", designation='" + getDesignation() + "'" +
            ", empid='" + getEmpid() + "'" +
            ", salary='" + getSalary() + "'" +
            "}";
    }


}