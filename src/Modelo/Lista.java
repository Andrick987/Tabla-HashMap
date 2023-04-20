
package Modelo;

public class Lista {
    
    int codigo;
    String pais;

    public Lista(int codigo, String pais) {
        this.codigo = codigo;
        this.pais = pais;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
}
