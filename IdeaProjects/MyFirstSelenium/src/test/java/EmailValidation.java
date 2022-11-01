public class EmailValidation {

    static boolean isValidEmail(String email){


        String[] a=email.split("@");
        //System.out.println(a.length);
        if (a.length !=2 || a[0].equals(" ")) return false;  //username
        return a[1].split("\\.").length == 2;  //domain

    }

    public static void main(String[] args) {
        String email1 = "mdanees4242@gmail.com";
        String email2 = "md anees@gmail";
        String email3 = "md.com";
        System.out.println(isValidEmail(email1));
        System.out.println(isValidEmail(email2));
        System.out.println(isValidEmail(email3));


    }
}
