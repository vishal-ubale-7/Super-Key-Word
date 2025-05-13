package Super;

public class A
{
    int a =10;

}
class B extends A
{
    int a = 20;
    void show(int a)
    {
        System.out.println(a); //30
        System.out.println(this.a);  //20 current class object
        System.out.println(super.a); //10 point the parent class instance variable
    }
    public static void main(String []args)
    {
        B obj1 = new B();  // create object B-class
        obj1.show(30);  // call the method
    }
}
