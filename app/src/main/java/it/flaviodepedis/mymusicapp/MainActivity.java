package it.flaviodepedis.mymusicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    // Declare private variable to reference View of the Mood
    private ImageView imgHipHop;
    private ImageView imgPop;
    private ImageView imgBlues;
    private ImageView imgMetal;
    private ImageView imgRock;
    private ImageView imgRaggae;

    // Declare private variable to reference View of the menu bar (menu_bar_2)
    private ImageView imgSearch;
    private ImageView imgFavorite;
    private ImageView imgAlbum;
    private ImageView imgPayment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View reference
        imgHipHop = (ImageView) findViewById(R.id.img_hiphop);
        imgPop = (ImageView) findViewById(R.id.img_pop);
        imgBlues = (ImageView) findViewById(R.id.img_blues);
        imgMetal = (ImageView) findViewById(R.id.img_metal);
        imgRock = (ImageView) findViewById(R.id.img_rock);
        imgRaggae = (ImageView) findViewById(R.id.img_raggae);

        imgSearch = (ImageView) findViewById(R.id.img_search);
        imgFavorite = (ImageView) findViewById(R.id.img_favorite);
        imgAlbum = (ImageView) findViewById(R.id.img_album);
        imgPayment = (ImageView) findViewById(R.id.img_credit);

        // Set a event Listener View Search
        imgSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent searchIntent = new Intent(MainActivity.this, SearchActivity.class);
                startActivity(searchIntent);
            }
        });

        // Set a event Listener View Favorite
        imgFavorite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent favoriteIntent = new Intent(MainActivity.this, FavoriteActivity.class);
                startActivity(favoriteIntent);
            }
        });

        // Set a event Listener View Album
        imgAlbum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent albumIntent = new Intent(MainActivity.this, AlbumActivity.class);
                startActivity(albumIntent);
            }
        });

        // Set a event Listener View Payment
        imgPayment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent paymentIntent = new Intent(MainActivity.this, PaymentActivity.class);
                startActivity(paymentIntent);
            }
        });

        // Set a event Listener View HipHop
        imgHipHop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hipHopIntent = new Intent(MainActivity.this, AlbumActivity.class);
                startActivity(hipHopIntent);
            }
        });

        // Set a event Listener View Pop
        imgPop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent popIntent = new Intent(MainActivity.this, AlbumActivity.class);
                startActivity(popIntent);
            }
        });

        // Set a event Listener View Blues
        imgBlues.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bluesIntent = new Intent(MainActivity.this, AlbumActivity.class);
                startActivity(bluesIntent);
            }
        });

        // Set a event Listener View Metal
        imgMetal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent metalIntent = new Intent(MainActivity.this, AlbumActivity.class);
                startActivity(metalIntent);
            }
        });

        // Set a event Listener View Rock
        imgRock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent rockIntent = new Intent(MainActivity.this, AlbumActivity.class);
                startActivity(rockIntent);
            }
        });

        // Set a event Listener View Raggae
        imgRaggae.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent raggaeIntent = new Intent(MainActivity.this, AlbumActivity.class);
                startActivity(raggaeIntent);
            }
        });
    }

}
