

 class Test1 {   
   Test1(int x) {
       System.out.println("Constructor called " + x);
   }
}
 
// This class contains an instance of Test1 
class test {    
   
Test1 t1 = new Test1(10); 
   test(int i) 
   {
    t1 = new Test1(i);
   } 
 
   public static void main(String[] args) { 
   	 
        test t2 = new test(5);
   }
}