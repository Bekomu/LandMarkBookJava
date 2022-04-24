package com.berkayozisik.landmarkbookjava;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import com.berkayozisik.landmarkbookjava.databinding.ActivityDetailsBinding;
import com.berkayozisik.landmarkbookjava.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class MainActivity extends AppCompatActivity {

    ArrayList<LandMark> LandMarks;
    private ActivityMainBinding binding;

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        LandMarks = new ArrayList<>();

        LandMark pisa = new LandMark(R.drawable.pisa, "Pisa Tower", "Pisa - Italy");
        LandMark eiffel = new LandMark(R.drawable.eiffel, "Eiffel Tower", "Paris - France");
        LandMark londonBridge = new LandMark(R.drawable.londonbridge, "London Bridge", "London - United Kingdom");
        LandMark collesium = new LandMark(R.drawable.collesium, "Collesium", "Rome - Italy");

        LandMarks.add(pisa);
        LandMarks.add(eiffel);
        LandMarks.add(londonBridge);
        LandMarks.add(collesium);

        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        //binding.recyclerView.setLayoutManager(new GridLayoutManager());  // grid görünümü için.

        LandMarkAdapter la = new LandMarkAdapter(LandMarks);
        binding.recyclerView.setAdapter(la);

        // recyclerview
        // yeni bir adapter sınıfı yazıyoruz. LandMarkAdapter sınıfı oluşturduk.




        // listview

        // adapter
           // tek bir adet metin göstermek için simple_list_item_1 yazıyoruz.

        /* listview iptali

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,
                LandMarks.stream().map(landMark -> landMark.name).collect(Collectors.toList())
        );
        binding.listView.setAdapter(adapter);
        // isimler çıkmadı sınıf ve liste ismi + öğe çıktı

        // mapping yapacağız ve isimlerin gelmesini sağlayacağız...
        // üstte LandMarks tan sonra .stream().map(landMark -> landMark.name).collect(Collectors.toList())  yazdık.

        // listview verimsiz. recyclerview e geçiyoruz.

        binding.listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //Toast.makeText(MainActivity.this,  LandMarks.get(i).country, Toast.LENGTH_LONG).show();

                Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
                // formu oluşturduk.
                intent.putExtra("landmark", LandMarks.get(i));
                // forma sınıf, bilgi vs gönderdik.
                startActivity(intent);
                // formu açtık
            }
        });

         */

    }
}