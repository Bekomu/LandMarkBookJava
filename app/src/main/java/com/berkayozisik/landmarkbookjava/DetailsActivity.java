package com.berkayozisik.landmarkbookjava;

import static com.berkayozisik.landmarkbookjava.MainActivity.chosenLandMark;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;

import com.berkayozisik.landmarkbookjava.databinding.ActivityDetailsBinding;


public class DetailsActivity extends AppCompatActivity {

    // Viewbinding !!! findviewbyid yi kullanmadan...
    private ActivityDetailsBinding binding;
    //build.gradle app içinde gerekli kodu yazıp sync dedik. üsttekini yazdık.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        // aşağıdaki 3 satırı binding için ekledik (sitede var.)
        binding = ActivityDetailsBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        Intent intent = getIntent();
        LandMark selectedLandmark = (LandMark)intent.getSerializableExtra("landmark");

        binding.txtName.setText(selectedLandmark.name);
        binding.txtCountry.setText(selectedLandmark.country);
        binding.imageView.setImageResource(selectedLandmark.image);
    }
}