package Demo;

public class Bin {

    public static void main (String[] args) {

        BinString bs = new BinString();

        String str = "O meu nome é Diogo.";
        System.out.println("String: " + str);
        System.out.println("String convertida: " + bs.convert(str));

        }
    
}
