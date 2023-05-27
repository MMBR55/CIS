package continentalinvesment.securities.newcostumer;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import continentalinvesment.securities.newcostumer.databinding.FragmentAnadirclientedatosperonalesBinding;
import continentalinvesment.securities.newcostumer.databinding.FragmentDatosBancariosBinding;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link DatosBancarios#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DatosBancarios extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private FragmentDatosBancariosBinding binding;

    public DatosBancarios() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment DatosBancarios.
     */
    // TODO: Rename and change types and number of parameters
    public static DatosBancarios newInstance(String param1, String param2) {
        DatosBancarios fragment = new DatosBancarios();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentDatosBancariosBinding.inflate(inflater, container, false);
        container.clearDisappearingChildren();
        View root = binding.getRoot();
        return root;
    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}