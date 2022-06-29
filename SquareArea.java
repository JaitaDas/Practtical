public class SquareArea          //creating SquareArea class
{
	float side, area;
    void insert(float s, float a) {    //method
      side=s; 
      area=a;
      }
  void calculateArea( ) {
	  
     System.out.print(area=4*side);
  }
      class SquareArea1{            //creating another class SquareArea1
    	  public static void main(String[] args) {
    		  SquareArea r1=new SquareArea();    //creating an object   
    		  r1.insert(10.5f,5.2f);
    		  r1.calculateArea();
    	  }
   }
}
