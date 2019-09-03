public class Member extends Person {

    private int fee;

    public Member(String name, String cpr, String memberType){
        setName(name);

        if(memberType.equalsIgnoreCase("full")) {
            setFee(299);
        }
        else{
            setFee(199);
        }
        setCpr(cpr);
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }
}
