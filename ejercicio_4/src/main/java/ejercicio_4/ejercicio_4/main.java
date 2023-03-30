package ejercicio_4.ejercicio_4;

public class main {
	public static void main(String args[])  //static method  
	{ 
		Topografia agua=new Agua();
		Topografia tierra=new Tierra();
		
		
		Topografia mixtaNivel3=new Mixta(agua,agua,tierra,tierra);
		Topografia mixtaNivel2=new Mixta(agua,agua,tierra,agua);
		
		Topografia mixtaNivel1=new Mixta(agua,agua,agua,mixtaNivel3);
		Topografia mixtaNivel0=new Mixta(agua,agua,tierra,mixtaNivel2);
		
		
		
		System.out.println(mixtaNivel1.getPorcionAgua());//A,A,A,m(A,A,T,T)
		
		System.out.println(mixtaNivel0.getPorcionAgua());//A,A,T,m(A,A,T,A)
		
		//System.out.println(mixtaNivel1.equals(mixtaNivel0));		
	}
}
