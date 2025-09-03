package ui.main;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.ViewModelProvider;

import com.example.ui.View.R;
import com.example.ui.View.databinding.ActivityMainBinding;

import data.model.Libro;
import ui.detalle.DetalleActivity;

public class MainActivity extends AppCompatActivity {
  private ActivityMainBinding binding;
  private MainActivityViewModel viewModel;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    EdgeToEdge.enable(this);
    binding= ActivityMainBinding.inflate(getLayoutInflater());

    setContentView(binding.getRoot());
    viewModel= new ViewModelProvider(this).get(MainActivityViewModel.class);

    viewModel.getMutableLibro().observe(this,libro->{
      Intent intent= new Intent(MainActivity.this, DetalleActivity.class);
      intent.putExtra("libro",libro); //Serializable
      startActivity(intent);

    });

    viewModel.getMutableMensaje().observe(this, mensaje -> Toast.makeText(MainActivity.this, mensaje, Toast.LENGTH_SHORT).show());

    binding.btnBuscarLibro.setOnClickListener(buscar->
            viewModel.buscar(binding.etBuscarLibro.getText().toString()));
  }

}