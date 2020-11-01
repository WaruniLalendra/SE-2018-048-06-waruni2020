
public class MyGame{

    public static void main(String[] args) {
        Warrior warrior_01 = new Warrior("warrior1", 115);
        Warrior warrior_02 = new Warrior("warrior2", 100);
        
        Monster monster = new Monster("monster", 313);
        
        //set first warrior's age to monster's age...
        warrior_01.changeAge(monster.age);
        
        //worriors are walking
        warrior_01.walk();
        warrior_02.walk();
        System.out.println();
        
        //moster steal walking stick of the second warrior
        monster.stealStick(warrior_02);
        
        //now second worrior become immobile 
        warrior_01.walk();
        warrior_02.walk();
    }
    
    
}

class Warrior{
    String name;
    int age;
    Boolean hasStick;
    
    Warrior(String name, int age){
        this.name = name;
        this.age = age;
        this.hasStick = true;
    }
    
    void changeAge(int age){
        this.age = age;
    }
    
    void walk(){
        if(this.hasStick == true){
            System.out.println(this.name + " is walking...");
        }else{
            System.out.println(this.name + " become immoble!!!");
        }
        
    }
}

class Monster{
    String name;
    int age;
    
    Monster(String name, int age){
        this.name = name;
        this.age = age;
    }
    
    void stealStick(Warrior warrior){
        warrior.hasStick = false;
        System.out.println();
        System.out.println(this.name + " has stolen" + warrior.name + "'s walking stick!!!");
        System.out.println();
    }
           
}