/**
 *  Un objeto de esta clase representa a una sencilla
 *  hoja de cálculo. La hoja tiene hasta un máximo de 3 filas (no más)
 *  En cada fila la empresa "apunta" los ingresos y gastos en 
 *  una determinada fecha
 * 
 * @author -    Alex Calderón   
 *  
 */
public class HojaCalculo
{
    //Atributos
        //Constantes
        //Variables 
    private String nombre;
    private Fila fila1;
    private Fila fila2;
    private Fila fila3;

    /**
     * Constructor  
     * Crea la hoja de cálculo con el nombre indicado 
     * e inicializa las filas al valor null (inicialmente
     * la hoja se crea sin filas)
     */
    public HojaCalculo(String nombre)    {
        this.nombre = nombre;
        this.fila1 = null;
        this.fila2 = null;
        this.fila3 = null;
    }

    /**
     * accesor para el nombre de la hoja
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * accesor para la fila1
     */
    public Fila getFila1() {
        return fila1;
    }

    /**
     * accesor para la fila2
     */
    public Fila getFila2() {
        return fila2;
    }

    /**
     * accesor para la fila3
     */
    public Fila getFila3() {
        return fila3;
    }

    /**
     * Devuelve el nº de filas de la hoja
     * (dependerá de cuántas filas estén a null)
     */
    public int getNumeroFilas() {
        if(fila1 == null && fila2 == null && fila3 == null){
            return 0;
        }
        if(fila1 != null && fila2 == null && fila3 == null){
           return 1;
        }
        if(fila1 == null && fila2 != null && fila3 == null){
            return 1;
        }
        if(fila1 == null && fila2 == null && fila3 != null){
            return 1;
        }
        if(fila1 != null && fila2 != null && fila3 == null){
            return 2;
        }
        if(fila1 != null && fila2 == null && fila3 != null){
            return 2;
        }
        if(fila1 == null && fila2 != null && fila3 != null){
            return 2;
        }
        else{
            return 3;
        }
    }

    /**
     * Devuelve true si la hoja está completa
     * (tiene exactamente 3 filas)
     */
    public boolean hojaCompleta() {
        if(fila1 != null && fila2 != null && fila3 != null){
            return true;
        }
        else{
            return false;
        }
    }

    /**
     * Se añade una nueva fila a la hoja
     * Si la hoja está completa se muestra el mensaje "FilaX no se puede añadir en HOJAX"
     * Si no está completa se añade la fila a la hoja teniendo en cuenta
     * si se añade como primera, segunda o tercera fila (no han de quedar huecos)
     */
    public void addFila(Fila fila) {
        if(fila1 ==  null){
            fila1 = new Fila("Fila1");
        }
        else{
            if(fila2 == null){
                fila2 = new Fila("Fila2");
            }
            else{
                if(fila3 == null){
                    fila3 = new Fila("Fila3");
                }
                else{
                    System.out.println(fila.getId() + " no se pudo crear en " + nombre);
                }
            }
        }
    }

    /**
     * Dada la información a guardar en una fila el método
     * crea la fila y la añade a la hoja
     * (evita repetir código)
     */
    public void addFila(String id, Fecha fecha, double ingresos, double gastos) {
        if(fila1 ==  null){
            fila1 = new Fila(id, fecha, ingresos, gastos);
        }
        else{
            if(fila2 == null){
                fila2 = new Fila(id, fecha, ingresos, gastos);
            }
            else{
                if(fila3 == null){
                    fila3 = new Fila(id, fecha, ingresos, gastos);
                }
                else{
                    System.out.println(id + " no se pudo crear en " + nombre);
                }
            }
        }
    }

    /**
     * Calcula y devuelve el total de ingresos entre
     * todas las filas que incluye la hoja
     */
    //Dependiendo del numero de filas metidas se crea una hoja u otra para que no de error si son null.
    public double getTotalIngresos() {
        if(fila3 == null && fila2 == null && fila1 == null){
            return 0;
        }
        if(fila3 == null && fila2 != null && fila1 != null){
            return (fila1.getIngresos() + fila2.getIngresos());
        }
        if(fila3 == null && fila2 == null && fila1 != null){
            return (fila1.getIngresos());
        }
        else{
            return (fila1.getIngresos() + fila2.getIngresos() + fila3.getIngresos());
        }
    }

    /**
     * Calcula y devuelve el total de gastos
     * entre todas las filas que incluye la hoja
     */
    //Dependiendo del numero de filas metidas se crea una hoja u otra para que no de error si son null.
    public double getTotalGastos() {
        if(fila3 == null && fila2 == null && fila1 == null){
            return 0;
        }
        if(fila3 == null && fila2 != null && fila1 != null){
            return (fila1.getGastos() + fila2.getGastos());
        }
        if(fila3 == null && fila2 == null && fila1 != null){
            return (fila1.getGastos());
        }
        else{
            return (fila1.getGastos() + fila2.getGastos() + fila3.getGastos());
        }
    }

