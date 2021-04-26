class C {
public int x = 1;
public C(int i)
 { 
System.out.println("B  x="+x);
System.out.println("B  i="+i);
//System.out.println(ar[0].x + ar[1].x);
x += i;
System.out.println("A  x="+x);
System.out.println("A  i="+i);
 }
}
class D extends C {
public D(int i) { super(i); x += i; }
}
class t {
public static void main(String argv[]) {
C ar[] = new C[2];
ar[0] = new C(1);
//System.out.println(ar[0].x );
ar[1] = new D(2);
//System.out.println(ar[1].x);
System.out.println(ar[0].x + ar[1].x);
}
}