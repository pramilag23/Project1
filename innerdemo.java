class outer
{
 int i;
void show()
{
System.out.println("The outer class value"+i);

 class inner

{
 int j;

void disp()
{
System.out.println("The inner class value");
}
}
inner i=new inner();
i.disp();
}}
class innerdemo
{
public static void main(String[] args)
{


outer obj=new outer()
{
void show()
{
System.out.println("ANONYMOUS CLASS");
}};
 obj.i=10;
obj.show();


}}

