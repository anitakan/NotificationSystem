package example.notification.com.notificationsystem

import android.content.Intent
import android.view.View
import android.widget.Toast


class NotificationViewModel : View.OnClickListener {
    override fun onClick(view: View?) {
        val context = view?.context
        if (view?.id == R.id.buttonEmail) {
            val intent = Intent(Intent.ACTION_SEND)
            intent.type = "text/html"
            intent.putExtra(Intent.EXTRA_EMAIL, "emailaddress@emailaddress.com")
            intent.putExtra(Intent.EXTRA_SUBJECT, "Subject")
            intent.putExtra(Intent.EXTRA_TEXT, "text.")
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
            context?.startActivity(Intent.createChooser(intent, "Send Email"))
        } else if (view?.id == R.id.buttonSMS) {
            Toast.makeText(context, "SMS sent", Toast.LENGTH_LONG).show()
        }
    }
}