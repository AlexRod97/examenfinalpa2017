package gt.edu.url.problema3;
import gt.edu.url.problema3.Animal; 

public class Main {

	public static void main(String[] args) {
		Animal bambi = new Animal("salvaje", 10, "100 lbs.", "cafecito");		
		LeakyStack<Animal> animalHistory = new ImplLeakyStack<>(1);
		
		bambi = animalHistory.saveHistory(bambi); //Push
		bambi.setSkinColor("cafe");
		bambi = animalHistory.saveHistory(bambi); //Push
		bambi.setSkinColor("cafe salvaje");
		System.out.println(bambi.getSkinColor());// Imprime café salvaje
		bambi = animalHistory.undo(); //Pop
		System.out.println(bambi.getSkinColor());// Imprime café
		bambi = animalHistory.undo(); //Lanza IllegalArgumentException por capacidad

	}

}
