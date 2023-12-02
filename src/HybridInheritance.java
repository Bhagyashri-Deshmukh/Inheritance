 class SolarSystem {
	 
	 public void solarSystem() {
		 System.out.println("This is solarSystem");
	 }
}
 class Earth extends SolarSystem {
	 
	 public void earth() {
		 System.out.println("This is earth");
	 }
}
 class Mars extends SolarSystem {
	 
	 public void mars() {
		 System.out.println("This is Mars");
	 }
}
 class Moon extends Earth {
	 public void moon() {
		 System.out.println("This is Moon");
	 }
}