class Animal { //parent class  
    void Action_eat()
    {
        System.out.print("Eating");
    }  
}  

class Cat extends Animal  {  //child class 
    void Action_bark()
    {
        System.out.print("Mewing");
         
    }  
}  
class Main{    //main class
    public static void main(String args[]){  
        Cat c=new Cat();     //create an object of child class
        System.out.print("The cat is ");
        c.Action_bark(); 
        System.out.print("\nThe cat is ");
        c.Action_eat();     
    }
}  
