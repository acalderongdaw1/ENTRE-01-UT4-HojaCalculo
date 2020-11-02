/**
 *  Clase con código para probar el resto de clases
 * 
 * @author -    Alex Calderón 
 *  
 */
public class TestHojaCalculo
{
    private Fila fila4;

    /**
     * Constructor  
     */
    public TestHojaCalculo()    {
        fila4 = new Fila("Fila4");
    }

    /**
     * Define y crea todos los objetos necesarios para obtener
     * en pantalla la hoja de cálculo indicada en la figura 1
     * incluyendo la hoja duplicada
     * La fila4 que no se podrá guardar puedes crearla con el constructor por defecto
     * de fila (el que no tiene parámetros)
     */
    public void test1(String nombre) {
        //Crear objeto hoja1
        HojaCalculo hoja1 = new HojaCalculo("Hoja1");
        //Crear objetos fecha1, 2, 3
        Fecha fecha1 = new Fecha(4, 10, 2020);
        Fecha fecha2 = new Fecha(5, 10, 2020);
        Fecha fecha3 = new Fecha(1, 1, 2020);
        //Añadir fila1, 2, 3, 4 a la hoja
        hoja1.addFila("Fila1", fecha1, 25.50, 132.00);
        hoja1.addFila("Fila2", fecha2, 300.00, 350.00);
        hoja1.addFila("Fila3", fecha3, 0.00, 0.00);
        hoja1.addFila(fila4);
        //Mostrar en pantalla la hoja
        System.out.println(hoja1.toString());
        System.out.println(hoja1.duplicarHoja());
    }

    /**
     * Define y crea todos los objetos necesarios para obtener
     * en pantalla la hoja de cálculo indicada en la figura 2 
     * incluyendo la hoja duplicada
     *  
     */
    public void test2(String nombre) {
        //Crear objeto hoja
        HojaCalculo hoja2 = new HojaCalculo("Hoja2");
        //Crear objetos fecha5,6
        Fecha fecha5 = new Fecha(7, 10, 2020);
        Fecha fecha6 = new Fecha(8, 10, 2020);
        //Añadir fila1, 2 a la hoja
        hoja2.addFila("Fila1", fecha5, 260.00, 125.00);
        hoja2.addFila("Fila2", fecha6, 125.00, 245.00);
        //Mostrar en pantalla la hoja
        System.out.println(hoja2.toString());
        System.out.println(hoja2.duplicarHoja());
    }

    /**
     * Define y crea todos los objetos necesarios para obtener
     * en pantalla la hoja de cálculo indicada en la figura 3
     * incluyendo la hoja duplicada
     *  
     */
    public void test3(String nombre) {
        //Crear objeto hoja
        HojaCalculo hoja3 = new HojaCalculo("Hoja3");
        //Crear objeto fecha7
        Fecha fecha7 = new Fecha(8, 10, 2020);
        //Añadir fila1
        hoja3.addFila("Fila1", fecha7, 670.00, 234.00);
        //Mostrar en pantalla la hoja
        System.out.println(hoja3.toString());
        System.out.println(hoja3.duplicarHoja());
    }
}
