package example.notification.com.notificationsystem

import android.app.IntentService
import android.content.Intent

class NotificationIntentService() : IntentService("Notification") {
    override fun onHandleIntent(p0: Intent?) {
        val intent = Intent(Intent.ACTION_SEND)
        intent.type = "text/html"
        intent.putExtra(Intent.EXTRA_EMAIL, "emailaddress@emailaddress.com")
        intent.putExtra(Intent.EXTRA_SUBJECT, "Subject")
        intent.putExtra(Intent.EXTRA_TEXT, "I'm email body.")
        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
        applicationContext.startActivity(Intent.createChooser(intent, "Send Email"))
    }

}