package uk.co.massimocarli.bindeventapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import uk.co.massimocarli.bindeventapp.databinding.ActivityCounterBinding

class CounterActivity : AppCompatActivity() {

  lateinit var binding: ActivityCounterBinding
  lateinit var counter: Counter

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(
      this,
      R.layout.activity_counter
    )
    counter = Counter(0)
    binding.incTask = Runnable {
      counter.count++
      binding.counter = counter
    }
    binding.decTask = Runnable {
      counter.count--
      binding.counter = counter
    }
  }
}
