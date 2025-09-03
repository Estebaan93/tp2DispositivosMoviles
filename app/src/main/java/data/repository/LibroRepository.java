package data.repository;

import java.util.ArrayList;
import java.util.List;
import com.example.ui.View.R;

import data.model.Libro;

public class LibroRepository {
  private List<Libro> libros= new ArrayList<>();


  public LibroRepository(){
    libros.add(new Libro(
            "Harry Potter y la piedra filosofal",
            "J.K. Rowling",
            "1997",
            223,
            "Fantasia",
            "Juvenil",
            "Harry descubre que es un mago y asiste al colegio Hogwarts, donde vivira increibles aventuras.",
            R.drawable.harry_potter
    ));

    libros.add(new Libro(
            "El Señor de los Anillos: La Comunidad del Anillo",
            "J.R.R. Tolkien",
            "1954",
            423,
            "Fantasaa epica",
            "Aventura",
            "Frodo Bolsón debe destruir el Anillo Unico y emprende un viaje lleno de peligros acompañado por la comunidad del anillo.",
            R.drawable.ic_launcher_background
    ));
    libros.add(new Libro(
            "Percy Jackson y el ladron del rayo",
            "Rick Riordan",
            "2005",
            377,
            "Fantasia",
            "Mitologia",
            "Percy descubre que es hijo de un dios griego y debe emprender una mision para recuperar el rayo de Zeus.",
            R.drawable.percy_jackson
    ));
    libros.add(new Libro(
            "Cazadores de Sombras: Ciudad de Hueso",
            "Cassandra Clare",
            "2007",
            512,
            "Fantasia urbana",
            "Juvenil",
            "Clary Fray se adentra en un mundo oculto de demonios y cazadores de sombras tras presenciar un asesinato sobrenatural.",
            R.drawable.cazadore_de_sombras
    ));
  }

//Coicnidencia parcial con el titulo
  public Libro buscarPorTitulo(String busq){
    if(busq==null) return null;
    String s= busq.trim().toLowerCase();
    if(s.isEmpty()) return null;
    for(Libro l : libros){
      if (l.getTitulo() !=null && l.getTitulo().toLowerCase().contains(s)){
        return l;
      }
    }
    return  null;
  }

}
