package TP8;

public class exemple {
    public static void main(String[] args) {
String ch1="coucou";
String ch2=new String("c'est moi!\n");
String ch3=ch1+ch2;
System.out.println(ch3);
System.out.println("longueur de ch1: "+ch1.length());
System.out.println("caractere en pos 2: "+ch1.charAt(2));
System.out.println(ch1.equals("coucou"));
System.out.println(ch1.equals(ch2));
System.out.println("position de o dans ch1: "+ch1.indexOf('o'));
System.out.println("position de 'cou' dans ch1: "+ch1.indexOf("cou"));
System.out.println("position de 'moi' dans ch1: "+ch1.indexOf("cou"));
System.out.println("ch1 en majus: "+ch1.toUpperCase());
System.out.println("ch1 en minus: "+ch1.toLowerCase());
    }
}
