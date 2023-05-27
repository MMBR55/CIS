package continentalinvesment.securities.newcostumer.ui.anadirClienteDatosPersonales;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AñadirClienteDatosPeronalesViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public AñadirClienteDatosPeronalesViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Datos Personales");
    }

    public LiveData<String> getText() {
        return mText;
    }
}