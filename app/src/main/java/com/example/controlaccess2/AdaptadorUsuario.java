package com.example.controlaccess2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AdaptadorUsuario extends BaseAdapter
{
    private Context context;
    private ArrayList<Usuario> arrayList;

    public AdaptadorUsuario(Context context, ArrayList<Usuario> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int posicion) {
        return arrayList.get(posicion);
    }

    @Override
    public long getItemId(int posicion) {
        return posicion;
    }

    @Override
    public View getView(int posicion, View view, ViewGroup viewGroup) {

        if(view == null)
        {
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            view = layoutInflater.inflate(R.layout.item_usuario, null);
        }

        TextView nombre=(TextView) view.findViewById(R.id.txtNombre);
        nombre.setText("Nombre:  "+arrayList.get(posicion).getNombre()+" "+arrayList.get(posicion).getAp_paterno()+" "+arrayList.get(posicion).getAp_materno() );
        TextView datos2=(TextView)view.findViewById(R.id.txtdatos2);
        datos2.setText("CI: "+arrayList.get(posicion).getCi()+"       Edad: "+ arrayList.get(posicion).getEdad().toString()+"      Celular: "+ arrayList.get(posicion).getCelular().toString());
        TextView datos3=(TextView)view.findViewById(R.id.txtdatos3);
        datos3.setText("ID: "+arrayList.get(posicion).getId()+"            Correo: "+arrayList.get(posicion).getCorreo()+"                                        Carrera: "+arrayList.get(posicion).getCarrera());
        TextView datosPaq=(TextView)view.findViewById(R.id.txtDatosPaq);
        //datosPaq.setText("Codigo Paquete: "+arrayList.get(posicion).getPaquete().getCod_paq());
        datosPaq.setText("Codigo Paquete: 3");

        //TextView ci=(TextView)view.findViewById(R.id.txtci);
        //ci.setText(arrayList.get(posicion).getCi());
        //TextView edad=(TextView)view.findViewById(R.id.txtEdad);
       // edad.setText(arrayList.get(posicion).getEdad().toString());
        //TextView nfc=(TextView)view.findViewById(R.id.txtNfc);
        //nfc.setText(valornfc);
       // TextView id=(TextView)view.findViewById(R.id.txtId);
       // id.setText(arrayList.get(posicion).getId()+"");
        ImageView foto=(ImageView) view.findViewById(R.id.imgMujer);
        foto.setImageResource(R.drawable.mujer);
        return view;
    }
}

