package com.example.usuario.alladapters;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by usuario on 03/07/2016.
 */
public class RecyclerViewFragment extends Fragment implements View.OnClickListener {

    private OnFragmentInteractionListener mListener;
    TextView textView;
    Button b,b2;
    LayoutInflater inflate;
    RecyclerView recyclerView;
    private LinearLayoutManager linearLayout;
    Context context;

    public RecyclerViewFragment(Context context) {
        // Required empty public constructor
        this.context= context;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.recycler, container, false);

        //My RecyclerView
        inflate=inflater;
        recyclerView = (RecyclerView) rootView.findViewById(R.id.mRecyclerView);
        linearLayout = new LinearLayoutManager(context);
        recyclerView.setLayoutManager(linearLayout);
        recyclerView.setAdapter(new MyRVAdapter());


        textView = (TextView) rootView.findViewById(R.id.titleadapter);
        textView.setText("RecyclerView");
        b = (Button) rootView.findViewById(R.id.add);
        b.setOnClickListener(this);
        b2 = (Button) rootView.findViewById(R.id.show);
        b2.setOnClickListener(this);

        return rootView;
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    //Importante! Aquí no se puede usar el método del "onClick" en xml
    // por que referencia a la Activity y no al fragment!!
    @Override
    public void onClick(View v) {
        if (mListener != null) {
            if (v.getId()==R.id.add){
                    mListener.onFragmentInteraction("1");
                }
            else if(v.getId()==R.id.show){
                mListener.onFragmentInteraction("show");
            }
        }
    }
}
