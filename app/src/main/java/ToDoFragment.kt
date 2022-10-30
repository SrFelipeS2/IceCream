import android.os.Bundle
import android.view.AbsSavedState
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.cursomoviles.R

@Suppress("UNREACHABLE_CODE")
class ToDoFragment : Fragment (){

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val fragmento = inflater.inflate(R.layout.fragment_to_do,container,false)

        return fragmento

        val detail1: Button = fragmento.findViewById(R.id.btn_detail_1)
        val detail2: Button = fragmento.findViewById(R.id.btn_detail_2)
        val detail3: Button = fragmento.findViewById(R.id.btn_detail_3)

        detail1.setOnClickListener(View.OnClickListener {
            val datos = Bundle()
            datos.putString("tarea", resources.getString(R.string.text_Print_invoice))
            datos.putString("hora", "10:00")
            datos.putString("lugar", "Kwik-mart")
            activity?.getSupportFragmentManager()?.beginTransaction()
                ?.setReorderingAllowed(true)
                ?.replace(R.id.fragment_container_view,DetailFragment::class.java,datos,"detail")
                ?.addToBackStack("")
                ?.commit()
        })

        detail2.setOnClickListener(View.OnClickListener {
            val datos = Bundle()
            datos.putString("tarea", resources.getString(R.string.text_Place_another_order))
            datos.putString("hora", "15:00")
            datos.putString("lugar", "Taller")
            activity?.getSupportFragmentManager()?.beginTransaction()
                ?.setReorderingAllowed(true)
                ?.replace(R.id.fragment_container_view,DetailFragment::class.java,datos,"detail")
                ?.addToBackStack("")
                ?.commit()
        })

        detail3.setOnClickListener(View.OnClickListener {
            val datos = Bundle()
            datos.putString("tarea", resources.getString(R.string.text_Return))
            datos.putString("hora", "00:00")
            datos.putString("lugar", "Voler")
            activity?.getSupportFragmentManager()?.beginTransaction()
                ?.setReorderingAllowed(true)
                ?.replace(R.id.fragment_container_view,DetailFragment::class.java,datos,"detail")
                ?.addToBackStack("")
                ?.commit()
        })
    }
}