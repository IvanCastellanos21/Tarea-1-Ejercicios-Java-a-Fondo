public class Main {
    public static void main(String[] args) {
        //Ej. 1.3.1.1
        String s = "Hola";
        int x = s.length(); // Retorna: 4
        System.out.println(x + "\n");

        //Ej. 1.3.1.2
        String s1 = "Hola";
        boolean b1 = s1.isEmpty(); // Retorna: false
        System.out.println(b1 + "\n");

        //Ej. 1.3.1.3
        String s2 = "";
        boolean b2 = s2.isEmpty(); // Retorna: true
        System.out.println(b2 + "\n");

        //Ej. 1.3.1.3
        String t = "Hola";
        for(int i=0; i<t.length(); i++){
            char c = t.charAt(i);
            System.out.println(c); // Salida: H o l a
        }
        System.out.println("\n");

        //Ej. 1.3.1.4
        String x2 = "Hola";
        String y = "Hola";
        if (x2.equals(y)){ //Compara sus contenidos, retorna: true
            System.out.println("Si pasa por aqui! " + "\n");
        }

        //Ej. 1.3.1.5
        String s3 = "Hola, como estas?";

        int p1 = s3.indexOf('a'); //retorna: 3
        System.out.println(p1);

        int p2 = s3.lastIndexOf('a');
        System.out.println(p2); //retorna: 4

        System.out.println("\n");

        //Ej. 1.3.1.6
        String s4 = "Hola, como estas? Estas como querias?";

        int p3 = s4.indexOf("como"); //retorna: 6
        System.out.println(p3);

        int p4 = s4.indexOf("estas"); //retorna: 11
        System.out.println(p4);

        int p5 = s4.lastIndexOf("como"); //retorna: 24
        System.out.println(p5);

        System.out.println("\n");

        //Ej. 1.3.1.7
        String s5 = "Hola, como estas?";

        String may = s5.toUpperCase(); //retorna: HOLA, COMO ESTAS?
        System.out.println(may);

        String min = s5.toLowerCase(); //retorna: hola, como estas?
        System.out.println(min);

        System.out.println("\n");

        //Ej. 1.3.1.8
        String s6 = "Hola, como estas?";
        String s6_1 = s6.substring(0,4); //retorna: Hola
        System.out.println(s6_1);

        String s6_2 = s6.substring(6,10); //retorna: como
        System.out.println(s6_2);

        String s6_3 = s6.substring(11); //retorna: estas
        System.out.println(s6_3);

        System.out.println("\n");

        // Ej 1.3.1.9
        //enteros
        String s7 = "1234";
        int i = Integer.parseInt(s7); // retorna: 1234
        String t1 = Integer.toString(i); // retorna "1234"
        System.out.println(t1);

        //flotantes
        String s8 = "1234.56";
        double d = Double.parseDouble(s8); // retorna: 1234.56
        String t2 = Double.toString(d); // retorna: "1234.56"
        System.out.println(t2);

        System.out.println("\n");

        //Ej. 1.3.1.10.
        String s9 = "Hola, ";
        String t3 = "que tal?";
        String u = s9+t3; // retorna: "Hola, que tal?"
        System.out.println(u);

        System.out.println("\n");

        //Ej. 1.3.2
        String s10 = "Hola";
        s10 = "Chau";
        System.out.println(s10); // salida: "Chao"

        String s11 = "Hola";
        s11 += ", chau"; // concatenamos?
        System.out.println(s11); // salida: "Hola, chau"

        System.out.println("\n");

        //Ej 1.3.3.1
        StringBuilder sb = new StringBuilder();
        sb.append("Hola, ");
        sb.append("chau");
        System.out.println(sb); // salida: Hola,chau

        System.out.println("\n");

        //Ej 1.3.3.2
        StringBuilder sb2 = new StringBuilder("Hola");
        sb2.setCharAt(2, 'X');
        System.out.println(sb2); // salida: HoXa

        System.out.println("\n");
    }
}