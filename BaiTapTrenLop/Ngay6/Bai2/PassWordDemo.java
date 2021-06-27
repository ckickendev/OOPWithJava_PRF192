package Semeter2_OOP_With_Jav_a.BaiTapTrenLop.Ngay6.Bai2;

public class PassWordDemo {
    private String firstName;
    private String secondName;
    private String lastName;
    private int age;
    private String fullpass;

    public PassWordDemo(String firstName, String secondName, String lastName, int age) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFullpass() {
        return fullpass;
    }

    public void setFullpass(String fullpass) {
        this.fullpass = fullpass;
    }

    public String generatePass(){
        this.fullpass = firstName.substring(0,1)+""+secondName.substring(0,1)+ ""+
                lastName.substring(0,1)+""+age;
        return fullpass;
    }

    public String changePass(String newPass){
        if(newPass.equalsIgnoreCase(generatePass())){
            System.out.println("Have the same pass with old pass");
            return null;
        }else {
            System.out.println("Done");
            return newPass;
        }
    }
    public void upperPass(){
        this.fullpass = fullpass.toUpperCase().trim();
    }
}
