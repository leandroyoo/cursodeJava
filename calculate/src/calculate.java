
public class calculate {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[1]);
        int y = Integer.parseInt(args[2]);

        if (args[0].equals("sum")) {
            sum(x, y);
        } else if (args[0].equals("sub")) {
            sub(x, y);
        } else if (args[0].equals("div")) {
            div(x, y);
        } else if (args[0].equals("mult")) {
            multi(x, y);
        } else{
            System.out.println("Nenhuma instrução definida");
        }

    }

    static void sum(int x, int y) {
        System.out.println(x + y);
    }

    static void sub(int x, int y){
            System.out.println(x - y);
        }

    static void div(int x, int y) {
        System.out.println(x / y);
    }
    static void multi(int x, int y) {
        System.out.println(x * y);
    }


}