package gettersandsetters;

public class Main {
    public static void main(String[] args) {

        // 1) Persona
        Persona p = new Persona();
        p.setNombre("Juan");
        p.setEdad(-5);
        System.out.println("Persona: " + p.getNombre() + ", Edad: " + p.getEdad());

        // 2) Producto
        Producto prod = new Producto();
        prod.setCodigo("P01");
        prod.setNombre("Laptop");
        prod.setPrecio(5000);
        prod.setStock(10);
        prod.vender(3);
        System.out.println("Stock restante: " + prod.getStock());
        
        // 3) Cuenta Bancaria
        CuentaBancaria cuenta = new CuentaBancaria();
        cuenta.setTitular("Oscar");
        cuenta.setSaldo(1000);
        cuenta.setPin(1234);
        cuenta.retirar(200, 1234);
        cuenta.retirar(100, 1111);
        
        // 4) Curso
        Curso curso = new Curso();
        curso.setNombreCurso("Matemática");
        curso.setNota1(80);
        curso.setNota2(70);
        curso.setNota3(60);
        System.out.println("Promedio: " + curso.promedio());
        System.out.println("Estado: " + curso.estado());