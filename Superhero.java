public class Superhero {  
private String name; //initialising the name of the hero, private so it cant be accessed outside of the class, string - because its a name (block of text)
private int strength; //initialising the strength of the hero, private for the same reason, int because we will use integers to indicate the strenght
    
public Superhero (String n){ //a constructor for a Superhero that doesnt have strength
this.name=n;      
this.strength=10; //sets the superhero's strength to 10
    }
public  Superhero (String n, int s){ //a constructor for a Superhero that has both a name and strength
       
this.name=n;      
this.strength=s;
    
}
public void powerUp(int p){  // a method that sums p and the given hero's strength
	this.strength=this.strength+p;
    }
    
public static String fight (Superhero a, Superhero b){  //a method that compares the two superheroes' strength and returns the name of the winner
	if (a.strength>b.strength) return a.name; //if the strength of the first hero is bigger than the strength of the second this block of code executes and returns the first hero's name
    return b.name; // in all other cases (where the second hero has equal to or bigger strength that the first one) the upper block of code hasnt executed so this block of code runs and returns the second hero's name
    
}
	
	

} 
