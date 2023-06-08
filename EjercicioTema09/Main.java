public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();

        cliente.setCredito(1000);
        cliente.setEdad(40);
        cliente.setNombre("Pepe Perez");
        cliente.setTelefono(5567891);

        System.out.println("Nombre: " + cliente.getNombre() + "\nEdad: " + cliente.getEdad() +
                "\nTeléfono: " + cliente.getTelefono() + "\nCrédito: " + cliente.getCredito());

        Trabajador trabajador = new Trabajador();

        trabajador.setSalario(500);
        trabajador.setEdad(51);
        trabajador.setNombre("Jhon Doe");
        trabajador.setTelefono(2345984);

        System.out.println("Nombre: " + trabajador.getNombre() + "\nEdad: " + trabajador.getEdad() +
                "\nTeléfono: " + trabajador.getTelefono() + "\nSalario: " + trabajador.getSalario());
    }
}