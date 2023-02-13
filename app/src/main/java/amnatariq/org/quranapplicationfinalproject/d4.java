package amnatariq.org.quranapplicationfinalproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class d4 extends AppCompatActivity implements RecyclerViewInterface{

    RecyclerView recyclerView;
    Adapter adapter;

    LinearLayoutManager layoutManager;
    List<ModalClass> userList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d4);

//        recyclerView = findViewById(R.id.recyclerView);
//        adapter = new Adapter(userList, this);
//        recyclerView.setLayoutManager(new LinearLayoutManager(this));
//        recyclerView.setAdapter(adapter);

        initData();
        initRecyclerView();


    }
    private void initData() {

        userList = new ArrayList<>();
        userList.add(new ModalClass("سُورَةُ ٱلْفَاتِحَةِ","Meccan"));
        userList.add(new ModalClass("سُورَةُ البَقَرَةِ","Medinan"));
        userList.add(new ModalClass("سُورَةُ آلِ عِمۡرَانَِ","Medinan"));
        userList.add(new ModalClass("سُورَةُ النِّسَاءِ","Medinan"));
        userList.add(new ModalClass("سُورَةُ المَائـِدَةِ","Medinan"));
        userList.add(new ModalClass("سُورَةُ الأَنۡعَامِ","Meccan"));
        userList.add(new ModalClass("سُورَةُ الأَعۡرَافِ","Meccan"));
        userList.add(new ModalClass("سُورَةُ الأَنفَالِ","Medinan"));
        userList.add(new ModalClass("سُورَةُ التَّوۡبَةِ","Medinan"));
        userList.add(new ModalClass("سُورَةُ يُونُسَ","Meccan"));
        userList.add(new ModalClass("سُورَةُ هُودٍ","Meccan"));
        userList.add(new ModalClass("سُورَةُ يُوسُفَ","Meccan"));
        userList.add(new ModalClass("سُورَةُ الرَّعۡدِ","Medinan"));
        userList.add(new ModalClass("سُورَةُ إِبۡرَاهِيمَ","Meccan"));
        userList.add(new ModalClass("سُورَةُ الحِجۡرَ","Meccan"));
        userList.add(new ModalClass("سُورَةُ النَّحۡلِ","Meccan"));
        userList.add(new ModalClass("سُورَةُ الإِسۡرَاء","Meccan"));
        userList.add(new ModalClass("سُورَةُ الكَهۡفِ","Meccan"));
        userList.add(new ModalClass("سُورَةُ مَرۡيَمَ\nِ","Meccan"));
        userList.add(new ModalClass("سُورَةُ طه\n","Meccan"));
        userList.add(new ModalClass("سُورَةُ الأَنبِيَاءِ\nِ","Meccan"));

        userList.add(new ModalClass("سُورَةُ الحَجِّ\n","Medinan"));
        userList.add(new ModalClass("سُورَةُ المُؤۡمِنُونَ","Meccan"));
        userList.add(new ModalClass("سُورَةُ النُّورِ\n","Medinan"));

        userList.add(new ModalClass("سُورَةُ الفُرۡقَان","Meccan"));
        userList.add(new ModalClass("سُورَةُ الشُّعَرَاءِ","Meccan"));
        userList.add(new ModalClass("سُورَةُ النَّمۡلِ\n","Meccan"));

        userList.add(new ModalClass("سُورَةُ القَصَصِ\n","Meccan"));
        userList.add(new ModalClass("سُورَةُ العَنكَبُوتِ\n","Meccan"));
        userList.add(new ModalClass("سُورَةُ الرُّومِ\n","Meccan"));

        userList.add(new ModalClass("سُورَةُ لُقۡمَانَ\n","Meccan"));
        userList.add(new ModalClass("سُورَةُ السَّجۡدَةِ\n","Meccan"));
        userList.add(new ModalClass("سُورَةُ الأَحۡزَابِ\n","Medinan"));

        userList.add(new ModalClass("سُورَةُ سَبَإٍ\n","Meccan"));
        userList.add(new ModalClass("سُورَةُ فَاطِرٍ","Meccan"));
        userList.add(new ModalClass("سُورَةُ يسٓ","Meccan"));

        userList.add(new ModalClass("سُورَةُ الصَّافَّاتِ\n","Meccan"));
        userList.add(new ModalClass("سُورَةُ صٓ\n","Meccan"));
        userList.add(new ModalClass("سُورَةُ الزُّمَرِ\n","Meccan"));

        userList.add(new ModalClass("سُورَةُ غَافِرٍ\n","Meccan"));
        userList.add(new ModalClass("سُورَةُ فُصِّلَتۡ\n","Meccan"));
        userList.add(new ModalClass("سُورَةُ الشُّورَىٰ\n","Meccan"));

        userList.add(new ModalClass("سُورَةُ الزُّخۡرُفِ\n","Meccan"));
        userList.add(new ModalClass("سُورَةُ الدُّخَانِ\n","Meccan"));

        userList.add(new ModalClass("سُورَةُ الجَاثِيَةِ","Meccan"));

        userList.add(new ModalClass("سُورَةُ الأَحۡقَافِ\n","Meccan"));
        userList.add(new ModalClass("سُورَةُ مُحَمَّدٍ\nِ","Medinan"));
        userList.add(new ModalClass("سُورَةُ الفَتۡحِ\n","Medinan"));

        userList.add(new ModalClass("سُورَةُ الحُجُرَاتِ\n","Medinan"));
        userList.add(new ModalClass("سُورَةُ قٓ\n","Meccan"));
        userList.add(new ModalClass("سُورَةُ الذَّارِيَاتِ\n","Meccan"));

        userList.add(new ModalClass("سُورَةُ الطُّورِ\n","Meccan"));
        userList.add(new ModalClass("سُورَةُ النَّجۡمِ\n","Meccan"));
        userList.add(new ModalClass("سُورَةُ القَمَرِ\n","Meccan"));

        userList.add(new ModalClass("سُورَةُ الرَّحۡمَٰن\n","Medinan"));
        userList.add(new ModalClass("سُورَةُ الوَاقِعَةِ\n","Meccan"));
        userList.add(new ModalClass("سُورَةُ الحَدِيدِ\n","Medinan"));

        userList.add(new ModalClass("سُورَةُ المُجَادلَةِ\n","Medinan"));
        userList.add(new ModalClass("سُورَةُ الحَشۡرِ\n","Medinan"));
        userList.add(new ModalClass("سُورَةُ المُمۡتَحنَةِ\n","Medinan"));

        userList.add(new ModalClass("سُورَةُ الصَّفِّ\n","Medinan"));
        userList.add(new ModalClass("سُورَةُ الجُمُعَةِ\n","Medinan"));
        userList.add(new ModalClass("سُورَةُ المُنَافِقُونَ\n","Medinan"));

        userList.add(new ModalClass("سُورَةُ التَّغَابُنِ\n","Medinan"));
        userList.add(new ModalClass("سُورَةُ الطَّلَاقِ\n","Medinan"));
        userList.add(new ModalClass("سُورَةُ التَّحۡرِيمِ\n","Medinan"));

        userList.add(new ModalClass("سُورَةُ المُلۡكِ\n","Meccan"));
        userList.add(new ModalClass("سُورَةُ القَلَمِ\n","Meccan"));
        userList.add(new ModalClass("سُورَةُ الحَاقَّةِ\n","Meccan"));

        userList.add(new ModalClass("سُورَةُ المَعَارِجِ\n","Meccan"));
        userList.add(new ModalClass("سُورَةُ نُوحٍ\n","Meccan"));
        userList.add(new ModalClass("سُورَةُ الجِنِّ\n","Meccan"));

        userList.add(new ModalClass("سُورَةُ المُزَّمِّلِ\n","Meccan"));
        userList.add(new ModalClass("سُورَةُ المُدَّثِّرِ","Meccan"));
        userList.add(new ModalClass("سُورَةُ القِيَامَةِ\n","Meccan"));

        userList.add(new ModalClass("سُورَةُ الإِنسَانِ\n","Medinan"));
        userList.add(new ModalClass("سُورَةُ المُرۡسَلَاتِ\n","Meccan"));
        userList.add(new ModalClass("سُورَةُ النَّبَإِ\n","Meccan"));
        userList.add(new ModalClass("سُورَةُ النَّازِعَاتِ\n","Meccan"));
        userList.add(new ModalClass("سُورَةُ عَبَسَ\n","Meccan"));
        userList.add(new ModalClass("سُورَةُ التَّكۡوِيرِ\n","Meccan"));

        userList.add(new ModalClass("سُورَةُ الانفِطَارِ\n","Meccan"));
        userList.add(new ModalClass("سُورَةُ المُطَفِّفِينَ\n","Meccan"));
        userList.add(new ModalClass("سُورَةُ الانشِقَاقِ\n","Meccan"));

        userList.add(new ModalClass("سُورَةُ البُرُوجِ\n","Meccan"));
        userList.add(new ModalClass("سُورَةُ الطَّارِقِ\n","Meccan"));
        userList.add(new ModalClass("سُورَةُ الأَعۡلَىٰ\n","Meccan"));

        userList.add(new ModalClass("سُورَةُ الغَاشِيَةِ\n","Meccan"));
        userList.add(new ModalClass("سُورَةُ الفَجۡرِ\n","Meccan"));
        userList.add(new ModalClass("سُورَةُ البَلَدِ\n","Meccan"));

        userList.add(new ModalClass("سُورَةُ الشَّمۡسِ\n","Meccan"));
        userList.add(new ModalClass("سُورَةُ اللَّيۡلِ\n","Meccan"));
        userList.add(new ModalClass("سُورَةُ الضُّحَىٰ\n","Meccan"));

        userList.add(new ModalClass("سُورَةُ الشَّرۡحِ\n","Meccan"));
        userList.add(new ModalClass("سُورَةُ التِّينِ\n","Meccan"));
        userList.add(new ModalClass("سُورَةُ العَلَقِ\n","Meccan"));

        userList.add(new ModalClass("سُورَةُ القَدۡرِ\n","Meccan"));
        userList.add(new ModalClass("سُورَةُ البَيِّنَةِ\n","Medinan"));
        userList.add(new ModalClass("سُورَةُ الزَّلۡزَلَةِ\n","Medinan"));


        userList.add(new ModalClass("سُورَةُ العَادِيَاتِ\n","Meccan"));
        userList.add(new ModalClass("سُورَةُ القَارِعَةِ\n","Meccan"));
        userList.add(new ModalClass("سُورَةُ التَّكَاثُرِ\n","Meccan"));

        userList.add(new ModalClass("سُورَةُ العَصۡرِ\n","Meccan"));
        userList.add(new ModalClass("سُورَةُ الهُمَزَةِ\n","Meccan"));
        userList.add(new ModalClass("سُورَةُ الفِيلِ\n","Meccan"));

        userList.add(new ModalClass("سُورَةُ قُرَيۡشٍ\n","Meccan"));
        userList.add(new ModalClass("سُورَةُ المَاعُونِ\n","Meccan"));
        userList.add(new ModalClass("سُورَةُ الكَوۡثَرِ\n","Meccan"));

        userList.add(new ModalClass("سُورَةُ الكَافِرُونَ\n","Meccan"));
        userList.add(new ModalClass("سُورَةُ النَّصۡرِ\n","Medinan"));
        userList.add(new ModalClass("سُورَةُ المَسَدِ\n","Meccan"));

        userList.add(new ModalClass("سُورَةُ الإِخۡلَاصِ\n","Meccan"));

        userList.add(new ModalClass("سُورَةُ الفَلَقِ\n","Meccan"));
        userList.add(new ModalClass("سُورَةُ النَّاسِ\n","Meccan"));

    }


    private void initRecyclerView() {
        recyclerView = findViewById(R.id.recyclerView);
        adapter = new Adapter(userList, this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();

    }

    @Override
    public void onItemClick(int position) {
        Intent intent=new Intent(this,Surah.class);
        intent.putExtra("sName",userList.get(position).getSurahName());
        intent.putExtra("sType",userList.get(position).getSurahType());
        startActivity(intent);
    }
}