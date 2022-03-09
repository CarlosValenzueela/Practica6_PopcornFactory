package valenzuela.carlos.popcornfactory

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detalle_pelicula.*

class DetallePelicula : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalle_pelicula)
        val bundle = intent.extras ?: return

        var ns = 0;
            ns = bundle.getInt("numberSeats")

        iv_headerPelicula.setImageResource(bundle.getInt("header"))
        tv_tituloPelicula.setText(bundle.getString("titulo") + " --------------------")
        tv_descripcionPelicula.setText(bundle.getString("sinopsis"))
        seatsLeft.setText("$ns seats available")

    if(ns == 0) {
        buyTickets.isActivated = false
    }else{
        buyTickets.setOnClickListener{
            val intent: Intent = Intent (this, SeatSelection::class.java)
        }
    }

    }
}