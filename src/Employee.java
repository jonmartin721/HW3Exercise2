abstract public class Employee {

    private int ID, salary;
    private String name, department, designation;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @Override
    public boolean equals(Object obj){

        //first, make sure it exists and is a valid cast to Employee
        if (obj == null){
            return false;
        } else if (!Employee.class.isAssignableFrom(obj.getClass())){
            return false;
        }

        //now we test to see if the designation is equal
        final Employee other = (Employee) obj;
        return !this.designation.equals(other.designation);
    }

    abstract public addBonus();


}
