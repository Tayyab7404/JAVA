// week 3:

package week3;

class Outer {
    
    static int outer_x = 10;
    
    class Inner
    {
        void display()
        {
            System.out.println("Outer x = " + outer_x);
        }
    }

    void test()
    {
        Outer.Inner obj2 = new Inner();

        obj2.display();
    }
}

class InnerDemo
{
    public static void main(String[] args){
        Outer obj1 = new Outer();

        obj1.test();
    }
}