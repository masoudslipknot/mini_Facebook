
package datastructureproject;

import java.util.LinkedList;

public class person {
  private  String name;
  private person next;
 private friendlist friendlist=new friendlist();;
 private  personlist  person;
    
 public person(String name,person next,friendlist friendlist,personlist person){
     this.name=name;
     this.next=next;
     this.friendlist=friendlist;
     this.person=person;
 }
 public person (String name){
     this.name=name;
     next=null;
 }
  public String getter(){
      
      return name;
      
      
  }
  public void setname(String name){
      this.name=name;
  }
  public person getnextperson(){
      
      return next;
      
      
  }
  public void setnextperson(person next){
      this.next=next;
  }
  public friendlist getterfreindlist(){
      
      return friendlist;
  }
  public personlist persongetter(){
      
      return person;
  }
  
    
}
