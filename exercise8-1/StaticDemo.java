 class StaticDemo{

         static int a=0;
         int b=2;

    public static void main(String[] args) {

        StaticDemo d = new StaticDemo();
        StaticDemo f = new StaticDemo();
        StaticDemo g = new StaticDemo();
        StaticDemo h = new StaticDemo();

        System.out.println(d.b);
        System.out.println(f.b);
        System.out.println(g.b);
        System.out.println(h.b);

        System.out.println(d.a);
        System.out.println(f.a);
        System.out.println(g.a);
        System.out.println(h.a);

    }
}
