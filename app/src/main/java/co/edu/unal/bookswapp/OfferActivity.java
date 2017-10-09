package co.edu.unal.bookswapp;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.auth.FirebaseAuth;

/**
 * Created by ivanc on 9/10/2017.
 */

public class OfferActivity extends AppCompatActivity implements View.OnClickListener {

    private FirebaseAuth auth;

    private final String TAG = RegisterActivity.class.getSimpleName();

    private Button registerButton;
    private EditText BookName, Topic, Description;
    private ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_offer);

        auth = FirebaseAuth.getInstance();

        registerButton = (Button) findViewById(R.id.registerButton);

        registerButton.setOnClickListener(this);
        progressDialog = new ProgressDialog(this);
    }

    @Override
    public void onClick(View view) {
        /*if(view == logOutButton) {
            finish();
            startActivity(new Intent(this, LoginActivity.class));
        }
        */
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.options_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.search:
                //finish();
                this.startActivity(new Intent(this, SearchActivity.class));
                return true;
            case R.id.new_offer:
                //finish();
                //startActivity(new Intent(this, OfferActivity.class));
                return true;
            case R.id.my_offer:
                //finish();
                this.startActivity(new Intent(this, MyOfferActivity.class));
                return true;
            case R.id.messages:
                //finish();
                this.startActivity(new Intent(this, MessagesActivity.class));
                return true;
            case R.id.profile:
                //finish();
                this.startActivity(new Intent(this, ProfileActivity.class));
                return true;
            case R.id.quit:
                //finish();
                this.startActivity(new Intent(this, LoginActivity.class));
                return true;
        }
        return false;
    }
}
