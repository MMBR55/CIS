package continentalinvesment.securities.newcostumer.ui.anadirClienteDatosPersonales;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProvider;

import com.hbb20.CountryCodePicker;

import java.util.Calendar;

import continentalinvesment.securities.newcostumer.DatosBancarios;
import continentalinvesment.securities.newcostumer.MenuInicialActivity;
import continentalinvesment.securities.newcostumer.R;
import continentalinvesment.securities.newcostumer.databinding.FragmentAnadirclientedatosperonalesBinding;
import continentalinvesment.securities.newcostumer.ui.anadirClienteDatosBancarios.AñadirClienteDatosBancariosFragment;
import continentalinvesment.securities.newcostumer.ui.slideshow.SlideshowFragment;

public class AñadirClienteDatosPeronalesFragment extends Fragment implements DatePickerDialog.OnDateSetListener {

    private FragmentAnadirclientedatosperonalesBinding binding;
    private Button fechaNacimiento;
    private Button botonContinuar;
    private int anio,mes,dia;
    private EditText nombres;
    private EditText apellidos;
    private EditText correoelectronico;
    private EditText curp;
    private EditText rfc;
    private EditText calle;
    private EditText numeroext;
    private EditText numeroint;
    private EditText codigopostal;
    private EditText colonia;
    private EditText municipio;
    private EditText estado;
    private String fechanacdato;
    private String pais;
    public Drawable erroricon;
    CountryCodePicker ccp;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        AñadirClienteDatosPeronalesViewModel añadirClienteDatosPeronalesViewModel =
                new ViewModelProvider(this).get(AñadirClienteDatosPeronalesViewModel.class);

        binding = FragmentAnadirclientedatosperonalesBinding.inflate(inflater, container, false);
        View root = binding.getRoot();


        //final TextView textView = binding.textGallery;
        //galleryViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);

        return root;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        fechaNacimiento= binding.mostrarFechaNacimiento;
        botonContinuar= binding.BotonContinuar;
        fechanacdato="";
        nombres= binding.Nombres;
        apellidos= binding.Apellidos;
        correoelectronico= binding.Correo;
        curp= binding.CURP;
        rfc= binding.RFC;
        calle= binding.Calle;
        numeroext= binding.NumeroExt;
        numeroint= binding.NumInt;
        codigopostal= binding.CodigoPostal;
        municipio= binding.Municipio;
        estado= binding.Estado;
        colonia= binding.Colonia;
        ccp= binding.countryCodePicker;
        botonContinuar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*if(validacioninformacioncompleta()){

                }else{

                }*/
                try{

                    Fragment  AnadirDatosBancarios = new DatosBancarios();
                    FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    fragmentTransaction.setReorderingAllowed(true);
                    fragmentTransaction.replace(R.id.app_bar_menu_inicial,AnadirDatosBancarios,null);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();


                }catch (Exception e){
                    System.out.println("error + "+e);
                    Toast.makeText(getContext(), "error + "+e, Toast.LENGTH_LONG).show();
                }

            }
        });
        fechaNacimiento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MostrarFechaNacimientoDialog();
            }
        });
    }

    private boolean validacioninformacioncompleta(){
        boolean  completo=true;
        if(nombres.getText().toString().length()<=0){
            nombres.setError("Ingresa Nombre/s");
            completo=false;
        }
        if(apellidos.getText().toString().length()<=0){
        apellidos.setError("Ingresa Apellido/s");
            completo=false;
        }
        if(correoelectronico.getText().toString().length()<=0){
        correoelectronico.setError("Ingresa Correo Electrónico");
            completo=false;
        }
        if(curp.getText().toString().length()<=0){
        curp.setError("Ingresa CURP");
            completo=false;
        }
        if(rfc.getText().toString().length()<=0){
        rfc.setError("Ingresa RFC");
            completo=false;
        }
        if(calle.getText().toString().length()<=0){
        calle.setError("Ingresa Calle");
            completo=false;
        }
        if(numeroext.getText().toString().length()<=0){
        numeroext.setError("Ingresa Num. Ext.");
            completo=false;
        }
        if(numeroint.getText().toString().length()<=0){
        numeroint.setError("Ingresa Num. Int.");
            completo=false;
        }
        if(codigopostal.getText().toString().length()<=0){
        codigopostal.setError("Ingresa C.P.");
            completo=false;
        }
        if(municipio.getText().toString().length()<=0){
            municipio.setError("Ingresa Municipio");
            completo=false;
        }
        if(colonia.getText().toString().length()<=0){
        colonia.setError("Ingresa Colonia");
            completo=false;
        }
        if(estado.getText().toString().length()<=0){
        estado.setError("Ingresa Estado");
            completo=false;
        }
        if(fechanacdato.equals("")){
            fechaNacimiento.setTextColor(Color.RED);
            fechaNacimiento.setText("elige una fecha");
            completo=false;
        }
        return completo;
    }

    private void MostrarFechaNacimientoDialog(){
        DatePickerDialog datePickerDialog= new DatePickerDialog(
                getContext(),
                        this,
                Calendar.getInstance().get(Calendar.YEAR),
                Calendar.getInstance().get(Calendar.MONTH),
                Calendar.getInstance().get(Calendar.DAY_OF_MONTH)
        );
        datePickerDialog.show();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    @Override
    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
        System.out.println(year);
        System.out.println(month);
        System.out.println(dayOfMonth);
        fechaNacimiento.setText(year+"/"+(month+1)+"/"+dayOfMonth);
        fechaNacimiento.setTextColor(Color.GRAY);
    }
}
/*<com.hbb20.CountryCodePicker
            android:id="@+id/countryCodePicker"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_marginTop="40dp"
            android:layout_marginEnd="20dp"
            app:ccpDialog_keyboardAutoPopup="false"
            app:ccpDialog_showNameCode="false"
            app:ccp_autoDetectLanguage="true"
            app:ccp_defaultNameCode="MX"
            app:ccp_showFullName="true"
            app:ccp_showNameCode="false"
            app:ccp_showPhoneCode="false"
            app:layout_constraintEnd_toEndOf="parent"
            app:layout_constraintTop_toBottomOf="@+id/Municipio" />
*/