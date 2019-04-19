package com.kahol;

import java.util.*;

class Commal {
    Scanner sc = new Scanner(System.in);
    String u_name;

    List<User> user = new ArrayList<>();
    List<Admin> admin = new ArrayList<>();
    List<Alumni> alumni = new ArrayList<>();
    List<String> message = new ArrayList<>();
    List<String> openMsg = new ArrayList<>();

    List<User1> user1= new ArrayList<>();
    List<Alumni1> alumni1 = new ArrayList<>();
    Queue<String> USERNAME= new LinkedList<>();

    User u = new User();
    Alumni al=new Alumni();

    public static void clear(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    public void signUser(){
        clear();
        User1 u1= new User1();
        System.out.print("\nStudent name :");
        u.uName=sc.nextLine();
        System.out.print("Gender :");
        u.gender=sc.nextLine();
        System.out.print("Mobile no :");
        u.mNo=sc.nextLine();
        System.out.print("University ID :");
        u.UId=sc.nextLine();
        System.out.print("E-mail :");
        u.email=sc.nextLine();
        System.out.print("Password :");
        u.pwd=sc.nextLine();

        u1.email=u.email;       //---<
        u1.pwd=u.pwd;           //---<

        user.add(u);
        user1.add(u1);
        USERNAME.add(u.uName);
    }
    public void signAlumni(){
        clear();
        Alumni1 al1=new Alumni1();

        System.out.print("\nAlumni name :");
        al.uname=sc.nextLine();
        System.out.print("Gender :");
        al.gender=sc.nextLine();
        System.out.print("Email :");
        al.email=sc.nextLine();
        System.out.print("Password :");
        al.pwd=sc.nextLine();
        System.out.print("Batch:");
        al.batch=sc.nextLine();

        al1.email=al.email;     //----<
        al1.pwd=al.pwd;     //-----<

        alumni.add(al);
        alumni1.add(al1);
        USERNAME.add(al.uname);

    }
    public void adminHome(){
        clear();
        System.out.println("*******************************");
        boolean isQuit=false;
        int choice;
        while(!isQuit){
            System.out.println("\t\t\tPress :"+"\n\t\t\t\t1 - for Student's details"+"\n\t\t\t\t2 - for Alumni's details"+"\n\t\t\t\t3 - Go back to main menu\n");
            System.out.println("Enter your choice :");
            choice= sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1:
                    System.out.println("Student Details :\n"+user);
                    break;
                case 2:
                    System.out.println("Alumni Details :\n"+alumni);
                    break;
                case 3:
                    isQuit=true;
                    break;
            }
        }
    }
    public void showMsg(){
        Iterator itr= message.iterator();
        boolean flag=itr.hasNext();
        if(flag){
            System.out.println("****************************************************************************************");
        }
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        if(flag){
            System.out.println("****************************************************************************************");
        }
    }
    public void requestFriend(){
        System.out.print("Enter other's user-name :");
        String uname = sc.nextLine();
        if(USERNAME.contains(uname)){
            System.out.println(uname+" is verified");
            System.out.println("****************************************************************************************");
            boolean isQuit=false;
            int choice;
            while(!isQuit){
                System.out.println("Press :\n"+"\t1 - join chat"+"\n\t2 - go back to menu");
                System.out.print("Pick one :");
                choice= sc.nextInt();
                sc.nextLine();
                switch(choice){
                    case 1:
                        showMsg();
                        System.out.println("Enter message :");
                        String msg;
                        msg="@"+u_name+" : ";
                        msg+=sc.nextLine();
                        message.add(msg);
                        break;
                    case 2:
                        isQuit=true;
                        break;
                }
            }
        }
        else {
            System.out.println("\tInvalid user name!");
        }
    }
    public void showOpenMsg(){
        Iterator itr= openMsg.iterator();
        boolean flag=itr.hasNext();
        if(flag){
            System.out.println("****************************************************************************************");
        }
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        if(flag){
            System.out.println("****************************************************************************************");
        }
    }
    public void openChat(){
        System.out.println("*************************************************************************************");
        boolean isQuit=false;
        int choice;
        while(!isQuit){
            System.out.println("Press :\n"+"\t1 - join chat"+"\n\t2 - show chat"+"\n\t3 - go back to menu");
            System.out.print("Pick one :");
            choice= sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1:
                    showOpenMsg();
                    System.out.println("Enter your message :");
                    String mess="@"+u_name+" : ";
                    mess+=sc.nextLine();
                    openMsg.add(mess);
                    break;
                case 2:
                    showOpenMsg();
                    break;
                case 3:
                    isQuit=true;
                    break;
            }
        }
    }
    public void userHome(){
        clear();
        System.out.println("*************************************************************************************");
        boolean isQuit=false;
        int choice;
        while(!isQuit){
            System.out.println("Press :"+"\n\t\t\t\t1 - private chat"+"\n\t\t\t\t2 - Public Chatroom"+"\n\t\t\t\t3 - Go back to main menu\n");
            System.out.print("Enter your choice :");
            choice= sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1:
                    requestFriend();
                    break;
                case 2:
                    openChat();
                    break;
                case 3:
                    isQuit=true;
                    break;
            }
        }
    }
    public void alumniHome(){
        clear();
        System.out.println("*******************************");
        boolean isQuit=false;
        int choice;
        while(!isQuit){
            System.out.println("Press :"+"\n\t\t\t\t1 - private chat"+"\n\t\t\t\t2 - Public Chatroom"+"\n\t\t\t\t3 - Go back to main menu\n");
            System.out.print("Enter your choice :");
            choice= sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1:
                    requestFriend();
                    break;
                case 2:
                    openChat();
                    break;
                case 3:
                    isQuit=true;
                    break;
            }
        }
    }
    public boolean contains(User1 a1){
        for(User1 u:user1){
            if(u.email.equals(a1.email) && u.pwd.equals(a1.pwd)){
                return true;
            }
        }
        return false;
    }
    public void logUser(){
        clear();
        User1 u1=new User1();
        System.out.print("Email :");
        u1.email=sc.nextLine();
        System.out.print("password :");
        u1.pwd=sc.nextLine();
        if( contains(u1)){
            System.out.println("\n\t"+u.uName+" has successfully logged in!!!\n");
            u_name=USERNAME.remove();
            USERNAME.add(u_name);
            u.uName=u_name;
            userHome();
        }
        else{
            System.out.println("\tIncorrect email and password!");
        }
    }
    public boolean contains(Alumni1 a1){
        for(Alumni1 u:alumni1){
            if(u.email.equals(a1.email) && u.pwd.equals(a1.pwd)){
               return true;
            }
        }
        return false;
    }
    public void logAlumni(){
        clear();
        Alumni1 a1=new Alumni1();
        System.out.print("Email :");
        a1.email=sc.nextLine();
        System.out.print("Password :");
        a1.pwd=sc.nextLine();
        if(contains(a1)){
            System.out.println("\n\t"+al.uname+" has successfully logged in!!!");
            u_name=USERNAME.remove();
            USERNAME.add(u_name);
            al.uname=u_name;
            alumniHome();
        }
        else{
            System.out.println("\tIncorrect email and password!");
        }

    }
    public void logAdmin(){
        clear();
        Admin ad=new Admin();
        ad.setAdminEmail("admin@gmail.com");
        ad.setPwd("qwerty");
        String email;
        String pwd;
        System.out.print("\nAdmin email :");
        email=sc.nextLine();
        System.out.print("Password :");
        pwd=sc.nextLine();
        if(email.equals(ad.getAdminEmail()) && pwd.equals(ad.getPwd()) ){
            System.out.println("\n\tYou have successfully logged in");
            adminHome();
        }
        else{
            System.out.println("\tIncorrect email and password");
        }
        admin.add(ad);
    }
}