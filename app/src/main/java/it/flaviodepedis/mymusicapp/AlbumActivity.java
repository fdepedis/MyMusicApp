package it.flaviodepedis.mymusicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class AlbumActivity extends AppCompatActivity {

    // Declare private variable to reference View of the menu bar (menu_bar_2)
    private ImageView imgSearch;
    private ImageView imgFavorite;
    private ImageView imgAlbum;
    private ImageView imgPayment;

    //album_1
    //album_2

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album);

        // Find the View reference
        imgSearch = (ImageView) findViewById(R.id.img_search);
        imgFavorite = (ImageView) findViewById(R.id.img_favorite);
        imgAlbum = (ImageView) findViewById(R.id.img_album);
        imgPayment = (ImageView) findViewById(R.id.img_credit);

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
