
public class Cuboid {
	public static double length;
	  public static double breadth;
	  public static double height;
	
	public static double volume()
		{
			return length*breadth*height;
		}
	Cuboid(double length, double breadth, double height){
		
	}
	public boolean isCube() {
        
        if(length > 0 && breadth > 0 && height > 0 && length == breadth && breadth == height) {
        	return true;
        }
        else {
        	return false;
        }
    }
	
		public static void main(String[] args) {
	        Cuboid cube1 = new Cuboid(3, 4, 5);
	        Cuboid cube2 = new Cuboid(3, 4, 0); 

	        System.out.println("cuboid: " + cube1.isCube());
	        System.out.println("cuboid: " + cube2.isCube());
	    }
		
	}
