public class StringBuffer24 {
    public static void main(String [] args) {
        StringBuffer A = new StringBuffer();
        System.out.println(A.capacity());
        A.append("Frezer");

        System.out.println(A.capacity());
        A.append("Hi Frezer, How are you?");
        System.out.println(A.capacity());
        System.out.println();

        StringBuffer B= new StringBuffer();
        System.out.println("B = " + B);
        System.out.println("length = " + B.length());

        B.append("Frezer");
        System.out.println("B = " + B);
        System.out.println("length = " +B.length());
        System.out.println();

        StringBuffer C= new StringBuffer("Hi Kidane how are you?");
        System.out.println(C);
        C = C.replace(3,9,"Frezer");
        System.out.println(C);
        System.out.println();

        StringBuffer D= new StringBuffer("Hi ");
        System.out.println(D);
        D.append("Frezer");
        System.out.println(D);


    }
}


