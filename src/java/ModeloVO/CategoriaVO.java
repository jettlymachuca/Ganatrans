/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloVO;

/**
 *
 * @author Sena
 */
public class CategoriaVO {
 
    // Declarar variables
    private String Id, Categoria;
    
        // Crear constructor vacio

    public CategoriaVO() {
    }
    
        // Crear constructor con las variables

    public CategoriaVO(String Id, String Categoria) {
        this.Id = Id;
        this.Categoria = Categoria;
    }
    
            // Crear get and Set

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }




    
}
