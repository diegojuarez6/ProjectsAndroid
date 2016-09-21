package mx.edu.utng.prototype3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Juárez on 11/09/2016.
 */
public class PerroAdapter extends ArrayAdapter<Perro>{

        public PerroAdapter(Context context, ArrayList<Perro> perros){
            super(context, 0, perros);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            Perro perro = getItem(position);
            if(convertView==null){
                convertView = LayoutInflater.from(getContext()).inflate(R.layout.perro_layout, parent, false);
            }
            TextView txvComputadora = (TextView)convertView.findViewById(R.id.txv_perro);
            txvComputadora.setText(perro.getRaza()+"-"+perro.getColor());

            return convertView;
        }
    }
