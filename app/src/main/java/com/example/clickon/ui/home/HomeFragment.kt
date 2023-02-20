import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.clickon.R

class HomeFragment : Fragment() {

    class HomeFragment : Fragment() {
        private lateinit var recyclerView1: RecyclerView
        private lateinit var recyclerView2: RecyclerView
        private lateinit var recyclerView3: RecyclerView
        private lateinit var recyclerView4: RecyclerView

        @SuppressLint("MissingInflatedId")
        override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {
            val view = inflater.inflate(R.layout.fragment_home, container, false)

            recyclerView1 = view.findViewById(R.id.rv_category)
            recyclerView2 = view.findViewById(R.id.rv_banners)
            recyclerView3 = view.findViewById(R.id.rv_assistances)
            recyclerView4 = view.findViewById(R.id.rvMoreAssistances)

            // configura as RecyclerViews aqui
            // ...

            return view
        }

        override fun onResume() {
            super.onResume()

            // limpa e recria as RecyclerViews aqui
            recyclerView1.adapter = null
            recyclerView1.layoutManager = null
            recyclerView1 = RecyclerView(requireContext())
            recyclerView1.layoutParams = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
            )
            (view as ViewGroup).addView(recyclerView1)

            recyclerView2.adapter = null
            recyclerView2.layoutManager = null
            recyclerView2 = RecyclerView(requireContext())
            recyclerView2.layoutParams = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
            )
            (view as ViewGroup).addView(recyclerView2)

            recyclerView3.adapter = null
            recyclerView3.layoutManager = null
            recyclerView3 = RecyclerView(requireContext())
            recyclerView3.layoutParams = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
            )
            (view as ViewGroup).addView(recyclerView3)

            // configura novamente as RecyclerViews aqui
            // ...
        }
    }
}


