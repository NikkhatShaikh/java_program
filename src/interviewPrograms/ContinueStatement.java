package interviewPrograms;
// what is use of break and continue statement
// break: used to break loop
//continue: used to skip to particular iteration
public class ContinueStatement {
    public static void main(String[] args) {

        for (int i=0;i<=10;i++){
            if(i==5){
                continue;   //skip condition so it will skip 5th item
            }
            System.out.println(i);
        }
    }
}
