package _01_sea_creature;

public class SeaCreatureRunner {
public static void main(String[] args) {
	SeaCreature sea = new SeaCreature("Spongebob");
	SeaCreature sea1 = new SeaCreature("Patrick");
	SeaCreature sea2 = new SeaCreature("Squidward");
	sea.eat();
	sea.laugh();
	sea1.getName();
	sea2.getName();
	sea1.eat();
	sea2.eat();
	sea2.laugh();
	sea1.laugh();
}
}
