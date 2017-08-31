package nova.sampleImageProcessing;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;

import java.io.FileNotFoundException;
import java.io.IOException;


public class ImageActivity extends AppCompatActivity {
Bitmap bm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);

        Intent intent = getIntent();

        Uri uri=Uri.parse(intent.getStringExtra("imageUri"));
        Log.v("urilog2323", uri.toString());
        ImageView imgView = (ImageView)findViewById(R.id.bigImage);

        try {
            bm = MediaStore.Images.Media.getBitmap(getContentResolver(), uri);
            imgView.setImageBitmap(bm);

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        imgView.setImageBitmap(bm);

    }

}






