package view.com.rxandretrofit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public RxJavaRequest rxJavaRequest;

    public Button button;

    public TextView textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rxJavaRequest=new RxJavaRequest();


        button= (Button) findViewById(R.id.button);
        textview= (TextView) findViewById(R.id.textview);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                HashMap<String,String> map=new HashMap<>();
                map.put("j_username","**********");
                map.put("j_password","******");

                rxJavaRequest.getRequestDatas(map, new RxCallback<List<LoginBean>>() {
                    @Override
                    public void onSuccess(List<LoginBean> loginBeen) {

                        textview.append("onSuccess");
                        textview.append("\n");
                        textview.append(loginBeen.get(0).getMessage());
                    }

                    @Override
                    public void onFails(Throwable t) {

                        textview.append("onFails");
                        textview.append("\n");

                    }
                });

            }
        });


    }
}
