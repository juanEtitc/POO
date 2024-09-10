public class Taller3 {
    public interface GestionProducto {
        void vender(int cantidadVenta);
        void mostrarDetalles();
    }

    public abstract class Producto implements GestionProducto {
        public abstract void calcularPrecio(int cantidadVenta);
    }

    class Libro extends Producto {
        private double precio;
        private int cantidad;
        private double totalVenta;

        public Libro(double precio, int cantidad) {
            this.precio = precio;
            this.cantidad = cantidad;
        }

        @Override
        public void calcularPrecio(int cantidadVenta) {
            this.totalVenta = precio * cantidadVenta;
            System.out.printf("El precio de venta para %d libros es de %.2f%n", cantidadVenta, totalVenta);
        }

        @Override
        public void vender(int cantidadVenta) {
            calcularPrecio(cantidadVenta);
            System.out.printf("Se van a vender %d libros por un valor total de %.2f", cantidadVenta, totalVenta);
        }

        @Override
        public void mostrarDetalles() {
            System.out.printf("%nEl producto libro tiene un precio de %.2f y tenemos una cantidad de %d libros.%n",
                precio, cantidad);
        }
    }
    
    class Revista extends Producto {
        private double precio;
        private int cantidad;
        private double totalVenta;

        public Revista(double precio, int cantidad) {
            this.precio = precio;
            this.cantidad = cantidad;
        }

        @Override
        public void calcularPrecio(int cantidadVenta) {
            this.totalVenta = precio * cantidadVenta;
            System.out.printf("El precio de venta para %d Revistas es de %.2f%n", cantidadVenta, totalVenta);
        }

        @Override
        public void vender(int cantidadVenta) {
            calcularPrecio(cantidadVenta);
            System.out.printf("Se van a vender %d Revistas por un valor total de %.2f", cantidadVenta, totalVenta);
        }

        @Override
        public void mostrarDetalles() {
            System.out.printf("%nEl producto Revista tiene un precio de %.2f y tenemos una cantidad de %d libros.%n",
                precio, cantidad);
        }
    }
    class CD extends Producto {
        private double precio;
        private int cantidad;
        private double totalVenta;

        public CD(double precio, int cantidad) {
            this.precio = precio;
            this.cantidad = cantidad;
        }

        @Override
        public void calcularPrecio(int cantidadVenta) {
            this.totalVenta = precio * cantidadVenta;
            System.out.printf("El precio de venta para %d CDs es de %.2f%n", cantidadVenta, totalVenta);
        }

        @Override
        public void vender(int cantidadVenta) {
            calcularPrecio(cantidadVenta);
            System.out.printf("Se van a vender %d CDs por un valor total de %.2f", cantidadVenta, totalVenta);
        }

        @Override
        public void mostrarDetalles() {
            System.out.printf("%nEl producto CD tiene un precio de %.2f y tenemos una cantidad de %d libros.%n",
                precio, cantidad);
        }
    }

    public Taller3() {
    }
    
    public static void main(String[] args) {
        Taller3 taller = new Taller3();
        Taller3.Libro libroTest = taller.new Libro(15.99, 100);
        libroTest.mostrarDetalles();
        libroTest.calcularPrecio(5);
        libroTest.vender(4);
        Taller3.Revista RevistaTest = taller.new Revista(10.99, 200);
        RevistaTest.mostrarDetalles();
        RevistaTest.calcularPrecio(5);
        RevistaTest.vender(4);
        Taller3.CD CDTest = taller.new CD(6.99, 10);
        CDTest.mostrarDetalles();
        CDTest.calcularPrecio(5);
        CDTest.vender(4);
    }
}
