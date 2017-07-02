package shahen.mahmoud.session2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity /* // method 2 implements View.OnClickListener */ {

    Button b1;
    TextView t1;
    Button linearButton, relativeButton, frameButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button) findViewById(R.id.button);
        t1 = (TextView) findViewById(R.id.textView);
        linearButton = (Button) findViewById(R.id.b_linear);
        relativeButton = (Button) findViewById(R.id.b_relative);
        frameButton = (Button) findViewById(R.id.b_frame);
        setListeners();
        //method 1
        //b1.setOnClickListener(new View.OnClickListener() {
        //    @Override
        //   public void onClick(View view) {
        //       t1.setTextColor(getColor(R.color.colorAccent));
        //       Toast.makeText(MainActivity.this, "Changed !", Toast.LENGTH_LONG).show();
        //   }
        //});

        //method 2
      //  b1.setOnClickListener(this);
    }

    //method 2
  /*  @Override
    public void onClick(View view) {
        t1.setTextColor(getColor(R.color.colorAccent));
        Toast.makeText(MainActivity.this, "Changed !", Toast.LENGTH_LONG).show();
    }
    */

    // method 3
  public void buttonClick(View view) {
      if(t1.getCurrentTextColor() == getColor(R.color.colorAccent))
          t1.setTextColor(getColor(R.color.gray));
      else
          t1.setTextColor(getColor(R.color.colorAccent));
      Toast.makeText(MainActivity.this, "Changed !", Toast.LENGTH_SHORT).show();
  }


  public void setListeners() {
      linearButton.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              startActivity(new Intent(MainActivity.this, LinearLayout.class));
          }
      });
      relativeButton.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              startActivity(new Intent(MainActivity.this, RelativeLayout.class));
          }
      });
      frameButton.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              startActivity(new Intent(MainActivity.this, FrameLayout.class));
          }
      });
  }
}
