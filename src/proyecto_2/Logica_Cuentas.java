/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_2;

/**
 *
 * @author User
 */
public class Logica_Cuentas {
    private String name;
    private UsuarioContra cuentas[]=new UsuarioContra[10]; // arreglo que almacena los usuarios
    
    
     
    
    public void setName(String name){
        this.name=name;
    }
    
    public String getName(){
        return name;
    }
    //buscar un usuario en el arreglo por su user
    public UsuarioContra buscar(String name){   
        for (UsuarioContra cuenta: cuentas){
            if (cuenta!=null && cuenta.getUser().equals(name)){
                return cuenta;
            }
        }
        return null;
    }
    //agrega un nuevo usuario al arreglo de usuarios( cuentas)
    public boolean agregarCuenta(String name, String password){
        if (buscar(name)==null){
            for(int pos=0;pos<cuentas.length;pos++){
                if(cuentas[pos]==null){
                    cuentas[pos]=new UsuarioContra(name,password);
                    return true;
                }
            }
        }
        return false;
    }
    // verifa si el username y clave coincidan 
    public boolean revisarUsuario(String user, String password){
        for(int contar=0;contar<cuentas.length;contar++){
            if (cuentas[contar]!=null){
                if (user.equals(cuentas[contar].username) && password.equals(cuentas[contar].password)){
                    return true;
                    
                }
            }
            
        }
        return false;
    }
    // elimina un elemento del arreglo cuentas 
    public boolean elminarCuenta(String user, String password){
        for(int contar=0;contar<cuentas.length;contar++){
            if (cuentas[contar] != null && user.equals(cuentas[contar].username) && password.equals(cuentas[contar].password)) {
                cuentas[contar] = null; 
                return true;
            }
        }
        return false;
    }
    // modifica password de el usuario solo el user y pass coinciden
    public boolean cambiarPassword(String user, String pass, String newpass){
        for(int contar=0;contar<cuentas.length;contar++){
            if (cuentas[contar] != null && user.equals(cuentas[contar].username) && pass.equals(cuentas[contar].password)) {
                cuentas[contar].password = newpass; 
                return true;
            }
        }
        return false;
    }
}
