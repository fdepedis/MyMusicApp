package it.flaviodepedis.mymusicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class PaymentActivity extends AppCompatActivity {

    // Declare private variable to reference View of the menu bar (menu_bar_2)
    private ImageView imgHome;
    private ImageView imgSearch;
    private ImageView imgFavorite;
    private ImageView imgAlbum;
    private ImageView imgPayment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        // Find the View reference
        imgHome = (ImageView) findViewById(R.id.img_home);
        imgSearch = (ImageView) findViewById(R.id.img_search);
        imgFavorite = (ImageView) findViewById(R.id.img_favorite);
        imgAlbum = (ImageView) findViewById(R.id.img_album);
        imgPayment = (ImageView) findViewById(R.id.img_credit);

        // Set a event Listener View Home
        imgHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homeIntent = new Intent(PaymentActivity.this, MainActivity.class);
                startActivity(homeIntent);
            }
        });

        // Set a event Listener View Search
        imgSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent searchIntent = new Intent(PaymentActivity.this, SearchActivity.class);
                startActivity(searchIntent);
            }
        });

        // Set a event Listener View Favorite
        imgFavorite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent favoriteIntent = new Intent(PaymentActivity.this, FavoriteActivity.class);
                startActivity(favoriteIntent);
            }
        });

        // Set a event Listener View Album
        imgAlbum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent albumIntent = new Intent(PaymentActivity.this, AlbumActivity.class);
                startActivity(albumIntent);
            }
        });

        // Set a event Listener View Payment
        imgPayment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent paymentIntent = new Intent(PaymentActivity.this, PaymentActivity.class);
                startActivity(paymentIntent);
            }
        });
    }
}
