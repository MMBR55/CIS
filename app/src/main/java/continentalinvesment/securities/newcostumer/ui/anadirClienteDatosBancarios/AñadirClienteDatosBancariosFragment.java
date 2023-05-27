package continentalinvesment.securities.newcostumer.ui.anadirClienteDatosBancarios;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import continentalinvesment.securities.newcostumer.databinding.FragmentAnadirclientedatosperonalesBinding;

public class AñadirClienteDatosBancariosFragment extends Fragment {
    private FragmentAnadirclientedatosperonalesBinding binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AñadirClienteDatosBancariosViewModel añadirClienteDatosBancariosViewModel = new ViewModelProvider(this).get(AñadirClienteDatosBancariosViewModel.class);
        binding=FragmentAnadirclientedatosperonalesBinding.inflate(inflater,container,false);
        View root= binding.getRoot();

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
