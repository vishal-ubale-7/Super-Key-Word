package Super;

public class X
{
    void show()
    {
        System.out.println("i am class in a");
    }
}
class Y extends X
{
    void show()
    {
        super.show(); // i am class in a
        System.out.println("i am class in b");
    }
    void M2(int M1 )
    {
        System.out.println(M1);
    }
    void M1()
    {
        this.M1();

    }
    public static void main(String []args)
    {
        Y  obj1 = new Y();
        obj1.show();
        obj1.M2(10);
    }
}
