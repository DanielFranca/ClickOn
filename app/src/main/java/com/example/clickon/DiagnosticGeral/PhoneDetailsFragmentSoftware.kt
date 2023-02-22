import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.clickon.R

class PhoneDetailsFragmentSoftware : Fragment() {

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_phonedetails_software, container, false)

        val phoneModel = arguments?.getString(getString(R.string.phone_model)) ?: ""

        val tvPhoneModel = view.findViewById<TextView>(R.id.text_aleatory)
        tvPhoneModel.text = phoneModel

        return view
    }
}
