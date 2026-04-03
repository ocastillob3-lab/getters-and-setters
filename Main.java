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