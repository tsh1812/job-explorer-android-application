package info.androidhive.loginandregistration.m_DetailActivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import info.androidhive.loginandregistration.R;
import info.androidhive.loginandregistration.m_UI.PicassoClient;

public class DetailActivity extends AppCompatActivity {

    TextView nameTxt,postsTxt,addressTxt;
    ImageView img;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);

        nameTxt= (TextView) findViewById(R.id.nameTxtDetail);
        postsTxt= (TextView) findViewById(R.id.postsTxtDetail);
        addressTxt= (TextView) findViewById(R.id.addressDetailTxt);
        img= (ImageView) findViewById(R.id.jobsImageDetail);

        //RECEIVE
        Intent i=this.getIntent();
        String name=i.getExtras().getString("NAME_KEY");
        String posts=i.getExtras().getString("POSTS_KEY");
        String address=i.getExtras().getString("ADDRESS_KEY");
        String imageurl=i.getExtras().getString("IMAGEURL_KEY");

        //BIND
        nameTxt.setText(name);
        postsTxt.setText(posts);
        addressTxt.setText(address);
        PicassoClient.downloadImage(this,imageurl,img);


        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

}










