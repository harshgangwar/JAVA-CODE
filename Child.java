//To access the class variable of his Grandparent, child class use typecasting .

//For eg.

class Dadaji

{

int x=80;

}

class Base extends Dadaji 

{

int x=50;

}

class Child extends Base 

{

int x=20;

void show() 

{

System.out.println(x); // output 20

System.out.println(super.x);  // output 50

System.out.println(((Dadaji)this).x); //output 80
}

public static void main(String... h)
{
    Child c=new Child();
        c.show();
      // System.out.println((Dadaji)(1).x);  //output 80
}
}

