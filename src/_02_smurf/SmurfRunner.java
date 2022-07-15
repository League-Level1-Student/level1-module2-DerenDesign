package _02_smurf;

public class SmurfRunner {
public static void main(String[] args) {
	Smurf HandySmurf = new Smurf("Handy Smurf");
	HandySmurf.eat();
	HandySmurf.getName();
	Smurf PapaSmurf = new Smurf("Papa Smurf");
	PapaSmurf.getName();
	PapaSmurf.getHatColor();
	PapaSmurf.isGirlOrBoy();
	Smurf Smurfette = new Smurf("Smurfette");
	Smurfette.getName();
	Smurfette.getHatColor();
	Smurfette.isGirlOrBoy();
}
}
