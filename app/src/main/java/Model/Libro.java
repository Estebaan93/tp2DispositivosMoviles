package Model;

public class Libro {
  private String titulo;
  private String autor;
  private String anio;
  private int paginas;
  private String genero;
  private String categoria;
  private String descripcion;


  //Constructor con parametros
  public Libro (String titulo, String autor, String anio, int paginas, String genero, String categoria, String descripcion){
    this.titulo= titulo;
    this.autor= autor;
    this.anio= anio;
    this.paginas= paginas;
    this.genero= genero;
    this.categoria= categoria;
    this.descripcion= descripcion;
  }

  //Constructor vacio
  public Libro(){

  }


  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public String getAutor() {
    return autor;
  }

  public void setAutor(String autor) {
    this.autor = autor;
  }

  public String getAnio() {
    return anio;
  }

  public void setAnio(String anio) {
    this.anio = anio;
  }

  public int getPaginas() {
    return paginas;
  }

  public void setPaginas(int paginas) {
    this.paginas = paginas;
  }

  public String getGenero() {
    return genero;
  }

  public void setGenero(String genero) {
    this.genero = genero;
  }

  public String getCategoria() {
    return categoria;
  }

  public void setCategoria(String categoria) {
    this.categoria = categoria;
  }

  public String getDescripcion() {
    return descripcion;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }
}