package biz.aplikacje.pogoda;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mContentView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mContentView = (TextView) findViewById(R.id.tv_weather_data);

        String[] weatherNames = Weather.getWeather();

        for (String weatherName : weatherNames) {
            mContentView.append(weatherName + "\n\n\n");
        }
    }
}
final class Weather {
    public static String[] getWeather() {
        return new String[] {
                "Sunny",
                "Cloudy",
                "Mid",
                "Nice",
                "Stormy",
                "Windy",
                "Warm",
                "Cold",
                "Rainy",
                "Misty"

        };
    }
}