package us.coastalhacking.tutorial.mylyn.monitor.core;

import java.util.logging.Logger;

import org.eclipse.mylyn.monitor.ui.MonitorUi;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;

@Component(service = TutorialProvider.class, immediate = true)
public class TutorialProvider {

	private static final Logger log = Logger.getLogger(TutorialProvider.class.getName());
	private volatile TutorialInteractionEventListener listener;

	@Activate
	void activate() {
		listener = new TutorialInteractionEventListener();
		MonitorUi.addInteractionListener(listener);
		log.info("Added listener to monitor UI");
	}

	@Deactivate
	void deactivate() {
		TutorialInteractionEventListener listener = this.listener;
		if (listener != null) {
			MonitorUi.removeInteractionListener(listener);
			log.info("Removed listener to monitor UI");
		}
	}
}
