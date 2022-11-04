import android.os.Bundle
import android.view.AbsSavedState
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.RecyclerView
import com.example.cursomoviles.MyTaskListAdapter
import com.example.cursomoviles.R


class ToDoFragment : Fragment (){

    private lateinit var listRecyclerView: RecyclerView
    private lateinit var myAdapter:RecyclerView.Adapter<MyTaskListAdapter.MyViewHolder>

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val fragmento = inflater.inflate(R.layout.fragment_to_do,container,false)



/*        val detail1: Button = fragmento.findViewById(R.id.btn_detail_1)
        val detail2: Button = fragmento.findViewById(R.id.btn_detail_2)
        val detail3: Button = fragmento.findViewById(R.id.btn_detail_3)

        detail1.setOnClickListener(View.OnClickListener {
            val datos = Bundle()
            datos.putString("tarea", resources.getString(R.string.text_Print_invoice))
            datos.putString("hora", "10:00 pm")
            datos.putString("lugar", "Thanks for your purchase")
            activity?.getSupportFragmentManager()?.beginTransaction()
                ?.setReorderingAllowed(true)
                ?.replace(R.id.fragment_container_view,DetailFragment::class.java,datos,"detail")
                ?.addToBackStack("")
                ?.commit()
        })

        detail2.setOnClickListener(View.OnClickListener {
            val datos = Bundle()
            datos.putString("tarea", resources.getString(R.string.text_Place_another_order))
            datos.putString("hora", "")
            datos.putString("lugar", "preparing to take your next order")
            activity?.getSupportFragmentManager()?.beginTransaction()
                ?.setReorderingAllowed(true)
                ?.replace(R.id.fragment_container_view,DetailFragment::class.java,datos,"detail")
                ?.addToBackStack("")
                ?.commit()
        })

        detail3.setOnClickListener(View.OnClickListener {
            val datos = Bundle()
            datos.putString("tarea", resources.getString(R.string.text_Return))
            datos.putString("hora", "")
            datos.putString("lugar", "please wait...")
            activity?.getSupportFragmentManager()?.beginTransaction()
                ?.setReorderingAllowed(true)
                ?.replace(R.id.fragment_container_view,DetailFragment::class.java,datos,"detail")
                ?.addToBackStack("")
                ?.commit()
        })*/

        return fragmento
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var myTaskTitles: ArrayList<String> = ArrayList()

        myTaskTitles.add(resources.getString(R.string.text_Print_invoice))
        myTaskTitles.add(resources.getString(R.string.text_Place_another_order))
        myTaskTitles.add(resources.getString(R.string.text_Return))

        var myTaskTimes: ArrayList<String> = ArrayList()
        myTaskTimes.add("10:00 pm")
        myTaskTimes.add("")
        myTaskTimes.add("")

        var myTaskPlaces: ArrayList<String> = ArrayList()
        myTaskPlaces.add("Ice Creame")
        myTaskPlaces.add("Ice Creame")
        myTaskPlaces.add("Ice Creame")

        var info: Bundle = Bundle()
        info.putStringArrayList("titles",myTaskTitles)
        info.putStringArrayList("times",myTaskTimes)
        info.putStringArrayList("places",myTaskPlaces)


        listRecyclerView = requireView().findViewById(R.id.reciclerTodoList)
        myAdapter = MyTaskListAdapter(activity as AppCompatActivity,info)

        listRecyclerView.setHasFixedSize(true)
        listRecyclerView.adapter = myAdapter
        listRecyclerView.addItemDecoration(DividerItemDecoration(context,DividerItemDecoration.VERTICAL))


    }
}