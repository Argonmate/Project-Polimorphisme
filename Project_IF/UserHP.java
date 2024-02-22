package Project_IF;

public class UserHP {
    
    private HP HP;

    public UserHP(HP HP) {
        this.HP = HP;
    }
    
    void turnOnThePhone(){
        this.HP.powerOn();
    }
    
    void turnOffThePhone(){
        this.HP.powerOff();
    }
    
    void makePhoneLouder(){
        this.HP.volumeUp();
    }
    
    void makePhoneSilent(){
        this.HP.volumeDown();
    }
}
