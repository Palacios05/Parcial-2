public class Planetas {

    private String nombre;
    private int cantidad_satelites;
    private double masa_planeta;
    private double volumen_planeta;
    private double diametro_planeta;
    private double distancia_sol;
    private boolean observable;

    public Planetas(String nombre, int cantidad_satelites, double masa_planeta, double volumen_planeta,
            double diametro_planeta, double distancia_sol, boolean observable){

        this.nombre = nombre;
        this.cantidad_satelites = cantidad_satelites;
        this.masa_planeta = masa_planeta;
        this.volumen_planeta = volumen_planeta;
        this.diametro_planeta = diametro_planeta;
        this.distancia_sol = distancia_sol;
        this.observable = observable;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad_satelites() {
        return cantidad_satelites;
    }

    public void setCantidad_satelites(int cantidad_satelites) {
        this.cantidad_satelites = cantidad_satelites;
    }

    public double getMasa_planeta() {
        return masa_planeta;
    }

    public void setMasa_planeta(double masa_planeta) {
        this.masa_planeta = masa_planeta;
    }

    public double getVolumen_planeta() {
        return volumen_planeta;
    }

    public void setVolumen_planeta(double volumen_planeta) {
        this.volumen_planeta = volumen_planeta;
    }

    public double getDiametro_planeta() {
        return diametro_planeta;
    }

    public void setDiametro_planeta(double diametro_planeta) {
        this.diametro_planeta = diametro_planeta;
    }

    public double getDistancia_sol() {
        return distancia_sol;
    }

    public void setDistancia_sol(double distancia_sol) {
        this.distancia_sol = distancia_sol;
    }

    public boolean isObservable() {
        return observable;
    }

    public void setObservable(boolean observable) {
        this.observable = observable;
    }

    public void imprimir(){

        System.out.println("Nombre del planeta: " + nombre);
        System.out.println("Cantidad de satelites: " + cantidad_satelites);
        System.out.println("Masa: " + masa_planeta);
        System.out.println("Volumen: " + volumen_planeta);
        System.out.println("Diametro: " + diametro_planeta);
        System.out.println("Distancia del sol: " + distancia_sol);
        System.out.println("Es observable: " + observable);

    }

    public double calcularMasa(double volumen_planeta){

        double densidad = masa_planeta / volumen_planeta;
        
        return densidad;
    }

    public static void main(String[] args) {

        Planetas planeta1 = new Planetas("Tierra", 1, 5.9736E24, 1.08321E12, 12742, 150000000, true);
        planeta1.imprimir();

        double densidadPlaneta1 = planeta1.calcularMasa(planeta1.getVolumen_planeta());
        System.out.println("Densidad de " + planeta1.getNombre() + ": " + densidadPlaneta1 + "\n");

        Planetas planeta2 = new Planetas("Jupiter", 1, 1.899E27, 1.4313E15, 139820, 750000000, true);
        planeta2.imprimir();

        double densidadPlaneta2 = planeta2.calcularMasa(planeta2.getVolumen_planeta());
        System.out.println("Densidad de " + planeta2.getNombre() + ": " + densidadPlaneta2 + "\n");
    }
}
