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
        
        // 5) Estudiante
        Estudiante est = new Estudiante();
        est.setCarnet("2025-01");
        est.setNombre("Carlos");
        est.setPromedio(90);
        System.out.println("¿Becado?: " + est.esBecado());
        
        // 6) Termómetro
        Termometro t = new Termometro();
        t.setCelsius(25);
        System.out.println("Fahrenheit: " + t.getFahrenheit());
        
        // 7) Reloj
        Reloj r = new Reloj();
        r.setHora(14);
        r.setMinuto(30);
        r.setSegundo(45);
        System.out.println("Hora: " + r.mostrarHora());
        
        // 8) Contacto
        Contacto c = new Contacto();
        c.setNombre("Oscar");
        c.setTelefono("12345678");
        c.setEmail("correo@gmail.com");
        c.mostrarContacto();
        
        // 9) Jugador
        Jugador j = new Jugador();
        j.setNombre("Oscar1");
        j.actualizarPuntaje(50);
        j.actualizarPuntaje(100);
        System.out.println("Puntaje máximo: " + j.getPuntajeMaximo());

        // 10) Factura
        Factura f = new Factura();
        f.setCodigoFactura("F001");
        f.setDescripcion("Compra de libros");
        f.setCantidad(3);
        f.setPrecioUnitario(50);
        f.mostrarFactura();
    }
}


//1) Persona
class Persona {
 private String nombre;
 private int edad;

 public String getNombre() { return nombre; }
 public void setNombre(String nombre) { this.nombre = nombre; }

 public int getEdad() { return edad; }
 public void setEdad(int edad) {
     if (edad < 0) {
         System.out.println("Edad inválida, se asigna 0");
         this.edad = 0;
     } else {
         this.edad = edad;
     }
 }
}

//2) Producto
class Producto {
 private String codigo;
 private String nombre;
 private double precio;
 private int stock;

 public String getCodigo() { return codigo; }
 public void setCodigo(String codigo) { this.codigo = codigo; }

 public String getNombre() { return nombre; }
 public void setNombre(String nombre) { this.nombre = nombre; }

 public double getPrecio() { return precio; }
 public void setPrecio(double precio) {
     if (precio > 0) this.precio = precio;
     else System.out.println("Precio inválido");
 }

 public int getStock() { return stock; }
 public void setStock(int stock) {
     if (stock >= 0) this.stock = stock;
     else System.out.println("Stock inválido");
 }

 public void vender(int cantidad) {
     if (cantidad <= stock) {
         stock -= cantidad;
     } else {
         System.out.println("No hay suficiente stock");
     }
 }
}

//3) Cuenta Bancaria
class CuentaBancaria {
 private String titular;
 private double saldo;
 private int pin;

 public void setTitular(String titular) { this.titular = titular; }
 public void setSaldo(double saldo) { this.saldo = saldo; }
 public void setPin(int pin) { this.pin = pin; }

 public void retirar(double monto, int pinIngresado) {
     if (pinIngresado == pin) {
         if (monto <= saldo) {
             saldo -= monto;
             System.out.println("Retiro exitoso. Saldo: " + saldo);
         } else {
             System.out.println("Saldo insuficiente");
         }
     } else {
         System.out.println("PIN incorrecto");
     }
 }
}

//4) Curso
class Curso {
 private String nombreCurso;
 private double nota1, nota2, nota3;

 public void setNombreCurso(String nombreCurso) { this.nombreCurso = nombreCurso; }

 public void setNota1(double n) { if (n >= 0 && n <= 100) nota1 = n; }
 public void setNota2(double n) { if (n >= 0 && n <= 100) nota2 = n; }
 public void setNota3(double n) { if (n >= 0 && n <= 100) nota3 = n; }

 public double promedio() {
     return (nota1 + nota2 + nota3) / 3;
 }

 public String estado() {
     return promedio() >= 61 ? "Aprobado" : "Reprobado";
 }
}

//5) Estudiante
class Estudiante {
 private String carnet, nombre;
 private double promedio;

 public void setCarnet(String carnet) { this.carnet = carnet; }
 public void setNombre(String nombre) { this.nombre = nombre; }

 public void setPromedio(double promedio) {
     if (promedio >= 0 && promedio <= 100) {
         this.promedio = promedio;
     } else {
         System.out.println("Promedio inválido");
     }
 }

 public boolean esBecado() {
     return promedio >= 85;
 }
}

//6) Termometro
class Termometro {
 private double celsius;

 public void setCelsius(double temperatura) {
     if (temperatura >= -273.15) {
         this.celsius = temperatura;
     } else {
         System.out.println("Temperatura inválida");
     }
 }

 public double getFahrenheit() {
     return (celsius * 9 / 5) + 32;
 }
}

