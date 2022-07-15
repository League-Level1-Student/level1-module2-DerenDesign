package _03_tea_maker;

import _03_tea_maker.Kettle.Water;

public class TeaMakerRunner {
	public static void main(String[] args) {
		TeaBag teabag = new TeaBag("MINT");
		teabag.getFlavor();
		Kettle kettle = new Kettle();
		kettle.getWater();
		kettle.boil();
		Cup cup = new Cup();
		cup.makeTea(teabag, kettle.getWater());
		
		
	}

}
