package examExercises;

public class CartaDiCredito implements MetodoPagamento {

    private int numerocarta;
    private double saldo;


    public CartaDiCredito (int numerocarta, double saldo) {
        this.numerocarta = numerocarta;
        this.saldo = saldo;
    }

    @Override
    public void decrementa (double x) {
        if (saldo == 0 || saldo - x <= 0) {
            throw new SaldoNonSufficienteException("Saldo non sufficiente");
        }
         saldo -= x;
    }

    @Override
    public void incrementa (double x) {
        saldo += x;
    }





}
