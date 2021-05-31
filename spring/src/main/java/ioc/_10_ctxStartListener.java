package ioc;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

public class _10_ctxStartListener implements ApplicationListener<ContextStartedEvent>{

	@Override
	public void onApplicationEvent(ContextStartedEvent event) {
		// TODO Auto-generated method stub
		System.out.println("onStarted event listener");
		
	}
	


}
