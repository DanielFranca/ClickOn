import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.clickon.DiagnosticPhone.AddictedBatteryTablet
import com.example.clickon.DiagnosticPhone.BrokenScreenTablet
import com.example.clickon.DiagnosticPhone.SoftwareProblemTablet
import com.example.clickon.R
import com.example.clickon.databinding.FragmentPhoneBinding

class PhoneFragment : Fragment(R.layout.fragment_phone) {

    private lateinit var binding: FragmentPhoneBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentPhoneBinding.bind(view)

        // Adicione um OnClickListener para o primeiro card
        binding.cardView1.setOnClickListener {
            val intent = Intent(activity, BrokenScreenTablet::class.java)
            startActivity(intent)
        }

        // Adicione um OnClickListener para o segundo card
        binding.cardView2.setOnClickListener {
            val intent = Intent(activity, SoftwareProblemTablet::class.java)
            startActivity(intent)
        }

        // Adicione um OnClickListener para o terceiro card
        binding.cardView3.setOnClickListener {
            val intent = Intent(activity, AddictedBatteryTablet::class.java)
            startActivity(intent)
        }

    }
}




