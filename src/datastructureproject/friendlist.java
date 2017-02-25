/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructureproject;

public class friendlist {
   
  friend head;
  
   public void add(String name){
       person now=new person(name);
     friend temp=new friend(now);
     temp.next=null;
     friend current;
     if(head==null){
         head=temp;
     }else{
         current=head;
     while(current.getnextfriend()!=null){
         
         current=current.getnextfriend();
     }
     current.setnextfriend(temp);
   
     } 
 }
public void printfriendlist(){
    friend current;
    current=head;
    if(head==null){
        System.out.println("it doesnt have any friends");
    }
    while(current!=null){
        System.out.println(current.friend.getter());
        current=current.getnextfriend();
    }
}
   
   
   public int search(String name){
       int re=0;
       person p=new person(name);
    friend toop=new friend(p);
    friend q = null;
    toop.next=null;
    if(head==null){
        System.out.println("He doesnt have any friend");
        
    }else{
        q=head;
    }while(q!=null&&!q.friend.getter().equals(name)){
        q=q.getnextfriend();
    }
    if(q==null){
        re=0;
    }else{
        re=1;
    }
    return re;
   }
   public void delete(String name){
       
       
           person now=new person(name);
           friend temp=null;
           friend t=null;
           if(head==null){
               System.out.println("it doesnt have friend to delete");
           }else{
               temp=head;
               while(temp!=null&&!temp.friend.getter().equals(name)){
                   t=temp;
                   temp=temp.getnextfriend();
               }
           }
           if(temp==null){
               System.out.println("friend cant be founed");
           }else if(temp==head){
               head=(head.getnextfriend());
           }
           else{
               t.setnextfriend(temp.getnextfriend());
           }
           
       }
       
   }


