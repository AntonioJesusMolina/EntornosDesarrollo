
class Conversor {
    private double numero;

    public Conversor(double n) { // constructor
        this.numero = n;
    }

    public double dolar() {
        // numero = Double.parseDouble(JOptionPane.showInputDialog("Introduzca la
        // cantidad de Euros "));
        return this.numero * 1.17;
    }

    public double euro() {
        // numero = Double.parseDouble(JOptionPane.showInputDialog("Introduzca la
        // cantidad de Dolares "));
        return this.numero * 0.85;
    }
}

public class Moneda {
    public static void main(String[] args) {
        double resultado;
        Conversor n1 = new Conversor(10);
        Conversor n2 = new Conversor(20);
        n1.numero = 1;
        System.out.println(n1.getNumero() + "euros a Dolares " + n1.dolar());
        System.out.println(n2.getNumero() + "De Dolares a euros " + n2.euro());
    }
}