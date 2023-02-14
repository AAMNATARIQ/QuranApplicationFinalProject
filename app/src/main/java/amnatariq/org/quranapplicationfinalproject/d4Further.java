package amnatariq.org.quranapplicationfinalproject;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.InputStream;
import java.lang.reflect.Type;
import java.util.List;

public class d4Further extends AppCompatActivity {

    TextView tvname, tvbio, tvcontent;
    List<ModalClass> userList;
    List<QuranModel> list;

    String jsondata;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d4_further);

        tvname = findViewById(R.id.surahText);
        tvbio= findViewById(R.id.surahType);
        tvcontent = findViewById(R.id.surahContent);

        String sname = getIntent().getStringExtra("sName");
        tvname.setText(sname);
        String stype = getIntent().getStringExtra("sType");
        tvbio.setText(stype);


        try{
            InputStream is = getAssets().open("QuranMetaData.json");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            jsondata = new String(buffer,"UTF-8");
            tvcontent.setText(jsondata.toString());
        }
        catch(Exception ex)
        {
            System.out.println("Exception occur");
        }

        Gson gson = new Gson();
        Type listType = new TypeToken<List<QuranModel>>(){}.getType();

        List<QuranModel> li = gson.fromJson(jsondata,listType);


    }
}