package com.example.logonrm.calculators;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class IMCFragment extends Fragment {


    public IMCFragment() {
        // Required empty public constructor
    }

    public  EditText etAltura;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_imc , container, false);

        etAltura = (EditText) v.findViewById(R.id.etAltura);
        return v;



       // return inflater.inflate(R.layout.fragment_imc, container, false);
    }

}
