public class Dancer  extends Character{
	public void dance() {
		System.out.println(this.name+"は、踊った");
	}
	public void attack(Matango m) {
		System.out.println(this.name+"の、攻撃");
		m.hp-=5;
	}

}
