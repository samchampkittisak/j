public class Dice{
	private int face;
	Dice(){
		this.face=1;
	}
	void roll(){
		this.face=(int)((Math.random()*6)+1);
	}
	int getFace(){
		return this.face;
	}
	String tostring(){
		return "face = " + this.face;
	}
}