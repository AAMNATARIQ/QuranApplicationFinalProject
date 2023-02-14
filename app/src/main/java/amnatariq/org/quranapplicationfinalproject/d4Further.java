package amnatariq.org.quranapplicationfinalproject;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

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


//        try{
//            InputStream is = getAssets().open("QuranMetaData.json");
//            int size = is.available();
//            byte[] buffer = new byte[size];
//            is.read(buffer);
//            is.close();
//            jsondata = new String(buffer,"UTF-8");
//            //tvcontent.setText(jsondata.toString());
//        }
//        catch(Exception ex)
//        {
//            System.out.println("Exception occur");
//        }
//
//        Gson gson = new Gson();
//        Type listType = new TypeToken<List<QuranModel>>(){}.getType();
//
//        List<QuranModel> li = gson.fromJson(jsondata,listType);
//
//        for(int i=0;i<li.size();i++)
//        {
//            tvcontent.setText(li.get(i).toString());
//        }

        String jsonFileString = Utils.getJsonFromAssets(getApplicationContext(), "QuranMetaData.json");
       // Log.i("data", jsonFileString);

        Gson gson = new Gson();
        Type listUserType = new TypeToken<List<QuranModel>>() { }.getType();

        List<QuranModel> users = gson.fromJson(jsonFileString, listUserType);

        for (int i = 0; i < users.size(); i++) {
            //Log.i("data", "> Item " + i + "\n" + users.get(i));
            //tvcontent.setText(users.get(i).toString());
            tvcontent.setText("blahblahblah");
        }

    }
}