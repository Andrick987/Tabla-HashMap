
package Controlador;

import Modelo.ModeloLista;
import Vistas.frmVistaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HashController implements ActionListener{
    
    frmVistaPrincipal VistaPrincipal;
    ModeloLista ModeloLista;

    public HashController(frmVistaPrincipal VistaPrincipal, ModeloLista ModeloLista) {
        this.VistaPrincipal = VistaPrincipal;
        this.ModeloLista = ModeloLista;
        
        this.VistaPrincipal.btnAgregar.addActionListener(this);
        
        this.VistaPrincipal.setExtendedState(frmVistaPrincipal.MAXIMIZED_BOTH);
        this.VistaPrincipal.setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==VistaPrincipal.btnAgregar){
            this.ModeloLista.IngresarDatos(Integer.parseInt(this.VistaPrincipal.txtCodigo.getText()),
            this.VistaPrincipal.txtPais.getText());
            this.VistaPrincipal.txtCodigo.setText("");
            this.VistaPrincipal.txtPais.setText("");
            this.ModeloLista.ListarDatos();
            
        }
    } 
}
