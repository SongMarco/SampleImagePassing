package nova.sampleImageProcessing;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    Uri imageUri;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void buttonGoClicked(View v){
        Intent intent = new Intent(getApplicationContext(), ImageActivity.class);

        imageUri = Uri.parse("android.resource://nova.sampleimageintent/" + R.drawable.god2);

        Log.v("urilog", imageUri.toString());

        //Toast.makeText(getApplicationContext(), imageUri.toString(), Toast.LENGTH_SHORT).show();



        intent.putExtra("imageUri", imageUri.toString());
        startActivity(intent);
    }




}



