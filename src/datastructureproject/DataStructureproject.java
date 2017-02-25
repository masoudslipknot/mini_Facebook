
package datastructureproject;

import java.util.Scanner;



public class DataStructureproject {
  public static  personlist  facebook;
  public static friendlist fe;
    
    public static void start(){
        facebook=new personlist();
        fe=new friendlist();
        int count=0;
        System.out.println("please add persons");
    Scanner scanner=new Scanner(System.in);
    String ans=scanner.nextLine();
   
    while(!ans.equals("x")){
        if(count>0)
         ans=scanner.nextLine();
  if(ans.equals("p")){
     System.out.println("Please Enter proper name");
     Scanner key=new Scanner(System.in);
     String now=key.nextLine();
     int re=facebook.search(now);
     if(re==0)
    
     facebook.add(now);
   else
         System.out.println("this ID has been used try another one");
     count++;
     continue;
      
      
      
  }else if(ans.equals("f")){
      
      System.out.println("Please enter first name");
      Scanner fname=new Scanner(System.in);
      String firstname=fname.nextLine();
     int result1= facebook.search(firstname);
      System.out.println("Please enter seccend name");
      Scanner sname=new Scanner(System.in);
      String secendname=sname.nextLine();
     if(secendname.equals(firstname)){
         System.out.println("Are you kidding me every person cant be friend with him or her self");
     }else{
    
     
     int result2=facebook.search(secendname);
     if(result1==1&&result2==1){
       facebook.makefriend(firstname, secendname);
        facebook.makefriend(secendname, firstname);
         System.out.println("they are now friends");
   }else
         System.out.println("these users cant be found in my facebook");
     }
     continue;
     
      
      
  }else if(ans.equals("u")){
       System.out.println("Please enter first name");
      Scanner fname=new Scanner(System.in);
      String firstname=fname.nextLine();
     int result1= facebook.search(firstname);
      System.out.println("Please enter seccend name");
      Scanner sname=new Scanner(System.in);
      String secendname=sname.nextLine();
      int result2=facebook.search(secendname);
      if(secendname.equals(firstname)){
          System.out.println("Are you kidding me every person cant be unfriende with him self");
      }else{
      if(result1==1&&result2==1){
          facebook.unfriend(firstname, secendname);
          facebook.unfriend(secendname, firstname);
          
          System.out.println("Unfriednded");
      }else{
          System.out.println("these users cant be founed in my facebook");
      }
      }
     
  }else if(ans.equals("q")){
      System.out.println("please enter first name");
    Scanner check=new Scanner(System.in);
    String ch=check.nextLine();
    System.out.println("Enter seceend name");
    Scanner se=new Scanner(System.in);
    String javid=se.nextLine();
    int result1=facebook.search(ch);
    int result2=facebook.search(javid);
    if(result1==1&&result2==1){
           facebook.checkfriendship(ch,javid);
    }else{
        System.out.println("these users cant be founed in my facebook");
    }
 
      
      
  }else if(ans.equals("l")){
      
      System.out.println("please enter proper name");
      Scanner scanner1=new Scanner(System.in);
      String sj=scanner1.nextLine();
      int result=facebook.search(sj);
      if(result==1){
          facebook.printfinder(sj);
          
      }else{
          System.out.println("this user doesnt exist");
      }
      
              
      
  }else if(ans.equals("x")){
      break;
  }else if(ans.equals("h")){
      facebook.printpersonlist();
      count++;
      
  }
    }
    
    
    }
    

    
    public static void main(String[] args) {
        start();
        
    }
    
}
