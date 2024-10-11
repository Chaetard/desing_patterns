public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance("hola una vez");
        singleton.showMessage();


        Singleton singletu = Singleton.getInstance("Hola 2 veces");
        singletu.showMessage();

// La forma en la que funciona, (para que lo entiendas jesus) es que solo puede instanciar un objeto aunque existan por asi decirlo 2 variables o 2 metodos o mas dentro del codigo, es como si tuvieses notitas de colores, rojo, azul, amarillo etc, esas serian tus variables y punteros, diferentes colores, y lo que tu haces es que en esos mismos papeles pones siempre la mmisma direccion de casa, manuel acuña 12 por ejemplo, todos tienen esa misma direccion y todos apúntan a la misma casa con la misma puerta y refrigerador samsung con doom instalado
    }
}