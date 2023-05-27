package continentalinvesment.securities.newcostumer;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface UserService {


    @POST("login/")
 Call<LoginResponse> loginuser(@Body LoginRequest loginRequest);


}
