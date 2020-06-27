

public class UsoArraysDos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arrayRandom = new int[150];
		
		for(int i = 0; i < arrayRandom.length; i++) {
			
			arrayRandom[i] = (int)Math.round(Math.random()*100);
			
		}
		
		for(int numero : arrayRandom) {
			
			System.out.print(numero + " ");
		}
		

	}

}
