public class ServiceClass {
    public void printAllEmployees(Employ[] employees){
        for(Employ e:employees){
            System.out.println(e);
        }
    }
    public void printEmployeesWithAge(){

    }
    public void printEmployeesWithHighestAndLeastSalary(){
        Employ big = employees[0];
        Employ small = employees[0];
        for(Employ e:employees){
            if (e.salary>big.salary) {
                big = e;
            }
            else if (e.salary<small.salary) {
                small=e;
            }
        }
    }
}
