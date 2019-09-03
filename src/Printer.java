import java.util.ArrayList;
import java.util.List;

public class Printer {

    List<Employee> employees = new ArrayList<Employee>();
    List<Member> members = new ArrayList<Member>();
    List<Person> persons = new ArrayList<Person>();



    public void printAllEmployees() {

        employees.add(new AdminPersonnel("Jeanne", "080288-2282"));
        employees.add(new Instructor("Per", "121221-4193", 12000, 7));

        System.out.println("FITNESS EMPLOYEES");
        System.out.printf("%-14s%-14s%-14s%-14s%-14s\n", "Name", "Cpr", "Hours", "Salary", "Vacation");
        for (int i = 0; i < 67; i++) {
            System.out.print("*");
            if (i == 66) {
                System.out.println();
            }
        }

        for (Employee employee : employees) {
            System.out.printf("%-14s%-14s%-14s%-14s",
                    employee.getName(),
                    employee.getCpr(),
                    employee.getWorkHours(),
                    employee.getSalary()
            );
            if (employee.getVacation() != 0) {
                System.out.print(employee.getVacation());
            }
            System.out.println();

        }

        for (int i = 0; i < 50; i++) {
            System.out.print("=");
            if (i == 49) {
                System.out.println("\n\n");
            }
        }

    }

    public void PrintAllMembers(){
        members.add(new Member("John", "230239-3234", "full"));
        members.add(new Member("Madam", "195812-1245", "basic"));

        System.out.println("FITNESS MEMBERS");
        System.out.printf("%-14s%-14s%-14s%-14s\n", "Name", "Cpr", "Member Type", "Fee");

        for (int i = 0; i < 67; i++) {
            System.out.print("*");
            if (i == 66) {
                System.out.println();
            }
        }

        for (Member member : members) {
            String memberType;
            if(member.getFee() == 299){
                memberType = "full";
            }
            else{
                memberType = "basic";
            }

            System.out.printf("%-14s%-14s%-14s%-14s",
                    member.getName(),
                    member.getCpr(),
                    memberType,
                    member.getFee());
            System.out.println();

        }

        for (int i = 0; i < 50; i++) {
            System.out.print("=");
            if (i == 49) {
                System.out.println("\n\n");
            }
        }


    }

    public void printAllPersons(){

        System.out.println("EMPLOYEES & MEMBERS Name and cpr");
        System.out.printf("%-14s%-14s\n", "Name", "Cpr");

        for(Person person : members){
            persons.add(new Person(person));
        }
        for(Person person : employees){
            persons.add(new Person(person));
        }

        for (int i = 0; i < 67; i++) {
            System.out.print("*");
            if (i == 66) {
                System.out.println();
            }
        }

        for(Person p : persons){
            System.out.printf("%-14s%-14s",
                    p.getName(),
                    p.getCpr());
            System.out.println();
        }

        for (int i = 0; i < 50; i++) {
            System.out.print("=");
            if (i == 49) {
                System.out.println("\n\n");
            }
        }

    }
}


