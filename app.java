import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.util.Random;
/**
 *Aryan Payne
 *4/17/19
 */
public class app{
    private static String msg = "";
    public static void main(){
        double crash = Math.random();
        if(crash <= 0.1){
            System.out.println('\u000C'+"The app has crashed, please try again later.");
            System.exit(0);
        }
        System.out.println('\u000C'+"If you need anything just ask for 'info'");
        String act = "";
        act = UserInput.getString();
        while(!act.equals("close")){
            switch(act){
                case "info":
                msg = "You can add, search, get info, and close";
                break;
                case "add":
                msg = add();
                break;
                case "search":
                msg = search();
                break;
            }
            System.out.println(msg);
            System.out.println('\u000C'+"If you need anything just ask for 'info'");
            act = UserInput.getString();
        }
        if(act.equals("close")){
            System.out.println("Good bye!");
            System.exit(0);
        }
    }
    public static String add(){
        System.out.println('\u000C'+"What would you like to add, clear, or would you like to go 'back'");
        String act2 = UserInput.getString();
        if(act2.equals("back")){
            main();
        }
        if(act2.equals("close")){
            System.out.println("Good bye!");
            System.exit(0);
        }
        if(act2.equals("clear")){
            InfoFile.writeString2("");
            InfoFile.saveAndClose();
            main();
        }
        while(act2.equals("add")){
            System.out.println("If you do not have the information just input none.");
            System.out.println("What is the name?");
            String n = UserInput.getString();
            String act5 = "";
            if(n.equals("close")){
                System.out.println("Good bye!");
                System.exit(0);
            }
            System.out.println("What is the address?");
            String a = UserInput.getString();
            if(a.equals("close")){
                System.out.println("Good bye!");
                System.exit(0);
            }
            System.out.println("What is the phone number?");
            String pn = UserInput.getString();
            if(pn.equals("close")){
                System.out.println("Good bye!");
                System.exit(0);
            }
            System.out.println("What is the occupation?");
            String o = UserInput.getString();
            if(o.equals("close")){
                System.out.println("Good bye!");
                System.exit(0);
            }
            System.out.println("Name: "+n+"\nAddress: "+a+"\nPhoneNumber: "+pn+"\nOccupation: "+o+"\nWould you like to save?");
            String act4 = UserInput.getString();
            if(act4.equals("close")){
                System.out.println("Good bye!");
                System.exit(0);
            }
            if(act4.toLowerCase().equals("yes")){
                InfoFile.writeString(n+"/"+a+"/"+pn+"/"+o);
                InfoFile.saveAndClose();
            }
            if(act4.toLowerCase().equals("no")){
                main();
                break;
            }
        }
        msg = "If you need anything just ask for 'info'";
        return msg;
    }
    /**
    public static String delete(){
        System.out.println('\u000C'+"What would you like to delete or would you like to go 'back'");
        String act2 = UserInput.getString();
        if(act2.equals("back")){
            main();
        }
        if(act2.equals("close")){
            System.out.println("Good bye!");
            System.exit(0);
        }
        msg = "If you need anything just ask for 'info'";
        return msg;
    }
    **/
    public static String search(){
        System.out.println("Would you like to search by address, phone number, \noccupation, email, get 'help', get 'all' or would you like to go 'back'");
        String act2 = UserInput.getString();
        if(act2.equals("back")){
            main();
        }
        if(act2.equals("close")){
            System.out.println("Good bye!");
            System.exit(0);
        }
        if(act2.equals("all")){
            InfoFile.readString();
        }
        while(!act2.equals("back") || !act2.equals("close")){
            switch(act2){
                case "help":
                msg = "You can search by; address, phone number, email, or occupation";
                break;
                case "address":
                msg = address();
                break;
                case "phone number":
                msg = phone();
                break;
                case "occupation":
                msg = occupation();
                break;
                case "email":
                msg = email();
                break;
            }
        }
        return msg;
    }
    public static String address(){
        msg = "If you need anything just ask for 'info'";
        String act2 = UserInput.getString();
        if(act2.equals("back")){
            main();
        }
        if(act2.equals("close")){
            System.out.println("Good bye!");
            System.exit(0);
        }
        return msg;
    }
    public static String phone(){
        msg = "If you need anything just ask for 'info'";
        String act2 = UserInput.getString();
        if(act2.equals("back")){
            main();
        }
        if(act2.equals("close")){
            System.out.println("Good bye!");
            System.exit(0);
        }
        return msg;
    }
    public static String occupation(){
        msg = "If you need anything just ask for 'info'";
        String act2 = UserInput.getString();
        if(act2.equals("back")){
            main();
        }
        if(act2.equals("close")){
            System.out.println("Good bye!");
            System.exit(0);
        }
        return msg;
    }
    public static String email(){
        msg = "If you need anything just ask for 'info'";
        String act2 = UserInput.getString();
        if(act2.equals("back")){
            main();
        }
        if(act2.equals("close")){
            System.out.println("Good bye!");
            System.exit(0);
        }
        return msg;
    }
}