package cl.fernando.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("MainActivity", "Estamos en el metodo onCreate");
        setContentView(R.layout.activity_main);
        TextView text = findViewById(R.id.mainText);
        int result = calcular("8,9");
        text.setText("El resultado es " + String.valueOf(result));
    }

    // Si recibe el "0", el resultado es 0
    // Si recibe el "1", el resultado es 1
    // Si recibe el "1,2", el resultado es 3
    private int calcular(String numeros){
        Log.d("MainActivity", "Estamos en el metodo calcular");
        if(numeros.isEmpty()){
            return 0;

        }

        String [] num = numeros.split(",");
        int sum = 0;
        for(int i=0; i<num.length; i++){
            sum = sum + Integer.valueOf(num[i]);
        }
        return sum;

    }
}