
/**
 *  Representa a una fila de la hoja de cálculo
 *  Toda fila tiene un identificador y en ella
 *  se anotan la fecha, los ingresos y los gastos correspondientes a un
 *  apunte  contable  de una empresa
 * 
 * @author -    Alex Calderón
 *  
 */
public class Fila
{
    //Atributos
        //Constantes
        //Variables
    private String id;
    private Fecha fecha;
    private double ingresos;
    private double gastos;


    /**
     * Constructor  
     */
    public Fila(String id)    {
        this.id = id;
        this.ingresos = 0;
        this.gastos = 0;
        this.fecha = new Fecha(1, 1, 2020);
    }

    /**
     * Constructor  
     */
    public Fila(String id, Fecha fecha, double ingresos, double gastos)    {
        this.id = id;
        this.ingresos = 0;
        this.gastos = 0;
        this.ingresos = ingresos;
        this.gastos = gastos;
        this.fecha = new Fecha(fecha.getDia(), fecha.getMes(), fecha.getAño());
    }
    
    /**
     * accesor para el id de la fila
     */
    public String getId() {
        return this.id;

    }


    /**
     * accesor para la fecha
     */
    public Fecha getFecha() {
        return fecha;

    }

    /**
     * accesor para los ingresos
     */
    public double getIngresos() {
        return this.ingresos;

    }

    /**
     * accesor para los gastos
     */
    public double getGastos() {
        return this.gastos;

    }

    /**
     * calcula y devuelve el beneficio
     */
    public double getBeneficio() {
        return this.ingresos - this.gastos;

    }
    
    /**
     * obtiene una copia idéntica a la fila actual.
     * La fecha que incluye la fila duplicada también es una copia
     * 
     */
    public Fila duplicar() {
        Fila CFila = new Fila(getId(), getFecha(), getIngresos(), getGastos());
        return CFila;
    }

    /**
     * Representación textual de una fila
     * (leer enunciado)
     */
    public String toString() {
        if(this.ingresos - this.gastos < 0){
            System.out.printf("\n%8s%15s%14.2f€%14.2f€%14.2f€ **" ,id, fecha, this.ingresos, this.gastos, (this.ingresos - this.gastos));
        }
        else{
            System.out.printf("\n%8s%15s%14.2f€%14.2f€%14.2f€" ,id, fecha, this.ingresos, this.gastos, (this.ingresos - this.gastos)); 
        }
        return "";
    }
}
