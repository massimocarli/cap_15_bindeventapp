package uk.co.massimocarli.bindeventapp

import android.view.View
import android.widget.Toast

class EventHandlers {

  fun buttonPressed(view: View) {
    Toast.makeText(
      view.context,
      R.string.button_message,
      Toast.LENGTH_SHORT
    ).show()
  }
}