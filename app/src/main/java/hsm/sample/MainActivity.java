package hsm.sample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;

import com.lapism.searchview.SearchAdapter;
import com.lapism.searchview.SearchItem;
import com.lapism.searchview.SearchView;

public class MainActivity extends AppCompatActivity {
    SearchView searchView;
    String values[]={"Kerala","Tamilnadu","Karnatka"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        searchView=(SearchView)findViewById(R.id.searhView);
        searchView.setStyle(1);
        searchView.setTheme(1);

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,values);

       // searchView.setAdapter(adapter);







    }

    public void click(View v){
        searchView.showSearch(true);
        searchView.bringToFront();
    }

}
