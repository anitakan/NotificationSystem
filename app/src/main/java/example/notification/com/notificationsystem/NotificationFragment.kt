package example.notification.com.notificationsystem

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

class NotificationFragment : Fragment(){
    private var viewModel : NotificationViewModel? = null
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        viewModel = NotificationViewModel()
        val layoutInflater = LayoutInflater.from(requireContext())
        val view = layoutInflater.inflate(R.layout.fragment_notification, container, false)
        view.findViewById<Button>(R.id.buttonEmail).setOnClickListener(viewModel)
        view.findViewById<Button>(R.id.buttonSMS).setOnClickListener(viewModel)
        return view
    }
}