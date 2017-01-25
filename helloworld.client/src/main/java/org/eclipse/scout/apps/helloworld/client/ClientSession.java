package org.eclipse.scout.apps.helloworld.client;

import org.eclipse.scout.rt.client.AbstractClientSession;
import org.eclipse.scout.rt.client.IClientSession;
import org.eclipse.scout.rt.client.session.ClientSessionProvider;

/**
 * <h3>{@link ClientSession}</h3>
 *
 * @author Matt.Gagliano
 */
public class ClientSession extends AbstractClientSession {

	public ClientSession() {
		super(true);
	}

	/**
	 * @return The {@link IClientSession} which is associated with the current
	 *         thread, or <code>null</code> if not found.
	 */
	public static ClientSession get() {
		return ClientSessionProvider.currentSession(ClientSession.class);
	}

	@Override
	protected void execLoadSession() {		
		setDesktop(new Desktop());
	}
}
