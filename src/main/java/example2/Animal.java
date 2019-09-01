package example2;

class Animal	{
    String	name;
    public Animal()	{
        this.name =	"Default	Name";
    }
    //	This	is	called	a	one	argument	constructor.
    public Animal(String	name)	{
        this.name =	name;
    }

    public void changePrimitive(int toChange) {
        toChange = 5;
        System.out.println(toChange);
    }
    public static void main(String[]	args)	{
        Animal	animal =	new Animal();
        int a = 4;
        animal.changePrimitive(a);
        System.out.println(a);
    }
}
