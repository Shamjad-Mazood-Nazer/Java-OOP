class VehicleDetails{
	
	
	String vname, vmodel;
	int vCC, vprice;
	
	VehicleDetails(){  }
	
	VehicleDetails(String vname, String vmodel, int vCC, int vprice){
		this.vname= vname;
		this.vprice= vprice;
		this.vmodel= vmodel;
		this.vCC= vCC;
	}
	
	void details(){
		System.out.println("The Car Name is : "+vname);
		System.out.println("The Car-Model name is : "+vmodel);
		System.out.println("The Car Serial Number is : "+vCC);
		System.out.println("The Car Price is : Rs."+vprice);
		System.out.println("\n");
	}
}

class Vehicle{
	public static void main(String args[]){
		VehicleDetails[] vehicleDetails= new VehicleDetails[3];
		
		vehicleDetails[0]= new VehicleDetails("YAMAHA R15","V3", 155, 240000);
		vehicleDetails[0].details();
		
		vehicleDetails[1]= new VehicleDetails("HYNDAI i20","sportz", 1500, 1200000);
		vehicleDetails[1].details();
		
		vehicleDetails[2]= new VehicleDetails("KTM RC","390",375, 375000);
		vehicleDetails[2].details();
	}
}
