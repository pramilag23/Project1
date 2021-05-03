package javaapplication264;

interface Anonymous
{
void show();
}
class Lambdademo
{
        public static void main(String[] args)
  {
Anonymous obj=new Anonymous()
    {

public void show()
       {
        System.out.println("Inside function");
       }
    };
obj.show();
   }
}