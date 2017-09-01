package nova.sampleImageProcessing;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import java.io.FileNotFoundException;
import java.io.IOException;


public class ImageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);

        Intent intent = getIntent();

        Uri uri=Uri.parse(intent.getStringExtra("imageUri"));

        ImageView imgView = (ImageView)findViewById(R.id.bigImage);

        setImgViewFromUri(imgView, uri);



    }


    public void setImgViewFromUri(ImageView imgView, Uri uri){

        Bitmap bm = null;
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










