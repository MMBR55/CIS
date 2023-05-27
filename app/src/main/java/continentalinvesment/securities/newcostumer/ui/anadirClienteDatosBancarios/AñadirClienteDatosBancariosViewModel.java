package continentalinvesment.securities.newcostumer.ui.anadirClienteDatosBancarios;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AñadirClienteDatosBancariosViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public AñadirClienteDatosBancariosViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Datos Personales");
    }

    public LiveData<String> getText() {
        return mText;
    }
}

