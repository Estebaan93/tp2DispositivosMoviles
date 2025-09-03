package ui.detalle;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;


import com.example.ui.View.databinding.ActivityDetalleBinding;

import data.Model.Libro;

public class DetalleActivity extends AppCompatActivity {
  private ActivityDetalleBinding binding;

  @Override
  protected void onCreate(Bundle savedInstanceState){
    super.onCreate(savedInstanceState);
    EdgeToEdge.enable(this);
    binding= ActivityDetalleBinding.inflate(getLayoutInflater());
    setContentView(binding.getRoot());

    Libro libro= (Libro) getIntent().getSerializableExtra("libro");
    if(libro !=null){
      binding.tvTitulo.setText(libro.getTitulo());
      binding.tvAutor.setText((libro.getAutor()));
      binding.tvAnio.setText(libro.getAnio());
      binding.tvGenero.setText(libro.getGenero());
      binding.tvCategoria.setText(libro.getCategoria());
      binding.tvDescripcion.setText(libro.getDescripcion());
    }
    binding.btnVolver.setOnClickListener(bt-> finish());

  }

}
