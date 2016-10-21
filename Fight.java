public class Fight { //my main class

public static void main (String args[]){
	
Superhero DD=new Superhero ("Daredevil"); //creates a new hero with the name "Daredevil" and no strength (the constructor then sets it to 10)

Superhero JJ=new Superhero ("Jessica Jones", 53); //creates another hero with the name "Jessica Jones" and strength of 53
System.out.println (Superhero.fight (DD,JJ)); //executes  the fight method using the variables of the two superheroes we created and prints the winner

DD.powerUp(100); //increases daredevil's strength with 100 points
System.out.println (Superhero.fight (DD,JJ)); //executes  the fight method using the variables of the two superheroes we created and prints the winner

}
} 
