public class Hello {

    public static void main(String[] args){
        System.out.println(hello2());


    }

    public static void hello1()
    {

        int a =1;
        int b =2;
        int c = a+b;
        System.out.println("hello1"+System.currentTimeMillis());
    }

    public static int hello2()
    {

        int a =1;
        int b =2;
        int c = a+b;
        String s ="abc";
        System.out.println("hello2"+System.currentTimeMillis());
        return a;

    }
}
