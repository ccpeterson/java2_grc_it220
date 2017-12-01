package inner_classes;

public class Hammer
{
	//fields
	private String type; //framing, mallet, claw	
	
	//constructor
	public Hammer(String type)
	{
		this.type = type;
	}
	
	//methods
	public String getType()
	{
		return type;
	}
	
	public void setType(String type)
	{
		this.type = type;
	}
	
	public void hammerNail()
	{
		Nail nail = new Nail(3,"steel");
		System.out.println("you hammer a " + nail.material);
	}
	@Override
	public String toString()
	{
		return "Hammer [type=" + type + "]";
	}

	//class in a class for organization
	public static class Nail
	{
		//fields
		private double thickness;
		private String material;
		
		//constructors
		public Nail(double thickness, String material) {
			this.thickness = thickness;
			this.material = material;
		}
		
		//methods
		public void breakNail()
		{
			//System.out.println("you broke your nail with a " + Hammer.this.type);
			System.out.println("it broke");
		}
		
		public double getThickness() {
			return thickness;
		}

		public void setThickness(double thickness) {
			this.thickness = thickness;
		}

		public String getMaterial() {
			return material;
		}

		public void setMaterial(String material) {
			this.material = material;
		}

		@Override
		public String toString() {
			return "Nail [thickness=" + thickness + ", material=" + material + "]";
		}
		
		
		
		
		
		
	}

}
