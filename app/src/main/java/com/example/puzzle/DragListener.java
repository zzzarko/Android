package com.example.puzzle;

import android.media.Image;
import android.view.DragEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

class DragListener implements View.OnDragListener {


    @Override
    public boolean onDrag(View v, DragEvent event) {
        //                     ^             ^
        //                     |             |
        //                     |             |
        //             Gde smo pustili, Odakle smo krenuli
        //Uzmimamo akciju od dogadjaja (event), tipa INT je
        int action = event.getAction();
        // Ako je u pitanju akcija za drop
        if(action==DragEvent.ACTION_DROP){
            // Kreiramo LinearView od lokacije gde smo 'dropovali' dogadjaj event
            // ne mozemo direktno iz event -> LinearLayout vec medju korak mora biti View
            // Event -> View -> LinearLayout
            // krenuliV je View odakle smo krenuli - krenuliV(iew)
            View krenuliV = (View) event.getLocalState();
            // krenuli LinearLayout dobijemo tako sto od krenuliV uzmemo roditelja
            LinearLayout krenuliLL = (LinearLayout) krenuliV.getParent();
            // LinearLayout na kom pustamo, dobijemo odhmah tako sto kastujemo v koji je parametar u metodi
            LinearLayout pustiliLL = (LinearLayout) v;


            // Slika1 je slika LinearLayout-a odakle smo krenuli, LinearLayout ima samo
            // jedan element, pa uzimamo jedino dete na poziciji nula
            ImageView slika1= (ImageView) krenuliLL.getChildAt(0);
            // Slika2 je je slika Layouta gde smo pustili (dropovali)
            ImageView slika2= (ImageView) pustiliLL.getChildAt(0);

            // Brisemo view i sa jednon i sa drugog layout-a, sada su prazni
            krenuliLL.removeViewAt(0);
            pustiliLL.removeViewAt(0);

            // Na layout gde smo krenuli, dodamo sliku layouta gde smo pustili, a to je slika 2
            krenuliLL.addView(slika2);
            // Na layout gde smo pustili, dodamo sliku layouta odakle smo krenuli, a to je slika 1
            pustiliLL.addView(slika1);

            // Sada stavimo da moze da se vidi
            pustiliLL.getChildAt(0).setVisibility(View.VISIBLE);
        }
        return  true;

    }
}
