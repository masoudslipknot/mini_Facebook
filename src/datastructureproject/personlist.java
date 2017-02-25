package datastructureproject;

import java.util.LinkedList;

public class personlist {
public static friendlist fe;
    private person head=null;
    private int personlistcount;

    public personlist() {
        //head=new person(null);
        personlistcount = 0;
    }

    public void add(String name) {
        person temp = new person(name);
        person current = head;
        if (head == null) {
            head = temp;
        } else {
            while (current.getnextperson() != null) {

                current = current.getnextperson();
            }

            current.setnextperson(temp);
        }
        personlistcount++;
    }

    public int  search(String name) {
        
        int re=0;
        person toop=new person("");
        toop.setnextperson(null);
        person q = null;
        toop.setname(name);
        
        if(head==null){
            
        }else{
            q=head;
            
            while(q!=null&&!q.getter().equals(toop.getter())){
                q=q.getnextperson();
                
            }
            if(q==null)
                re=0;
            else{
                re=1;
                
            }
                
        }
       
        

        
        return re;
    }
    /*
     public void deleteperson(String name){
      person now=new person(name);
           person temp=null;
           person t=null;
           if(head==null){
               System.out.println("there is no one to delete");
           }else{
               temp=head;
               while(temp!=null&&!temp.getter().equals(name)){
                   t=temp;
                   temp=temp.getnextperson();
               }
           }
           if(temp==null){
               System.out.println("friend cant be founed");
           }else if(temp==head){
               head=(head.getnextperson());
           }
           else{
               t.setnextperson(temp.getnextperson());
           }
     
         
     
     
     
     
     }
     */

    public void printpersonlist() {
        person current;
        /*
         if(head.getnextperson().equals(null)){
         System.out.println("list is empty");
         }
         else{
         */
        current = head;
        if(head==null){
            System.out.println("list is empty");
        }
        
        while (current != null) {
            System.out.println(current.getter());
            current = current.getnextperson();

        }
        
    }
    public void makefriend(String name1,String name2){
        
         person toop=new person("");
        toop.setnextperson(null);
        person q = null;
        
        toop.setname(name1);
       // count++;
        
        
        if(head.getnextperson()==null){
            System.out.println("list is emoty");
        }else{
            q=head;
            
            while(q!=null&&!q.getter().equals(toop.getter())){
                q=q.getnextperson();
                
            }
            
            fe=q.getterfreindlist();
            fe.add(name2);
            
        
    }


}
    public void printfinder(String name){
         person toop=new person("");
        toop.setnextperson(null);
        person q = null;
        toop.setname(name);
        
        if(head.getnextperson()==null){
            System.out.println("list is emoty");
        }else{
            q=head;
            
            while(q!=null&&!q.getter().equals(toop.getter())){
                q=q.getnextperson();
                
            }
        fe=q.getterfreindlist();
        fe.printfriendlist();
    }
}
    public void unfriend(String name1,String name2){
           
         person toop=new person("");
        toop.setnextperson(null);
        person q = null;
        
        toop.setname(name1);
        
           
        
        
        if(head.getnextperson()==null){
            System.out.println("list is emoty");
        }else{
            q=head;
            
            while(q!=null&&!q.getter().equals(toop.getter())){
                q=q.getnextperson();
                
            }
        
        
            fe=q.getterfreindlist();
            int result=fe.search(name2);
            if(result==1){
            fe.delete(name2);
            
            }
            
        else{
            System.out.println("he is not his friend");
        }
        
        
            
       
    }
}
    public void checkfriendship(String name1,String name2){
        
        person toop=new person("");
        toop.setnextperson(null);
        person q = null;
        
        toop.setname(name1);
       // count++;
        
        
        if(head.getnextperson()==null){
            System.out.println("list is emoty");
        }else{
            q=head;
            
            while(q!=null&&!q.getter().equals(toop.getter())){
                q=q.getnextperson();
                
            }
        fe=q.getterfreindlist();
       int res= fe.search(name2);
       if(res==1){
           System.out.print("yes");
       }else{
           System.out.print("no");
       }
    }
}
}
