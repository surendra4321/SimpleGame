package SimpleGame;

public class MainControl {
	public static void main(String[] args) {
		
		Player1 player = new Player1( "Shakti",  "sword",  100);
//			System.out.println(player.getName());	
	//	System.out.println(player.getHealth());	
//			System.out.println(player.getWeapon());	
//	
	
//	player.damageByGun1();
//	player.damageByGun1();
//	player.damagebyGun2();;
	
		Player2 betterplayer = new Player2( "Bahubali",  "AK47",  100, true);
	 betterplayer.damageByGun1();
	 betterplayer.damageByGun1();
	 betterplayer.damagebyGun2();
	 betterplayer.damageByGun1();
	}
	

}
