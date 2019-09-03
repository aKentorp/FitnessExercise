public class Person {

    public Person(){}

    public Person(Person person){
        setName(person.getName());
        setCpr(person.getCpr());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpr() {
        return cpr;
    }

    public void setCpr(String cpr) {
        this.cpr = cpr;
    }

    private String name;
    private String cpr;
}
