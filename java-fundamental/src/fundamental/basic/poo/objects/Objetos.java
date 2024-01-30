package fundamental.basic.poo.objects;

public class Objetos {

    public static void main(String[] args) {

        CuentaBancaria cb = new CuentaBancaria();
        //CuentaBancaria cb = new CuentaBancaria("Juana", "Flores", 20.6f);
        //CuentaBancaria cb = new CuentaBancaria("Karen", "Flores", "Lima", "tra@gmail.com", 15.7f, "Credito", 18.5f);
        //cb.setNombre("David");
        //cb.setApellidos("Flores");
        //cb.setSaldo(70.7f);

        //cb.set("David", "Flores", 30.40f);
        cb.consultarSaldo();
        cb.retirarDinero(5f);
        cb.consultarSaldo();
        cb.retirarDinero(12);
        cb.consultarSaldo();
        cb.depositarDinero(100f);
        cb.consultarSaldo();
        cb.setEmail("tra@gmail.com");
        //cb.setNombre("Christian");

        System.out.println(cb.getEmail());
        System.out.println(cb.getNombre());


    }

    private static void reloj() {
        Reloj relojA = new Reloj();

        relojA.set(10, 25, 25);
        relojA.incrementar();
        relojA.incrementar();
        relojA.incrementar();
        relojA.incrementar();
        relojA.incrementar();
        relojA.incrementar();
        relojA.incrementar();
        System.out.println(relojA.getHora());
        Reloj relojB = new Reloj();
        relojB.set(12, 40, 20);
        relojB.incrementar();
        relojB.incrementar();
        System.out.println(relojB.getHora());
    }
}
