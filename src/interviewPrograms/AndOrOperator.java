package interviewPrograms;

// && :- all conditions are true return ture
// || :- if anyone conditions is true return true
public class AndOrOperator {
    public static void main(String[] args) {
        String user="nikkhat";
        String password="xyz";
        String department="developer";
        String company="tcs";

        if(user.equals("nikkhat")&&password.equals("xyz")){
            System.out.println("login");
        }else {
            System.out.println("user password mismatched !!");
        }

        if(department.equals("java")||company.equals("tcs")){
            System.out.println("promoted");
        }else {
            System.out.println("not promoted");
        }

    }
}
