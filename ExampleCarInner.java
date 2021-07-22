package com.ust.example;

class Caar{
	String carName;
	String carType;
	
	Caar(String name, String type){
		this.carName=name;
		this.carType= type;
		
	}
	
	private String getCArName() {
		return this.carName;
	}
	class Engine{
		String engineType;
		
		void SetEngine() {
			if(Caar.this.carType.equals("4WD")) {
			//	getCarName()
				if(Caar.this.getCArName().equals("Crysler")) {
					this.engineType="Smaller";
				}
				else {
					this.engineType="Bigger";
				}
			}
			else {
				this.engineType="Bigger";
			}
		}
		String getEngineType() {
			return this.engineType;
		}
	}
}

public class ExampleCarInner {

	public static void main(String[] args) {
		Caar Car1= new Caar("Mazda","8WD");
		Caar.Engine engine= Car1.new Engine();
		engine.SetEngine();
		System.out.println("Engine Type for 8WD ="+engine.getEngineType());
		Caar car2= new Caar("Crysler","4WD");
		Caar.Engine c2engine =car2.new Engine();
		c2engine.SetEngine();
		System.out.println("Engine Type for 4WD ="+c2engine.getEngineType());
		
	}

}
