package com.edwindeleon.org.androidagenda.db;

import android.content.Context;

import com.edwindeleon.org.androidagenda.R;
import com.edwindeleon.org.androidagenda.beans.Contacto;
import com.edwindeleon.org.androidagenda.presentadores.IRecyclerViewFragmentPresenter;

import java.util.ArrayList;

/**
 * Created by Fernando de León on 10/01/2018.
 */

public class ConstructorContactos {

    public int idContacto = 0;
    private Context context;

    public ConstructorContactos(Context context){
        this.context = context;
    }

    public ArrayList<Contacto> obtenerDatos(){
        idContacto++;
        ArrayList<Contacto> listaContactos = new ArrayList<>();

        listaContactos.add(new Contacto(idContacto, R.drawable.mt_03, "Juana", "45879639", "juana2016@hotmail.com", 5));
        listaContactos.add(new Contacto(idContacto, R.drawable.mt___r15, "Alan", "45879639", "alan@hotmail.com", 8));
        listaContactos.add(new Contacto(idContacto, R.drawable.mt_03, "Perla", "58968939", "perla@hotmail.com", 6));
        listaContactos.add(new Contacto(idContacto, R.drawable.mt_03, "Juana", "45879639", "juana2016@hotmail.com", 2));
        listaContactos.add(new Contacto(idContacto, R.drawable.mt___r15, "Alan", "45879639", "alan@hotmail.com", 8));
        return listaContactos;
    }
}
