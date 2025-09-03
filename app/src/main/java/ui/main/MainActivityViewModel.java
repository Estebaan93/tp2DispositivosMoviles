package ui.main;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;



import data.Model.Libro;
import data.repository.LibroRepository;

public class MainActivityViewModel extends AndroidViewModel {
  private MutableLiveData<String> mutableMensaje= new MutableLiveData<>();
  private MutableLiveData<Libro> mutableLibro= new MutableLiveData<>();
  private LibroRepository repo= new LibroRepository();
  public MainActivityViewModel(@NonNull Application application) {
    super(application);
    repo= new LibroRepository();
  }

  public LiveData<String> getMutableMensaje() {
    return mutableMensaje;
  }

  public LiveData<Libro> getMutableLibro() {
    return mutableLibro;
  }

  public void buscar(String titulo){
    if(titulo==null || titulo.trim().isEmpty()){
      mutableMensaje.setValue("Ingresa el titulo para buscar");
      return;
    }
    Libro l= repo.buscarPorTitulo(titulo);
    if(l !=null){
      mutableLibro.setValue(l);
    }else {
      mutableMensaje.setValue("No se encontro el libro");
    }
  }

}
