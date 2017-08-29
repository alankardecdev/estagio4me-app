package com.estagio4me.ui;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.estagio4me.Model.apiEst4Me.Internship;
import com.estagio4me.R;

import java.util.List;

/**
 * Created by alankardec on 29/08/17.
 */

public class InternshipAdapter extends BaseAdapter {

    private final List<Internship> internships;
    private final Activity act;

    public InternshipAdapter(List<Internship> internships, Activity act) {
        this.internships = internships;
        this.act = act;
    }

    @Override
    public int getCount() {
        return internships.size();
    }

    @Override
    public Object getItem(int position) {
        return internships.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = act.getLayoutInflater()
                        .inflate(R.layout.list_internship, parent, false);

        Internship internship = internships.get(position);

        TextView nome = (TextView)
                view.findViewById(R.id.list_internship_name);
        TextView descricao = (TextView)
                view.findViewById(R.id.list_internship_description);


        //populando as Views
        nome.setText(internship.getCompanyName());
        descricao.setText(internship.getDescription());



        return view;
    }
}
