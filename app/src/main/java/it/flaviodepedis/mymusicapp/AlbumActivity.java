package it.flaviodepedis.mymusicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class AlbumActivity extends AppCompatActivity {

    // Declare private variable to reference View of the menu bar (menu_bar_2)
    private ImageView imgHome;
    private ImageView imgSearch;
    private ImageView imgFavorite;
    private ImageView imgAlbum;
    private ImageView imgPayment;

    private LinearLayout album_1;
    private LinearLayout album_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album);

        // Find the View reference
        imgHome = (ImageView) findViewById(R.id.img_home);
        imgSearch = (ImageView) findViewById(R.id.img_search);
        imgFavorite = (ImageView) findViewById(R.id.img_favorite);
        imgAlbum = (ImageView) findViewById(R.id.img_album);
        imgPayment = (ImageView) findViewById(R.id.img_credit);

        album_1 = (LinearLayout) findViewById(R.id.album_1);
        album_2 = (LinearLayout) findViewById(R.id.album_2);

        // Set a event listener for LinearLayout album_1
        album_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent alb1 = new Intent(AlbumActivity.this, PlayActivity.class);
                startActivity(alb1);
            }
        });

        // Set a event listener for LinearLayout album_2
        album_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent alb2 = new Intent(AlbumActivity.this, PlayActivity.class);
                startActivity(alb2);
            }
        });

        // Set a event Listener View Home
        imgHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homeIntent = new Intent(AlbumActivity.this, MainActivity.class);
                startActivity(homeIntent);
            }
        });

        // Set a event Listener View Search
        imgSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent searchIntent = new Intent(AlbumActivity.this, SearchActivity.class);
                startActivity(searchIntent);
            }
        });

        // Set a event Listener View Favorite
        imgFavorite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent favoriteIntent = new Intent(AlbumActivity.this, FavoriteActivity.class);
                startActivity(favoriteIntent);
            }
        });

        // Set a event Listener View Album
        imgAlbum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent albumIntent = new Intent(AlbumActivity.this, AlbumActivity.class);
                startActivity(albumIntent);
            }
        });

        // Set a event Listener View Payment
        imgPayment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent paymentIntent = new Intent(AlbumActivity.this, PaymentActivity.class);
                startActivity(paymentIntent);
            }
        });

    }
}
