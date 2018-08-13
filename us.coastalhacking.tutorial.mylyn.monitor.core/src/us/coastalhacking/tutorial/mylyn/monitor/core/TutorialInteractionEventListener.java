package us.coastalhacking.tutorial.mylyn.monitor.core;

import java.util.logging.Logger;

import org.eclipse.mylyn.monitor.core.IInteractionEventListener;
import org.eclipse.mylyn.monitor.core.InteractionEvent;

public class TutorialInteractionEventListener implements IInteractionEventListener {

	private static final Logger log = Logger.getLogger(TutorialInteractionEventListener.class.getName());
	
	@Override
	public void interactionObserved(InteractionEvent event) {
		log.info(event.toString());
	}

	@Override
	public void startMonitoring() {
		// TODO Auto-generated method stub

	}

	@Override
	public void stopMonitoring() {
		// TODO Auto-generated method stub

	}

}
