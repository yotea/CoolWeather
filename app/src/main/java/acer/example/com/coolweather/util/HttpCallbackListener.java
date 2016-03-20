package acer.example.com.coolweather.util;

/**
 * Created by acer on 2016/3/20.
 */
public interface HttpCallbackListener {
    void onFinish(String response);

    void onError(Exception e);
}
