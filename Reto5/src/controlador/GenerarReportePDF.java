package controlador;

import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import modelo.ConexionDB;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import vista.VistaCompras;
import vista.VistaLideres;
import vista.VistaProyectos;

public class GenerarReportePDF {
    public static void generarReporteCompras(){
        try {
            ConexionDB con = new ConexionDB();
            Connection conn = con.conectar();
            
            JasperReport reporte = null;
            String path = "src/reportes/ReporteCompras.jasper";
            
            reporte = (JasperReport) JRLoader.loadObjectFromFile(path);
            
            JasperPrint jprint = JasperFillManager.fillReport(path, null, conn);
            JasperViewer view = new JasperViewer(jprint, false);
            view.setVisible(true);
        } catch (JRException ex) {
            Logger.getLogger(VistaCompras.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void generarReporteProyectos(){
        try {
            ConexionDB con = new ConexionDB();
            Connection conn = con.conectar();

            JasperReport reporte = null;
            String path = "src/reportes/ReporteProyectos.jasper";

            reporte = (JasperReport) JRLoader.loadObjectFromFile(path);

            JasperPrint jprint = JasperFillManager.fillReport(path, null, conn);

            JasperViewer view = new JasperViewer(jprint, false);
            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            view.setVisible(true);
        } catch (JRException ex) {
            java.util.logging.Logger.getLogger(VistaProyectos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
    
    public static void generarReporteLideres(){
        try {
            ConexionDB con = new ConexionDB();
            Connection conn = con.conectar();
            
            JasperReport reporte = null;
            String path = "src/reportes/ReporteLideres.jasper";
            
            reporte = (JasperReport) JRLoader.loadObjectFromFile(path);
            
            JasperPrint jprint = JasperFillManager.fillReport(path, null, conn);
            
            JasperViewer view = new JasperViewer(jprint, false);
            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            view.setVisible(true);
        } catch (JRException ex) {
            java.util.logging.Logger.getLogger(VistaLideres.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
