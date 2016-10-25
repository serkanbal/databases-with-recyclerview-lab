package ly.generalassemb.drewmahrt.shoppinglistver2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.List;

import ly.generalassemb.drewmahrt.shoppinglistver2.setup.DBAssetHelper;

public class MainActivity extends AppCompatActivity {
    RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //RECYCLERVIEW STUFF
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview);

        //Create the Layout Manager:
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(MainActivity.this,
                LinearLayoutManager.VERTICAL, false);

        //Now that we created; call the layout manager
        mRecyclerView.setLayoutManager(linearLayoutManager);

        //Populate the list.
        List<ItemObject> list = LabSQLiteOpenHelper.getInstance(this).getAllAsList();

        //Set the adapter.
        mRecyclerView.setAdapter(new RecyclerAdapter(list));
        //RECYCLERVIEW STUFF ENDS

        //Ignore the two lines below, they are for setup
        DBAssetHelper dbSetup = new DBAssetHelper(MainActivity.this);
        dbSetup.getReadableDatabase();

        for (ItemObject object:
                list) {
            System.out.println(object.getItemName() + " : " + object.getDescription());

        }
    }
}
