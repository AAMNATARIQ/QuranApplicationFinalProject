package amnatariq.org.quranapplicationfinalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.io.InputStream;
import java.util.List;

public class d4Further extends AppCompatActivity {

    TextView tvname, tvbio;
    List<ModalClass> userList;

    String jsondata;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d4_further);

        tvname = findViewById(R.id.surahText);
        tvbio= findViewById(R.id.surahType);

        String username = getIntent().getStringExtra("studentName");
        tvname.setText(username);
        String userbio = getIntent().getStringExtra("studentBio");
        tvbio.setText(userbio);


        try{
            InputStream is = getAssets().open("QuranMetaData.json");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            jsondata = new String(buffer,"UTF-8");
            userList.add(new ModalClass(jsondata.toString(),"Meccan"));
        }
        catch(Exception ex)
        {
            System.out.println("Exception occur");
        }
        Gson gson = new Gson();
        Type listType = new TypeToken<List<QuranModel>>(){}.getType();
    }
}