    /**
     * Calcula y devuelve el total del beneficio
     * entre todas las filas que incluye la hoja
     */
    //Dependiendo del numero de filas metidas se crea una hoja u otra para que no de error si son null.
    public double getBeneficio() {
        if(fila3 == null && fila2 == null && fila1 == null){
            return 0;
        }
        if(fila3 == null && fila2 != null && fila1 != null){
            return (fila1.getBeneficio() + fila2.getBeneficio());
        }
        if(fila3 == null && fila2 == null && fila1 != null){
            return (fila1.getBeneficio());
        }
        else{
            return (fila1.getBeneficio() + fila2.getBeneficio() + fila3.getBeneficio());
        }
    }

    /**
     * Representación textual de la hoja
     * con el formato exacto que indica el enunciado
     */
    //Dependiendo del numero de filas metidas se crea una hoja u otra para que no de error si son null.
    public String toString() {
        if(fila3 == null && fila2 != null && fila1 != null){
            System.out.printf("\n%s\n%23s%15s%15s%15s", this.nombre, "FECHA", "INGRESOS", "GASTOS", "BENEFICIO");
            System.out.print(fila1.toString());
            System.out.println(fila2.toString());
            System.out.println("-----------------------------------------------------------------------------------------------------");
            System.out.printf("%37.2f€%14.2f€%14.2f€", getTotalIngresos(), getTotalGastos(), getBeneficio());
        }
        if(fila3 == null && fila2 == null && fila1 != null){
            System.out.printf("\n%s\n%23s%15s%15s%15s", this.nombre, "FECHA", "INGRESOS", "GASTOS", "BENEFICIO");
            System.out.println(fila1.toString());
            System.out.println("-----------------------------------------------------------------------------------------------------");
            System.out.printf("%37.2f€%14.2f€%14.2f€", getTotalIngresos(), getTotalGastos(), getBeneficio());
        }
        if(fila3 != null && fila2 != null && fila1 != null){
            System.out.printf("\n%s\n%23s%15s%15s%15s", this.nombre, "FECHA", "INGRESOS", "GASTOS", "BENEFICIO");
            System.out.print(fila1.toString());
            System.out.print(fila2.toString());
            System.out.println(fila3.toString());
            System.out.println("-----------------------------------------------------------------------------------------------------");
            System.out.printf("%37.2f€%14.2f€%14.2f€", getTotalIngresos(), getTotalGastos(), getBeneficio());
        }
        return "";
    }

    /**
     * Devuelve un duplicado de la hoja actual.
     * El nombre de la hoja duplicada será "Duplicada HojaX"
     * Al duplicar la hoja se duplicarán también las filas que contenga
     */
    //Dependiendo del numero de filas metidas se crea una hoja u otra para que no de error si son null.
    public String duplicarHoja() {
        if(fila3 == null && fila2 != null && fila1 != null){
            System.out.printf("\n%s\n%23s%15s%15s%15s", ("Duplicado " + this.nombre), "FECHA", "INGRESOS", "GASTOS", "BENEFICIO");
            System.out.print(fila1.duplicar());
            System.out.println(fila2.duplicar());
            System.out.println("-----------------------------------------------------------------------------------------------------");
            System.out.printf("%37.2f€%14.2f€%14.2f€", getTotalIngresos(), getTotalGastos(), getBeneficio());
        }
        if(fila3 == null && fila2 == null && fila1 != null){
            System.out.printf("\n%s\n%23s%15s%15s%15s", ("Duplicado " + this.nombre), "FECHA", "INGRESOS", "GASTOS", "BENEFICIO");
            System.out.println(fila1.duplicar());
            System.out.println("-----------------------------------------------------------------------------------------------------");
            System.out.printf("%37.2f€%14.2f€%14.2f€", getTotalIngresos(), getTotalGastos(), getBeneficio());
        }
        if(fila3 != null && fila2 != null && fila1 != null){
            System.out.printf("\n%s\n%23s%15s%15s%15s", ("Duplicado " + this.nombre), "FECHA", "INGRESOS", "GASTOS", "BENEFICIO");
            System.out.print(fila1.duplicar());
            System.out.print(fila2.duplicar());
            System.out.println(fila3.duplicar());
            System.out.println("-----------------------------------------------------------------------------------------------------");
            System.out.printf("%37.2f€%14.2f€%14.2f€", getTotalIngresos(), getTotalGastos(), getBeneficio());
        }
        return "";
    }
}
