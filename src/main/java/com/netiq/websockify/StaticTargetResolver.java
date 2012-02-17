package com.netiq.websockify;

import java.net.InetSocketAddress;

import org.jboss.netty.channel.ChannelEvent;

public class StaticTargetResolver implements IProxyTargetResolver {
	
	private InetSocketAddress targetAddress; 
	
	public StaticTargetResolver ( String targetHost, int targetPort )
	{
		targetAddress = new InetSocketAddress ( targetHost, targetPort );
	}

	@Override
	public InetSocketAddress resolveTarget(ChannelEvent e) {
		return targetAddress;
	}

}
