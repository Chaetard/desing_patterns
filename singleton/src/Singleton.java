public class Singleton {
    // Crear una única instancia estática
    private static Singleton instance;
    String msj;

    // Constructor privado para evitar la instanciación externa
    private Singleton(String msj) {
        this.msj = msj;
    }

    // Método público para obtener la única instancia
    public static Singleton getInstance(String msja) {
        if (instance == null) {
            instance = new Singleton(msja);
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello from Singleton!" + msj);
    }
}

// En otra parte del código
