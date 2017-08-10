package it.flaviodepedis.mymusicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class SearchActivity extends AppCompatActivity {

    // Declare private variable to reference View of the menu bar (menu_bar_2)
    private ImageView imgHome;
    private ImageView imgPlay;
    private ImageView imgFavorite;
    private ImageView imgAlbum;
    private ImageView imgPayment;

    private ImageView imgPlaySong;
    private ImageView imgFavoriteSong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        // Find the View reference
        imgHome = (ImageView) findViewById(R.id.img_home);
        imgPlay = (ImageView) findViewById(R.id.img_play);
        imgFavorite = (ImageView) findViewById(R.id.img_favorite);
        imgAlbum = (ImageView) findViewById(R.id.img_album);
        imgPayment = (ImageView) findViewById(R.id.img_credit);

        imgPlaySong = (ImageView) findViewById(R.id.img_play_black);
        imgFavoriteSong = (ImageView) findViewById(R.id.img_favorite_black);

        // Set a event Listener View Home
        imgHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homeIntent = new Intent(SearchActivity.this, MainActivity.class);
                startActivity(homeIntent);
            }
        });

        // Set a event Listener View Play
        imgPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playIntent = new Intent(SearchActivity.this, PlayActivity.class);
                startActivity(playIntent);
            }
        });

        // Set a event Listener View Favorite
        imgFavorite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent favoriteIntent = new Intent(SearchActivity.this, FavoriteActivity.class);
                startActivity(favoriteIntent);
            }
        });

        // Set a event Listener View Album
        imgAlbum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent albumIntent = new Intent(SearchActivity.this, AlbumActivity.class);
                startActivity(albumIntent);
            }
        });

        // Set a event Listener View Payment
        imgPayment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent paymentIntent = new Intent(SearchActivity.this, PaymentActivity.class);
                startActivity(paymentIntent);
            }
        });

        // Set a event Listener View Play Song
        imgPlaySong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playSongIntent = new Intent(SearchActivity.this, PlayActivity.class);
                startActivity(playSongIntent);
            }
        });

        // Set a event Listener View Favorite Song
        imgFavoriteSong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent favoriteSongIntent = new Intent(SearchActivity.this, FavoriteActivity.class);
                startActivity(favoriteSongIntent);
            }
        });
    }
}
