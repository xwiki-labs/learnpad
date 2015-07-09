/*
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package eu.learnpad.core.impl.cw;

import javax.inject.Named;
import javax.ws.rs.Path;

import org.xwiki.component.annotation.Component;
import org.xwiki.rest.XWikiRestComponent;

import eu.learnpad.core.rest.RestResource;
import eu.learnpad.core.rest.XWikiRestUtils;
import eu.learnpad.cw.Controller;
import eu.learnpad.exception.LpRestException;

@Component
@Named("eu.learnpad.core.impl.cw.XwikiController")
@Path("/learnpad/cw/corefacade")
public class XwikiController extends Controller implements XWikiRestComponent {

	public XwikiController() {
		this(false);
	}

	public XwikiController(boolean isBridgeInterfaceLocal) {
		if (isBridgeInterfaceLocal)
			this.bridge = new XwikiBridgeInterface();
		else
			this.bridge = new XwikiBridgeInterfaceRestResource();
	}

	@Override
	public void commentNotification(String modelSetId, String commentId,
			String action) throws LpRestException {
		// TODO Auto-generated method stub

	}

	@Override
	public void resourceNotification(String modelSetId, String resourceId,
			String artifactIds, String action) throws LpRestException {
		// TODO Auto-generated method stub

	}

	@Override
	public byte[] getModel(String modelSetId, String type)
			throws LpRestException {
		String attachmentName = String.format("%s.%s", modelSetId, type);
		return XWikiRestUtils.getAttachment(RestResource.CORE_REPOSITORY_WIKI,
				RestResource.CORE_REPOSITORY_SPACE, modelSetId, attachmentName);
	}
}
