class CPU{
	int price = 29999;
	class processor{
		int cores = 8;
		String mgf = "AMD RAYZEN 5";
	}
	static class RAM{
		int memory = 16;
		String mgf = "SAMSUNG";
	}
}
public class cpuInfo{
	public static void main(String args[]){
		CPU CPU_Obj = new CPU();
		CPU.processor processor_Obj = CPU_Obj.new processor();
		CPU.RAM RAM_Obj = new CPU.RAM();
		System.out.println("Number of CPU Cores 		: "+processor_Obj.cores);
		System.out.println("Number of CPU Manufacturer	: "+processor_Obj.mgf);
		System.out.println("Volume of Memory 		: "+RAM_Obj.memory);
		System.out.println("Number of Memory Manufacturer	: "+RAM_Obj.mgf);
		System.out.println("Price 				: "+CPU_Obj.price);
	}
}
