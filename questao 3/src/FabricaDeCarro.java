public class FabricaDeCarro {
	private static FabricaDeCarro instancia; 
	
	private FabricaDeCarro(){
	}

	public static synchronized FabricaDeCarro getInstance(){ 
		if (instancia == null){
			instancia = new FabricaDeCarro();
		}
		
		return instancia;
	} 
}