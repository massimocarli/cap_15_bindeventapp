package uk.co.massimocarli.bindeventapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import uk.co.massimocarli.bindeventapp.databinding.ActivityContainerLayoutBinding

class IncludeActivity : AppCompatActivity() {

  lateinit var binding: ActivityContainerLayoutBinding

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(
      this,
      R.layout.activity_container_layout
    )
    binding.handlers = EventHandlers()
  }
}
