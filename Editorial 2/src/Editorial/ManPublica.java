/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Editorial;
import java.util.ArrayList;
import java.util.Iterator;
import Jerarquia1.Libro;
import Jerarquia1.Publicaciones;
import Jerarquia1.Revista;
import Jerarquia1.Periodico;


/**
 *
 * @author miguelgudinogalindo
 */
public class ManPublica {
    static ArrayList<Publicaciones> Arrpublica = new ArrayList<Publicaciones>();
    private Libro objLibro;
    private Revista objRevista;
    private Publicaciones objPublicaciones;
    private Periodico objPeriodico; 
    
    public ManPublica(){}
    
    public ManPublica(String tit, double precio, int np){
       
        objPublicaciones = new Publicaciones();
        objPublicaciones.setTitulo(tit);
        objPublicaciones.setPrecio(precio);
        objPublicaciones.setNoPag(np);
    }
    
    public void alta (String ISBN, String Autor, String edicion){
         objLibro = new Libro();
         objLibro.setTitulo(objPublicaciones.getTitulo());
         objLibro.setPrecio(objPublicaciones.getPrecio());
         objLibro.setNoPag(objPublicaciones.getNoPag());
         objLibro.setAutor(Autor);
         objLibro.setISBN(ISBN);
         objLibro.setEdicion(edicion);
         Arrpublica.add(objLibro);
    }

   public void desplegar(){
     System.out.println("...OBJETOS EN LA PUBLICACION...");
     
     Iterator<Publicaciones> itrPublica = Arrpublica.iterator();
     while(itrPublica.hasNext()){
         Publicaciones publica = itrPublica.next();
         if (publica instanceof Libro )
         {
          Libro book = (Libro)publica;
          System.out.println("Titulo: " + book.getTitulo());
          System.out.println("ISBN: " + book.getISBN());
          System.out.println("Autor: " + book.getAutor());
         }
         else if (publica instanceof Revista )
         {
          Revista maga = (Revista)publica;
          System.out.println("Titulo: " + maga.getTitulo());
          System.out.println("ISSN: " + maga.getISSN());
          System.out.println("Número : " + maga.getNumero());
          
         } else if(publica instanceof Periodico){
             Periodico pe = (Periodico)publica;
            System.out.println("Titulo: " + pe.getTitulo());
            System.out.println("Editor: " + pe.getEditor());
            System.out.println("Periodicidad : " + pe.getPeriodicidad());
         }
     }
   }
   
    public void alta (String ISSN, int num){
         objRevista = new Revista();
         objRevista.setTitulo(objPublicaciones.getTitulo());
         objRevista.setPrecio(objPublicaciones.getPrecio());
         objRevista.setNoPag(objPublicaciones.getNoPag());
         objRevista.setNumero(num);
         objRevista.setISSN(ISSN);
         Arrpublica.add(objRevista);
    }
    
    public void alta (String periodicidad, String editor){
         objPeriodico = new Periodico();
         objPeriodico.setTitulo(objPublicaciones.getTitulo());
         objPeriodico.setPrecio(objPublicaciones.getPrecio());
         objPeriodico.setNoPag(objPublicaciones.getNoPag());
         objPeriodico.setEditor(editor);
         objPeriodico.setPeriodicidad(periodicidad);
         Arrpublica.add(objPeriodico);
    }
    
    public String getSize(){
        return String.valueOf(Arrpublica.size());
    }
    
    public String getAll(){
        String txt = "";
        Iterator<Publicaciones> itrPublica = Arrpublica.iterator();
        while(itrPublica.hasNext()){
            Publicaciones publica = itrPublica.next();
            if(publica instanceof Libro){
                Libro book = (Libro)publica;
                txt = "LIBRO";
                txt += "\n  Titulo: "+book.getTitulo();
                txt += "\n  Precio: "+book.getPrecio();
                txt += "\n  Numero de paginas: "+book.getNoPag();
                txt += "\n  ISBN: "+book.getISBN();
                txt += "\n  Autor: "+book.getAutor();
                txt += "\n  Edicion: "+book.getEdicion();
                txt += "\n--------------------------------------------------------\n";
            }
            else if (publica instanceof Revista ){
                Revista maga = (Revista)publica;
                txt = "REVISTA";
                txt += "\n  Titulo: "+maga.getTitulo();
                txt += "\n  Precio: "+maga.getPrecio();
                txt += "\n  Numero de paginas: "+maga.getNoPag();
                txt += "\n  ISSN: "+maga.getISSN();
                txt += "\n  Numero: "+maga.getNumero();
                txt += "\n--------------------------------------------------------\n";
                
            }else if(publica instanceof Periodico){
                Periodico pe = (Periodico)publica;
                txt += "PERIODICO";
                txt += "\n  Titulo: "+pe.getTitulo();
                txt += "\n  Precio: "+pe.getPrecio();
                txt += "\n  Numero de paginas: "+pe.getNoPag();
                txt += "\n  Editor: "+pe.getEditor();
                txt += "\n  Periodicidad: "+pe.getPeriodicidad();
                txt += "\n--------------------------------------------------------\n";
         }
        }
        return txt;
    }
}
