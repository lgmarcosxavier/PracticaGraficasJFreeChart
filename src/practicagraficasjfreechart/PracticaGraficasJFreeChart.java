package practicagraficasjfreechart;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

public class PracticaGraficasJFreeChart {

    public static void main(String[] args) {
        pastel();
        barras();
        lineal();
    }
    
    public static void pastel(){
        DefaultPieDataset dataset = new DefaultPieDataset();
        
        dataset.setValue("Android", 39.2);
        dataset.setValue("iOs", 22.9);
        dataset.setValue("Windows Mobile", 15.5);
        dataset.setValue("Symbian", 18.3);
        dataset.setValue("Otros", 12.3); 
        
        JFreeChart grafica = ChartFactory.createPieChart3D( 
            "Grafica pastel", // El nombre de la gráfica 
            dataset, // El arreglo de datos 
            true, // Indica si lleva leyenda 
            true, // Indica si lleva tooltips 
            false); // Indica si son URls 

         ChartFrame frame = new ChartFrame("Graficador", grafica);
         frame.pack();
         frame.setVisible(true);
    }
    
    public static void barras(){
        DefaultCategoryDataset dataset = new DefaultCategoryDataset(); 
         
         dataset.addValue(1.0, "Egresos", "Enero"); 
        dataset.addValue(3.0, "Egresos", "Febrero"); 
        dataset.addValue(2.0, "Egresos", "Marzo"); 
        dataset.addValue(2.0, "Ingresos", "Enero"); 
        dataset.addValue(3.0, "Ingresos", "Febrero"); 
        dataset.addValue(4.0, "Ingresos", "Marzo"); 
    
        JFreeChart chart = ChartFactory.createBarChart( 
                "Grafica de barras", // El titulo de la gráfica 
                "Mes", // Etiqueta de categoria 
                "Valor", // Etiqueta de valores 
                dataset, // Datos 
                PlotOrientation.VERTICAL, // orientacion 
                true, // Incluye Leyenda 
                true, // Incluye tooltips 
                false // URLs? 
            ); 
        
        ChartFrame frame = new ChartFrame("Graficador", chart); 
        frame.pack(); 
        frame.setVisible(true);
    }

    public static void lineal(){
        DefaultCategoryDataset dataset = new DefaultCategoryDataset(); 
        
        dataset.addValue(212, "Usuarios", "Agosto"); 
        dataset.addValue(504, "Usuarios", "Septiembre"); 
        dataset.addValue(1520, "Usuarios", "Octubre"); 
        dataset.addValue(1842, "Usuarios", "Noviembre"); 
        dataset.addValue(2991, "Usuarios", "Diciembre"); 
        
        JFreeChart chart = ChartFactory.createLineChart( 
            "Grafica Lineal", // Titulo 
            "Mes", // Etiqueta de datos 
            "Usuarios", // Etiqueta de valores 
            dataset, // Datos 
            PlotOrientation.VERTICAL, // orientacion 
            false, // Incluye leyenda 
            true, // Incluye tooltips 
            false // urls 
        ); 
        
        ChartFrame frame = new ChartFrame("Graficador", chart); 
        frame.pack(); 
        frame.setVisible(true);
    }
    
    
}
