public class Instructor extends Employee {

    public Instructor(String name, String cpr, int salary, int workHours){
        setName(name);
        setSalary(salary);
        setWorkHours(workHours);
        setCpr(cpr);
        setVacation(0);
    }
}
