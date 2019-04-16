package demolifecycle.deeksha.com.recyclerview.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetroClient {
    private static final String BASE_URL="http://pratikbutani.x10.mx";

    private static Retrofit getRetrofitInstance()
    {
        return new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build(); //builder is a pattern
    }

    public static ApiService getApiService()
    {
        return getRetrofitInstance().create(ApiService.class);
    }
}
