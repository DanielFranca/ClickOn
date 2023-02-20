import android.os.Build.ID

class PhoneItem(private val id: Int, private val phoneName: String, private val brand: String, private val flagImage: Int) {
    fun toInt(): Int{
        return id
    }
    override fun toString(): String {
        return phoneName
    }

    fun getFlagImage(): Int {
        return flagImage
    }

    fun getBrand(): String {
        return brand
    }
}