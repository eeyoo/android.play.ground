package com.example.feilin.myapplication.fragment;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.NumberPicker;

import com.example.feilin.myapplication.R;
import com.example.feilin.myapplication.dialog.SmileDialog;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by feilin on 2017/10/29.
 */

public class ContentFragment extends Fragment {

    @Bind(R.id.editText)
    EditText editText;
    @Bind(R.id.imageButton)
    ImageButton imageButton;
    @Bind(R.id.listview)
    ListView listView;
//    @Bind(R.id.numberPicker)
//    NumberPicker numberPicker;

    String[] names = {"中国", "美国", "俄罗斯", "澳大利亚", "英国"};

    int index = 0;

    List<String> countries = new ArrayList<>();

    Handler handler;

    //ViewGroup mRoot;


    public ContentFragment() {

    }

    @OnClick({R.id.dialog_a, R.id.dialog_b, R.id.dialog_c})
    public void dialog(final View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());

        int id = view.getId();
        if (id == R.id.dialog_a) {

            //builder.setTitle("标题栏");
            builder.setView(R.layout.layout_dialog_hello);
            builder.setCancelable(false);

            final AlertDialog dialog = builder.create();

            dialog.show();

            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    dialog.dismiss();
                }
            }, 1000);
        } else if (id == R.id.dialog_b) {

//            builder.setView(R.layout.layout_dialog_foo);
//            builder.setTitle("数字拾音器");
//
//            builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
//                @Override
//                public void onClick(DialogInterface dialogInterface, int i) {
//
//                }
//            });
//            builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
//                @Override
//                public void onClick(DialogInterface dialogInterface, int i) {
//
//                }
//            });
//
//
//
//            AlertDialog dialog = builder.create();
//            NumberPicker numberPicker = (NumberPicker) mRoot.findViewById(R.id.numberPicker);
//            numberPicker.setMaxValue(10);
//            numberPicker.setMaxValue(1);
//            numberPicker.setDescendantFocusability(NumberPicker.FOCUS_BLOCK_DESCENDANTS);
//            numberPicker.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
//                @Override
//                public void onValueChange(NumberPicker numberPicker, int i, int i1) {
//                    Snackbar.make(view, "pick number "+i, Snackbar.LENGTH_SHORT).show();
//                }
//            });
            SmileDialog dialog = new SmileDialog(getContext());

            dialog.show();
        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_content, container, false);
        ButterKnife.bind(this, root);

        final ArrayAdapter adapter = new ArrayAdapter(root.getContext(), android.R.layout.simple_list_item_1, countries);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String msg = String.format("%s pos %d", countries.get(i).toString(), i);
                Snackbar.make(view, msg, Snackbar.LENGTH_SHORT).show();
            }
        });

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Snackbar.make(view, "content "+editText.getText(), Snackbar.LENGTH_SHORT).show();

                countries.add(names[index++]);
                if (index > 4)
                    index = 0;
                adapter.notifyDataSetChanged();
            }
        });

        //mRoot = container;
        handler = new Handler();

        return root;
    }
}
