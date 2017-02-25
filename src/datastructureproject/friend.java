
package datastructureproject;

public class friend {
    person friend;
    friend next;
    public friend(person friend,friend next){
        this.friend=friend;
        this.next=next;
    }
    public friend(person friend){
        this.friend=friend;
    }
    public friend getnextfriend(){
        return next;
    }
    public person getperson(){
        return friend;
    }
    public void setpersonname(person p){
        this.friend=p;
    }
    public void setnextfriend(friend p){
        this.next=p;
    }
    
}
