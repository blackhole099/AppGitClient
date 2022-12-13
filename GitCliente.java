/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package entornos;

/**
 *git client describe el tipo de Git client elegido
 * @author vilaloen
 */
public class GitCliente {

    private String cliente;
    private String version;
    private String systemopen;
    private String licencia;
   public GitCliente(){
   }
   public String getcliente(){
       return cliente;
   }
   public void setcliente(String cliente){
       this.cliente=cliente;
   }
   public String getversion(){
       return version;
   }
   public void setversion(String version){
       this.version=version;
   }
   public String getsystemopen(){
       return systemopen;
   }
   public void setsystemopen(String systemopen){
       this.systemopen=systemopen;
   }
   public String getlicencia(){
       return licencia;
   }
   public void setlicencia(String licencia){
       this.licencia=licencia;
   }
    @Override
   public String toString(){
       return "GitClient|"+"cliente="+cliente+", version="+version+", systemopen="+systemopen+", licencia="+licencia+")";
   }
    
}
