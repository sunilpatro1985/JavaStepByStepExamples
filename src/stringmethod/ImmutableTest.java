package stringmethod;

public class ImmutableTest {

    public static void main(String []args){

        StringBuffer str1 = new StringBuffer("qavbox");
        StringBuffer str2 = new StringBuffer("qavbox");
        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str2));
        str1.append("Hello");
        System.out.println(str1);

        /*String str1 = "qavbox";
        String str2 = "qavbox";
        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str2));
        //str1 = "qavalidation";
        //System.out.println(System.identityHashCode(str1));

        str1 = str1.concat("Hello");

        System.out.println(str1);*

         */

    }
}











