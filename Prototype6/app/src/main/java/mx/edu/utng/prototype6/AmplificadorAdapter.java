package mx.edu.utng.prototype6;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Juárez on 19/09/2016.
 */
public class AmplificadorAdapter extends ArrayAdapter<Amplificador> {

        public AmplificadorAdapter(Context context, ArrayList<Amplificador> amplificadors){
            super(context, 0, amplificadors);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            Amplificador amplificador = getItem(position);
            if(convertView==null){
                convertView = LayoutInflater.from(getContext()).inflate(R.layout.layout_amplificador, parent, false);
            }
            TextView txvAmplificador = (TextView)convertView.findViewById(R.id.txv_amplificador);
            txvAmplificador.setText(amplificador.getMarca()+"-"+amplificador.getColor());

            return convertView;
        }
    }
