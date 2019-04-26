package uk.co.massimocarli.bindeventapp

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import uk.co.massimocarli.bindeventapp.databinding.ActivityLayoutBinding

class MainActivity : AppCompatActivity() {

  lateinit var binding: ActivityLayoutBinding

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(
      this,
      R.layout.activity_layout
    )
    binding.handlers = EventHandlers()
  }

  fun buttonPressed(view: View) {
    Toast.makeText(
      this,
      R.string.button_message,
      Toast.LENGTH_SHORT
    ).show()
  }
}
