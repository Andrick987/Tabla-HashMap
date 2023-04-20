
import Controlador.HashController;
import Modelo.ModeloLista;
import Vistas.frmVistaPrincipal;


public class main {

    public static void main(String[] args) {
        
        frmVistaPrincipal VistaPrincipal = new frmVistaPrincipal();
        ModeloLista ModeloLista = new ModeloLista();
        HashController Controlador = new HashController(VistaPrincipal,ModeloLista);
    }
    
}
