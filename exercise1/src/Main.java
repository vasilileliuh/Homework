public class Main {

    static class A{
        public byte b;
        public short c;
        public char d;
        public int e;
        public long f;
        public float g;
        public double h;
        public boolean i;

    }

    public static void main(String[] args) {
        System.out.println();

        A a = new A();
        System.out.println(a.b);
        System.out.println(a.c);
        System.out.println(a.d);
        System.out.println(a.e);
        System.out.println(a.f);
        System.out.println(a.g);
        System.out.println(a.h);
        System.out.println(a.i);
        int z = (a.d);
        System.out.println(z);

    }
}
