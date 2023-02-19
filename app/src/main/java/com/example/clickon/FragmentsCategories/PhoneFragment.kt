import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.clickon.DiagnosticPhone.*
import com.example.clickon.R
import com.example.clickon.databinding.FragmentPhoneBinding

class PhoneFragment : Fragment(R.layout.fragment_phone) {

    companion object {
        private const val ARG_SELECTED_MODEL = "ARG_SELECTED_MODEL"

        fun newInstance(selectedModel: String): PhoneFragment {
            val fragment = PhoneFragment()
            val args = Bundle()
            args.putString(ARG_SELECTED_MODEL, selectedModel)
            fragment.arguments = args
            return fragment
        }
    }

    private lateinit var binding: FragmentPhoneBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentPhoneBinding.bind(view)

        // Adicione um OnClickListener para o primeiro card
        binding.cardView1.setOnClickListener {
            val intent = Intent(activity, DiagnosticBrokenScreen::class.java)
            startActivity(intent)
        }

        // Adicione um OnClickListener para o segundo card
        binding.cardView2.setOnClickListener {
            val intent = Intent(activity, SoftwareProblem::class.java)
            startActivity(intent)
        }

        // Adicione um OnClickListener para o terceiro card
        binding.cardView3.setOnClickListener {
            val intent = Intent(activity, AddictedBattery::class.java)
            startActivity(intent)
        }

    }
}


