package com.tabnine.testUtils

import com.intellij.openapi.application.ApplicationManager
import com.tabnine.binary.requests.config.CloudConnectionHealthStatus
import com.tabnine.binary.requests.config.StateResponse
import com.tabnine.lifecycle.BinaryStateChangeNotifier

object HealthCheckTestUtils {
    @JvmStatic
    fun notifyHealthStatus(
        cloudConnectionHealthStatus: CloudConnectionHealthStatus?,
        times: Int
    ) {
        for (i in 0 until times) {
            notifyHealthStatus(cloudConnectionHealthStatus)
        }
    }

    @JvmStatic
    fun notifyHealthStatus(cloudConnectionHealthStatus: CloudConnectionHealthStatus?) {
        ApplicationManager.getApplication()
            .messageBus
            .syncPublisher(BinaryStateChangeNotifier.STATE_CHANGED_TOPIC)
            .stateChanged(StateResponse(null, null, null, cloudConnectionHealthStatus!!))
    }
}
