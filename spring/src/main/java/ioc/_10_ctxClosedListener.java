package ioc;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.context.event.ContextStoppedEvent;

public class _10_ctxClosedListener implements ApplicationListener<ContextClosedEvent>{

	@Override
	public void onApplicationEvent(ContextClosedEvent event) {
		// TODO Auto-generated method stub
		System.out.println("onClosed event listener");
		
	}
	


}
