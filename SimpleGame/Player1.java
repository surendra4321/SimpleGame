package SimpleGame;

public class Player1 {
	public String name;
	 public String weapon;
	 public int health;

	public Player1(String name, String weapon, int health) {
		super();
		this.name = name;
		this.weapon = weapon;
		this.health = health;
		if(health<0 || health>100)
			this.health = 100;
		else this.health = health;
	}

	 
	public void damageByGun1() {
		this.health -= 30;
		if (this.health <= 0) {
			this.health = 0;
		}
		System.out.println("Got Hit by Gun 1. Health is reduced by 30" + ".New heath is " + this.health);
         if(this.health == 0) {
        	 System.out.println( getName()+"  is Dead");
         }
	}
  public void damagebyGun2() {
	  this.health -= 50;
		if (this.health <= 0) {
			this.health = 0;
		}
		System.out.println("Got Hit by Gun 2. Health is reduced by 50" + ".New heath is " + this.health);
       if(this.health == 0) {
      	 System.out.println(getName()+"  is Dead");
       }
	  
  }

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getWeapon() {
	return weapon;
}

public void setWeapon(String weapon) {
	this.weapon = weapon;
}

public int getHealth() {
	return health;
}

public void setHealth(int health) {
	this.health = health;
}
  
}
