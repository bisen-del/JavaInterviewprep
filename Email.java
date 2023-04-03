package com.kunal;

import java.util.Locale;
import java.util.Scanner;

public class Email {
    private String firstName;
    private String alternativemail;
    private String LastName;
    private String password;
    private int mailboxcapacity=500;
    private String department;
    private int defaultPasswordLength=10;
    private String email;
    private String suffix="company.com";

    public Email(String firstName,String LastName){
        this.firstName=firstName;
        this.LastName=LastName;
        System.out.println("Email created:"+this.firstName+" "+this.LastName);
        this.department=setDepartment();
        System.out.println("Department:"+this.department);
        this.password=randompass(8);
        System.out.println("Your password is:"+this.password);
        email=firstName.toLowerCase()+"."+LastName.toLowerCase()+"@"+department+"."+suffix;
        System.out.println("Your email is:"+email);

    }
    private String setDepartment(){
        System.out.println("Department code \n1 for sales \n2 for Department \n3 for Accounting \n0 for none\n Enter Department code");
        Scanner in =new Scanner(System.in);
        int dep=in.nextInt();
        if(dep==1){
            return "sales";
        }else if(dep==2){
            return "dev";
        }else if(dep==3){
            return "Accounting";
        }else{
            return "";
        }
    }
    private String randompass(int lenght){
        String passwordSet="ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%";
        char[] password=new char[lenght];
        for(int i=0;i<lenght;i++){
          int rand=  (int) (Math.random()*passwordSet.length());
          password[i]=passwordSet.charAt(rand);
        }
        return new String(password);
    }
    public void setMailboxcapacity(int capacity){
        this.mailboxcapacity=capacity;
    }
    public void setAlternativemails(String alternate){
        this.alternativemail=alternate;
    }
    public void changePassword(String Password){
        this.password=Password;
    }
    public int getMailboxcapacity(){
        return mailboxcapacity;
    }
    public String getAlternativemail(){
        return alternativemail;
    }
    public String getPassword(){
        return password;
    }
    public String showInfo(){
        return "Display name:"+firstName+" "+LastName+"\n Comapany Email:"+email+"\n MailBox Capacity:"+mailboxcapacity;
    }

}
