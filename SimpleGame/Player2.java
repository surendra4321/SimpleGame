package SimpleGame;

public class Player2 extends Player1 {
	//private int health;
	private boolean armour;
	public Player2(String name, String weapon, int health, boolean armour) {
		super(name, weapon, health);
		this.health = health;
		this.armour = armour;
	}
	@Override
	public void damageByGun1() {
		 
		 if(armour) {
			 this.health -= 20;
			 if(this.health <=0) 
				 this.health = 0;
			 System.out.println("Armour is on. Got Hit By gun 1. Health is reduce  by 20." + "New Health is"+ this.health);
		 }if(!armour) {
			 this.health -= 30;
			 if(this.health <=0) 
				 this.health = 0;
			 System.out.println("Armour is on. Got Hit By gun 1. Health is reduce  by 30." + "New Health is"+ this.health);
		 }
		 if(this.health == 0)
			 System.out.println(getName()+ "is dead");
	}
	@Override
	public void damagebyGun2() {
		 if(armour) {
			 this.health -= 40;
			 if(this.health <=0) 
				 this.health = 0;
			 System.out.println("Armour is on. Got Hit By gun 1. Health is reduce  by 40." + "New Health is"+ this.health);
		 }if(!armour) {
			 this.health -= 50;
			 if(this.health <=0) 
				 this.health = 0;
			 System.out.println("Armour is on. Got Hit By gun 1. Health is reduce  by 50." + "New Health is"+ this.health);
		 }	 
		 if(this.health == 0)
			 System.out.println(getName()+ "is dead");
	}
	
	
	
	

}
