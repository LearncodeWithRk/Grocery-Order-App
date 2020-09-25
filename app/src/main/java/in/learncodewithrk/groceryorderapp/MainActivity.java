package in.learncodewithrk.groceryorderapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button Home,category,login,search_category,shop_showing;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Home = (Button)findViewById(R.id.Home);
        Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent streamIntent = new Intent(MainActivity.this,Home_page.class);
                startActivity(streamIntent);
            }
        });

        category = (Button)findViewById(R.id.category);
        category.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent streamIntent = new Intent(MainActivity.this,category_page.class);
                startActivity(streamIntent);
            }
        });

        login = (Button)findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent streamIntent = new Intent(MainActivity.this,login_page.class);
                startActivity(streamIntent);
            }
        });

        search_category = (Button)findViewById(R.id.search_category);
        search_category.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent streamIntent = new Intent(MainActivity.this,search_category_page.class);
                startActivity(streamIntent);
            }
        });

        shop_showing = (Button)findViewById(R.id.shop_showing);
        shop_showing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent streamIntent = new Intent(MainActivity.this,shop_showing_page.class);
                startActivity(streamIntent);
            }
        });
    }
}