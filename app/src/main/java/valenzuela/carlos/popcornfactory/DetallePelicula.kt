package valenzuela.carlos.popcornfactory

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detalle_pelicula.*

class DetallePelicula : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalle_pelicula)
        val bundle = intent.extras ?: return

        iv_headerPelicula.setImageResource(bundle.getInt("header"))
        tv_tituloPelicula.setText(bundle.getString("titulo") + " --------------------")
        tv_descripcionPelicula.setText(bundle.getString("sinopsis"))
    }
}