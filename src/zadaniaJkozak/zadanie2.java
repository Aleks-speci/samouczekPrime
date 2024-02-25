package zadaniaJkozak;

import java.util.Scanner;

public class zadanie2 {
        public static void main(String[] args) {

           /* int a,b,c;
            String t;
            Scanner in = new Scanner(System.in);

            t = in.nextLine();
            a = Integer.parseInt(t);
            t = in.nextLine();
            b = Integer.parseInt(t);
            t = in.nextLine();
            c = Integer.parseInt(t);

            System.out.println("max= "+ max(a,b,c));
            System.out.println("min= "+  (a,b,c));*/


                Scanner scanner = new Scanner(System.in);
                System.out.println("Podaj 3 liczby: ");
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                int c = scanner.nextInt();
                if (a > c && a > b) {
                        System.out.println(a);
                } else if (b > a && b > c) {
                        System.out.println(b);
                } else {
                        System.out.println(c);
                }

        }
}

       /*public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            int a=scanner.nextInt();
            int b=scanner.nextInt();
            int c=scanner.nextInt();

            if (a<b && a<c){
                    System.out.println(a);
            }
            else if (b<a || b<c){

                    System.out.println(b);
            }

            else {
                    System.out.println(c);
            }


        }
    }*/

