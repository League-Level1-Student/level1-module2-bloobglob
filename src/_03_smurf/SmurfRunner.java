package _03_smurf;

public class SmurfRunner {
	public static void main(String[] args) {
		Smurf handySmurf = new Smurf("Handy Smurf");
		handySmurf.eat();
		System.out.println(handySmurf.getName());
		Smurf papaSmurf = new Smurf("Papa Smurf");
		System.out.println(papaSmurf.getName()+papaSmurf.getHatColor()+papaSmurf.isGirlOrBoy());
		Smurf smurfette = new Smurf("Smurfette");
		System.out.println(smurfette.getName()+smurfette.getHatColor()+smurfette.isGirlOrBoy());
	}
}
