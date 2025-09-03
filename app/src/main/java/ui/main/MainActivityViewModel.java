package ui.main;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;


import data.model.Libro;
import data.repository.LibroRepository;

public class MainActivityViewModel extends AndroidViewModel {
  private MutableLiveData<String> mutableMensaje;//= new MutableLiveData<>();
  private MutableLiveData<Libro> mutableLibro;//= new MutableLiveData<>();
  private LibroRepository repo;//= new LibroRepository();
  public MainActivityViewModel(@NonNull Application application) {
    super(application);
    repo= new LibroRepository();
  }

  public LiveData<String> getMutableMensaje() {
    if(mutableMensaje==null){
      mutableMensaje= new MutableLiveData<>();
    }
    return mutableMensaje;
  }

  public LiveData<Libro> getMutableLibro() {
    if(mutableLibro==null){
      mutableLibro= new MutableLiveData<>();
    }
    return mutableLibro;
  }

  public void buscar(String titulo){
    if(titulo==null || titulo.trim().isEmpty()){
      ((MutableLiveData<String>) getMutableMensaje()).setValue("Ingresa el titulo para buscar");
      return;
    }
    Libro l= repo.buscarPorTitulo(titulo);
    if(l !=null){
      ((MutableLiveData<Libro>) getMutableLibro()).setValue(l);
    }else {
      ((MutableLiveData<String>) getMutableMensaje()).setValue("No se encontro el libro");
    }
  }

}
